package uz.gita.to_do_jamik.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.TaskDeleteDialogBinding

/**
 *   Created by Jamik on 7/10/2023 ot 1:17 AM
 **/
class DeleteDialog(private val context: Context, val task: TaskData) : Dialog(context) {

    private lateinit var binding: TaskDeleteDialogBinding

    private var editListener: ((TaskData) -> Unit)? = null

    fun setEditListener(block: (TaskData) -> Unit) {
        editListener = block
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TaskDeleteDialogBinding.inflate(layoutInflater)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(binding.root)
        binding.btnEdit.setOnClickListener {
            editListener?.invoke(task)
            dismiss()
        }
        binding.btnCancel.setOnClickListener {
            dismiss()
        }
    }
}