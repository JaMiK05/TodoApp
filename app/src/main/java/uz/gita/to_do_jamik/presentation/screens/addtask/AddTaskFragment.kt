package uz.gita.to_do_jamik.presentation.screens.addtask

import android.content.pm.PackageManager
import android.os.*
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.FragmentAddTaskBinding
import uz.gita.to_do_jamik.presentation.dialog.*
import uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel.*
import uz.gita.to_do_jamik.utils.cancelWork
import uz.gita.to_do_jamik.workmanager.startWorker
import java.util.UUID

/**
 *   Created by Jamik on 7/8/2023 ot 12:51 AM
 **/
@AndroidEntryPoint
class AddTaskFragment : Fragment(R.layout.fragment_add_task) {

    private val binding by viewBinding(FragmentAddTaskBinding::bind)
    private val viewmodel: AddTaskViewModel by viewModels<AddTaskViewModelImpl>()
    private var uuid = UUID.randomUUID()

    private val args: AddTaskFragmentArgs by navArgs()

    private var titl = ""
    private var desc = ""

    private val myPermissionRequest =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { }

    private fun requestPermission(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(
                    requireContext(), android.Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                myPermissionRequest.launch(android.Manifest.permission.POST_NOTIFICATIONS)
                return false
            }
        }
        return true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val task = args.task
        if (task != null) {
            titl = task.title
            desc = task.description
            viewmodel.setDate(task.date)
            viewmodel.settime(task.time)
            uuid = task.uuid
            binding.apply {
                title.setText(titl)
                description.setText(desc)
            }
        } else {
            binding.deleteTask.visibility = View.GONE
        }
        binding.apply {
            back.setOnClickListener {
                viewmodel.backToScreen()
            }
            taskdate.setOnClickListener {
                val dateDialog = CalendarDIalog(requireContext(), viewmodel.dateLiveData.value!!)
                dateDialog.show()
                dateDialog.setDateListener {
                    viewmodel.setDate(it)
                }
            }
            tasktime.setOnClickListener {
                val dialog = TimeDialog(requireContext(), viewmodel.timeLiveData.value!!)
                dialog.show()
                dialog.setTimeListener { time ->
                    viewmodel.settime(time)
                }
            }
            btnAddTask.setOnClickListener {
                if (!requestPermission()) return@setOnClickListener
                if (titl.isEmpty() || desc.isEmpty()) {
                    Snackbar.make(
                        binding.root,
                        "Title yoki Description maydonlarini toldirilganligiga ishonch hosil qiling",
                        Snackbar.LENGTH_SHORT
                    ).setBackgroundTint(
                        ContextCompat.getColor(
                            requireContext(), R.color.blue
                        )
                    ).show()
                    return@setOnClickListener
                }

                val id = if (args.task == null) 0 else args.task!!.id
                val date = viewmodel.dateLiveData.value!!
                val time = viewmodel.timeLiveData.value!!
                val data = TaskData(
                    id = id,
                    title = titl,
                    description = desc,
                    date = date,
                    time = time,
                    isWorking = 0,
                    uuid = uuid,
                    icFinish = 0
                )
                val reId = viewmodel.saveWork(task = data)
                startWorker(task = data.copy(id = reId), context = requireContext())
                viewmodel.backToScreen()
            }
            title.doAfterTextChanged {
                titl = it.toString()
            }
            description.doAfterTextChanged {
                desc = it.toString()
            }
            deleteTask.setOnClickListener {
                val dialog = DeleteDialog(requireContext(), args.task!!)
                dialog.setEditListener {
                    viewmodel.deleteTask(it)
                    cancelWork(requireContext(), it.uuid)
                    viewmodel.backToScreen()
                }
                dialog.show()
            }
        }
        viewmodel.dateLiveData.observe(viewLifecycleOwner, dateObserver)
        viewmodel.timeLiveData.observe(viewLifecycleOwner, timeObserver)
    }

    private val dateObserver = Observer<String> { dat ->
        binding.apply {
            date.text = dat
        }
    }
    private val timeObserver = Observer<String> { tim ->
        binding.apply {
            time.text = tim
        }
    }

    /*
            @SuppressLint("NewApi")
            private fun startWorker(): Boolean {
                if (titl.isEmpty() || desc.isEmpty()) {
                    Snackbar.make(
                        binding.root,
                        "Title yoki Description maydonlarini toldirilganligiga ishonch hosil qiling",
                        Snackbar.LENGTH_SHORT
                    ).setBackgroundTint(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.blue
                        )
                    ).show()
                    return false
                }
                val date = binding.date.text.toString()
                val time = binding.time.text.toString()
                titl
                desc
                val userSelectedDateTime = Calendar.getInstance()
                val chosenYear = date.substring(6).toInt()
                val chosenMonth = date.substring(3, 5).toInt()
                val chosenDay = date.substring(0, 2).toInt()
                val chosenHour = time.substring(0, 2).toInt()
                val chosenMin = time.substring(3).toInt()
                userSelectedDateTime.set(
                    chosenYear,
                    chosenMonth,
                    chosenDay,
                    chosenHour,
                    chosenMin
                )
                val todayDateTime = Calendar.getInstance()
                todayDateTime.set(
                    LocalDateTime.now().year,
                    LocalDate.now().monthValue,
                    LocalDateTime.now().dayOfMonth,
                    LocalDateTime.now().hour, LocalDateTime.now().minute
                )

                val delayInSeconds =
                    (userSelectedDateTime.timeInMillis / 1000L) - (todayDateTime.timeInMillis / 1000L)

                val constraint = Constraints.Builder()
                    .build()

                val request = OneTimeWorkRequestBuilder<MyWorker>()
                    .setConstraints(constraint)
                    .setId(uuid)
                    .setInputData(workDataOf("title" to titl, "desc" to desc))
                    .setInitialDelay(delayInSeconds, TimeUnit.SECONDS)
                    .build()

                WorkManager.getInstance(requireContext())
                    .enqueueUniqueWork(
                        uuid.toString(),
                        ExistingWorkPolicy.REPLACE,
                        request
                    )
                return true
            }
        */
}