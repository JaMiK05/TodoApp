package uz.gita.to_do_jamik.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.DialogNotcompletedBinding
import uz.gita.to_do_jamik.presentation.adapter.TaskAdapter
import uz.gita.to_do_jamik.utils.AppObject

/**
 *   Created by Jamik on 7/11/2023 ot 6:30 PM
 **/
class NotCompletedDialog(context: Context) : Dialog(context) {

    private lateinit var binding: DialogNotcompletedBinding

    private val adap: TaskAdapter by lazy { TaskAdapter() }

    private var clickListener: ((TaskData) -> Unit)? = null

    private var allClickListener: ((List<TaskData>) -> Unit)? = null

    fun setClickBtnListener(block: (List<TaskData>) -> Unit) {
        allClickListener = block
    }

    fun setClickItemListener(block: (TaskData) -> Unit) {
        clickListener = block
    }

    fun submidList(list: List<TaskData>) {
        if (list.isEmpty()) {
            dismiss()
        }
        adap.submitList(list)
    }

    private fun adapListener() {
        adap.apply {
            setItemClickListener {
                clickListener?.invoke(it)
            }

            setCheckedListener {
                clickListener?.invoke(it)
            }
            setUpdatetaskListener {
                clickListener?.invoke(it)
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogNotcompletedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppObject.InCompletedShow = false
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        adapListener()
        binding.apply {
            itemrecycler.apply {
                adapter = adap
                layoutManager = LinearLayoutManager(context)
            }
            btnCancel.setOnClickListener {
                dismiss()
            }
            btnAdd.setOnClickListener {
                allClickListener?.invoke(adap.currentList)
                dismiss()
            }
            question.setOnClickListener {
                Toast.makeText(
                    context,
                    "There are tasks mentioned here but not completed. We remind you about these tasks",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}