package uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.domain.repository.TaskRepository
import uz.gita.to_do_jamik.utils.getCurrentDate
import uz.gita.to_do_jamik.utils.getCurrentTime
import uz.gita.to_do_jamik.utils.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 7/8/2023 ot 8:46 AM
 **/
@HiltViewModel
class AddTaskViewModelImpl @Inject constructor(
    private val repository: TaskRepository,
    private val navigator: AppNavigator,
) : AddTaskViewModel, ViewModel() {

    override fun backToScreen() {
        viewModelScope.launch {
            navigator.back()
        }
    }

    override val dateLiveData = MutableLiveData(getCurrentDate())

    override val timeLiveData = MutableLiveData(getCurrentTime())

    override fun setDate(date: String) {
        dateLiveData.value = date
    }

    override fun settime(time: String) {
        timeLiveData.value = time
    }

    override fun saveWork(task: TaskData): Int {
        return repository.insertTask(task = task)
    }

    override fun deleteTask(task: TaskData) {
        repository.deleteTask(task)
    }

}