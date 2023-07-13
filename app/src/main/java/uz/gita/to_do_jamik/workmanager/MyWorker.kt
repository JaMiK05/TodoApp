package uz.gita.to_do_jamik.workmanager

import android.content.Context
import android.os.Vibrator
import androidx.core.content.ContextCompat.getSystemService
import androidx.hilt.work.HiltWorker
import androidx.work.*
import dagger.assisted.*
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao
import uz.gita.to_do_jamik.data.model.TaskData
import java.util.UUID

/**
 *   Created by Jamik on 7/8/2023 ot 4:40 PM
 **/
@HiltWorker
class MyWorker @AssistedInject constructor(
    @Assisted val context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val dao: TaskDao,
) : Worker(context, workerParameters) {
    override fun doWork(): Result {
        val id = inputData.getInt("id", 0)
        val title = inputData.getString("title").toString()
        val desc = inputData.getString("desc").toString()
        val date = inputData.getString("date").toString()
        val time = inputData.getString("time").toString()
        val icwork = inputData.getInt("isWorking", 0)
        val uuid = inputData.getString("uuid").toString()
        val uui = UUID.fromString(uuid)
        val task = TaskData(
            id = id,
            title = title,
            description = desc,
            date = date,
            time = time,
            isWorking = icwork,
            uuid = uui,
            icFinish = 1
        )
        dao.updateTask(task)
        NotificationHelper(context).createNotification(title = title, desc = desc)
        return Result.success()
    }
}