package uz.gita.to_do_jamik.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import uz.gita.to_do_jamik.databinding.DialogChooseTimeBinding
import uz.gita.to_do_jamik.utils.toTime

/**
 *   Created by Jamik on 7/8/2023 ot 3:12 PM
 **/
class TimeDialog(ctx: Context, private val time: String) : Dialog(ctx) {

    private var timeListener: ((String) -> Unit)? = null

    fun setTimeListener(block: (String) -> Unit) {
        timeListener = block
    }

    private lateinit var binding: DialogChooseTimeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DialogChooseTimeBinding.inflate(layoutInflater)
        binding.apply {
            btnCancel.setOnClickListener {
                dismiss()
            }
            spinnerTime.hour = time.toTime()[0].toInt()
            spinnerTime.minute = time.toTime()[1].toInt()
            btnSave.setOnClickListener {
                val hour = binding.spinnerTime.hour
                val minute = binding.spinnerTime.minute
                val hourString = if (hour < 10) "0$hour" else hour
                val minuteString = if (minute < 10) "0$minute" else minute
                timeListener?.invoke("$hourString:$minuteString")
                dismiss()
            }
        }
        setContentView(binding.root)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }


}