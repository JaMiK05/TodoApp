package uz.gita.to_do_jamik.presentation.screens.home.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.to_do_jamik.data.model.TaskData

/**
 *   Created by Jamik on 7/7/2023 ot 6:17 PM
 **/
interface HomeViewModel {

    val tasks: LiveData<List<TaskData>>

    val getNotCompList: LiveData<List<TaskData>>

    val progres: LiveData<Boolean>

    fun openUpdateTask(task: TaskData)

    fun openAddTask()

    fun getTasks(pos: Int)

    fun updateTask(task: TaskData)

    fun deleteTask(task: TaskData)
}