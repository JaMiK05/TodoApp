package uz.gita.to_do_jamik.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.to_do_jamik.data.model.TaskData

/**
 *   Created by Jamik on 7/6/2023 ot 5:20 PM
 **/
interface TaskRepository {

    fun insertTask(task: TaskData): Int

    fun deleteTask(task: TaskData)

    fun updateTask(task: TaskData)

    fun getAllTasks(): Flow<List<TaskData>>

    fun getCompletedTask(): Flow<List<TaskData>>

    fun getInCompletedTask(): Flow<List<TaskData>>

}