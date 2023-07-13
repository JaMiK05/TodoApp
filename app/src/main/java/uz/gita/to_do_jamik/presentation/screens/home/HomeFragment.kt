package uz.gita.to_do_jamik.presentation.screens.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.FragmentHomeBinding
import uz.gita.to_do_jamik.presentation.adapter.TaskAdapter
import uz.gita.to_do_jamik.presentation.dialog.DeleteDialog
import uz.gita.to_do_jamik.presentation.dialog.NotCompletedDialog
import uz.gita.to_do_jamik.presentation.dialog.TaskEditStatusDialog
import uz.gita.to_do_jamik.presentation.dialog.TaskInfoDialog
import uz.gita.to_do_jamik.presentation.screens.home.viewmodel.HomeViewModel
import uz.gita.to_do_jamik.presentation.screens.home.viewmodel.HomeViewModelImpl
import uz.gita.to_do_jamik.utils.AppObject
import uz.gita.to_do_jamik.utils.cancelWork
import uz.gita.to_do_jamik.utils.navigation.AppNavigator
import uz.gita.to_do_jamik.workmanager.startWorker
import javax.inject.Inject

/**
 *   Created by Jamik on 7/7/2023 ot 4:34 PM
 **/

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var count = 0

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val myAdapter: TaskAdapter by lazy { TaskAdapter() }

    private val viewModel: HomeViewModel by viewModels<HomeViewModelImpl>()

    private var dialogNotComp: NotCompletedDialog? = null

    private val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            requireActivity().finishAffinity()
        }
    }

    private fun adapListener() {
        myAdapter.setUpdatetaskListener {
            viewModel.openUpdateTask(it)
        }

        myAdapter.setCheckedListener { task ->
            val dialog = TaskEditStatusDialog(requireContext(), task.isWorking == 1)
            dialog.show()
            dialog.setEditListener { _ ->
                val work = if (task.isWorking == 0) 1 else 0
                val finish = if (work == 0) 0 else 1
                val taskdata = task.copy(isWorking = work, icFinish = finish)
                if (work == 0) {
                    startWorker(taskdata, requireContext())
                } else {
                    cancelWork(requireContext(), task.uuid)
                }
                viewModel.updateTask(taskdata)
            }
        }

        myAdapter.setItemClickListener {
            val dialog = TaskInfoDialog(requireContext(), it)
            dialog.show()
        }

        myAdapter.setItemLongClickListener { task ->
            val dialog = DeleteDialog(requireContext(), task)
            dialog.setEditListener {
                viewModel.deleteTask(it)
                cancelWork(requireContext(), it.uuid)
            }
            dialog.show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
        viewModel.getNotCompList.observe(viewLifecycleOwner, notcompletedeDial)
        viewModel.tasks.observe(viewLifecycleOwner, tasksObserver)
        viewModel.progres.observe(viewLifecycleOwner, progresObserver)
        adapListener()
        btnProvide()
        binding.apply {
            recycler.apply {
                adapter = myAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }

    private fun btnProvide() {
        binding.apply {
            alltaskbtn.setOnClickListener {
                alltaskbtn.setBackgroundResource(R.drawable.home_category_btn_select)
                completedtaskbtn.setBackgroundResource(R.drawable.home_category_btn)
                uncompletedbtn.setBackgroundResource(R.drawable.home_category_btn)

                viewModel.getTasks(0)
                notTaskTxt.text = requireActivity().getString(R.string.no_task)
            }
            completedtaskbtn.setOnClickListener {
                alltaskbtn.setBackgroundResource(R.drawable.home_category_btn)
                completedtaskbtn.setBackgroundResource(R.drawable.home_category_btn_select)
                uncompletedbtn.setBackgroundResource(R.drawable.home_category_btn)

                viewModel.getTasks(1)
                notTaskTxt.text = requireActivity().getString(R.string.no_completed_task)
            }
            uncompletedbtn.setOnClickListener {
                alltaskbtn.setBackgroundResource(R.drawable.home_category_btn)
                completedtaskbtn.setBackgroundResource(R.drawable.home_category_btn)
                uncompletedbtn.setBackgroundResource(R.drawable.home_category_btn_select)

                viewModel.getTasks(2)
                notTaskTxt.text = requireActivity().getString(R.string.no_incompleted_task)
            }
            taskAdd.setOnClickListener {
                viewModel.openAddTask()
            }
        }
    }

    private val tasksObserver = Observer<List<TaskData>> {
        binding.apply {
            myAdapter.submitList(it)
            if (it.isEmpty()) {
                placeholder.visibility = View.VISIBLE
            } else {
                recycler.visibility = View.VISIBLE
                placeholder.visibility = View.GONE
            }
        }
    }

    private val notcompletedeDial = Observer<List<TaskData>> {
        if (count == 0) {
            count++
            return@Observer
        }
        if (AppObject.InCompletedShow) {
            dialogNotComp = NotCompletedDialog(requireContext())
            dialogNotComp?.setClickItemListener { task ->
                val taskdata = TaskData(
                    id = task.id,
                    title = task.title,
                    description = task.description,
                    date = task.date,
                    time = task.time,
                    isWorking = 1,
                    uuid = task.uuid,
                    icFinish = task.icFinish
                )
                viewModel.updateTask(taskdata)
            }
            dialogNotComp?.setClickBtnListener { list ->
                list.forEach { task ->
                    val taskdata = TaskData(
                        id = task.id,
                        title = task.title,
                        description = task.description,
                        date = task.date,
                        time = task.time,
                        isWorking = 1,
                        uuid = task.uuid,
                        icFinish = task.icFinish
                    )
                    viewModel.updateTask(taskdata)
                }
            }
            dialogNotComp?.show()
        }
        dialogNotComp?.submidList(it)
    }

    private val progresObserver = Observer<Boolean> {
        binding.apply {
            if (it) {
                progres.visibility = View.VISIBLE
                placeholder.visibility = View.GONE
                recycler.visibility = View.GONE
            } else {
                progres.visibility = View.GONE
            }
        }
    }
}