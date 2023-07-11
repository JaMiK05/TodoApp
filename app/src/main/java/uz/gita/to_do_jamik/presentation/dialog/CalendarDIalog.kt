package uz.gita.to_do_jamik.presentation.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.databinding.DialogCalendarBinding
import uz.gita.to_do_jamik.utils.getCurrentDate
import uz.gita.to_do_jamik.utils.toDate

/**
 *   Created by Jamik on 7/8/2023 ot 10:01 AM
 **/
class CalendarDIalog(private val context: Context, private var date: String) : Dialog(context) {

    private lateinit var binding: DialogCalendarBinding

    private var dateListener: ((String) -> Unit)? = null

    private val currentDate = getCurrentDate()
    private val currentDay =
        (currentDate.toCharArray()[0] + "" + currentDate.toCharArray()[1]).toInt()
    private val currentMonth =
        (currentDate.toCharArray()[3] + "" + currentDate.toCharArray()[4]).toInt()
    private val currentyear =
        (currentDate.toCharArray()[6] + "" + currentDate.toCharArray()[7] + currentDate.toCharArray()[8] + "" + currentDate.toCharArray()[9]).toInt()

    private var day = 0
    private var month = 0
    private var year = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        binding.apply {
            calendarView.date = date.toDate().time
            calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
                val month1 = month + 1
                if (year < currentyear) {
                    Snackbar.make(
                        binding.root,
                        "Siz tanlagan yil ${currentyear - year} yil avval o'tib ketgan",
                        Snackbar.LENGTH_SHORT
                    )
                        .setBackgroundTint(
                            ContextCompat.getColor(
                                context,
                                R.color.blue
                            )
                        )
                        .show()
                    calendarView.date = date.toDate().time
                    return@setOnDateChangeListener
                }
                if (month1 < currentMonth && year == currentyear) {
                    Snackbar.make(
                        binding.root,
                        "Siz tanlagan oy ${currentMonth - month1} oy avval o'tib ketgan",
                        Snackbar.LENGTH_SHORT
                    )
                        .setBackgroundTint(
                            ContextCompat.getColor(
                                context,
                                R.color.blue
                            )
                        )
                        .show()
//                    Toast.makeText(
//                        context,
//                        "Siz tanlagan oy ${currentMonth - month1} oy avval o'tib ketgan",
//                        Toast.LENGTH_SHORT
//                    ).show()
                    calendarView.date = date.toDate().time
                    return@setOnDateChangeListener
                }
                if (dayOfMonth < currentDay && month1 == currentMonth) {
                    Snackbar.make(
                        binding.root,
                        "Siz tanlagan kun ${currentDay - dayOfMonth} kun avval o'tib ketgan",
                        Snackbar.LENGTH_SHORT
                    )
                        .setBackgroundTint(
                            ContextCompat.getColor(
                                context,
                                R.color.blue
                            )
                        )
                        .show()
//                    Toast.makeText(
//                        context,
//                        "Siz tanlagan kun ${currentDay - dayOfMonth} kun avval o'tib ketgan",
//                        Toast.LENGTH_SHORT
//                    ).show()
                    calendarView.date = date.toDate().time
                    return@setOnDateChangeListener
                }
                day = dayOfMonth
                this@CalendarDIalog.month = month
                this@CalendarDIalog.year = year
            }
            btnCancel.setOnClickListener {
                dismiss()
            }
            btnSave.setOnClickListener {
                val builder = StringBuilder()
                val dayS = if (day > 9) "$day" else "0$day"
                month++
                val monthS = if (month > 9) "$month" else "0$month"
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                    builder.append("$dayS.$monthS.$year")
                } else {
                    builder.append("$dayS.$monthS.$year")
                }
                dateListener?.invoke(if (day > 0) builder.toString() else getCurrentDate())
                dismiss()
            }

        }
    }

    fun setDateListener(block: (String) -> Unit) {
        dateListener = block
    }
}