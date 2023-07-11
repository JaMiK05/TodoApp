package uz.gita.to_do_jamik.domain.repository

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.*
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao
import uz.gita.to_do_jamik.data.model.TaskData
import javax.inject.Inject

/**
 *   Created by Jamik on 7/6/2023 ot 5:20 PM
 **/
class TaskRepositoryImpl @Inject constructor(
    private val dao: TaskDao,
) : TaskRepository {

    private val scope = CoroutineScope(Job() + Dispatchers.IO)

    override fun insertTask(task: TaskData): Int {
        val id = dao.insertTask(task)
        return id.toInt()
    }

    override fun deleteTask(task: TaskData) = dao.deleteTask(task)

    override fun updateTask(task: TaskData) {
        Log.d("TTT", task.isWorking.toString())
        dao.updateTask(task)
    }

    override fun getAllTasks(): Flow<List<TaskData>> = dao.getALLTasks().flowOn(Dispatchers.IO)

    override fun getCompletedTask(): Flow<List<TaskData>> =
        dao.getCompletedTasks().flowOn(Dispatchers.IO)

    override fun getInCompletedTask(): Flow<List<TaskData>> =
        dao.getNotCompletedTasks().flowOn(Dispatchers.IO)

}