package uz.gita.to_do_jamik.workmanager

import android.annotation.SuppressLint
import android.content.Context
import androidx.work.*
import uz.gita.to_do_jamik.data.model.TaskData
import java.time.*
import java.util.Calendar
import java.util.concurrent.TimeUnit

/**
 *   Created by Jamik on 7/11/2023 ot 2:14 PM
 **/

@SuppressLint("NewApi")
public fun startWorker(task: TaskData, context: Context) {
    val date = task.date
    val time = task.time
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
        .setId(task.uuid)
        .setInputData(
            workDataOf(
                "id" to task.id,
                "title" to task.title,
                "desc" to task.description,
                "date" to task.date,
                "time" to task.time,
                "isWorking" to task.isWorking,
                "uuid" to task.uuid.toString(),
                "icFinish" to task.icFinish
            )
        )
        .setInitialDelay(delayInSeconds, TimeUnit.SECONDS)
        .build()

    WorkManager.getInstance(context)
        .enqueueUniqueWork(
            task.uuid.toString(),
            ExistingWorkPolicy.REPLACE,
            request
        )
}