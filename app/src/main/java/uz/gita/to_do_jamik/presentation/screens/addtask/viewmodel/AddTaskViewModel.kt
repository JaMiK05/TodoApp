package uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.to_do_jamik.data.model.TaskData

/**
 *   Created by Jamik on 7/8/2023 ot 8:46 AM
 **/
interface AddTaskViewModel {

    fun backToScreen()

    fun setDate(date: String)

    fun settime(time: String)

    fun saveWork(task: TaskData): Int

    fun deleteTask(task: TaskData)

    val dateLiveData: LiveData<String>

    val timeLiveData: LiveData<String>

}