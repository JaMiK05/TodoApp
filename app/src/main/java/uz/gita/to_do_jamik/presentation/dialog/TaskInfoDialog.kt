package uz.gita.to_do_jamik.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.DialogInfoTaskBinding

/**
 *   Created by Jamik on 7/10/2023 ot 9:46 PM
 **/
class TaskInfoDialog(context: Context, private val task: TaskData) : Dialog(context) {

    private lateinit var binding: DialogInfoTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogInfoTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        binding.apply {
            title.text = task.title
            desc.text = task.description
            date.text = task.date
            time.text = task.time
            btnCancel.setOnClickListener {
                dismiss()
            }
        }
    }
}