package uz.gita.to_do_jamik.presentation.screens.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.domain.repository.TaskRepository
import uz.gita.to_do_jamik.presentation.screens.addtask.AddTaskFragment
import uz.gita.to_do_jamik.presentation.screens.home.HomeFragmentDirections
import uz.gita.to_do_jamik.utils.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 7/7/2023 ot 6:17 PM
 **/
@HiltViewModel
class HomeViewModelImpl @Inject constructor(
    private val repository: TaskRepository,
    private val navigator: AppNavigator,
) : HomeViewModel, ViewModel() {

    override val tasks = MutableLiveData<List<TaskData>>(listOf())
    override val getNotCompList = MutableLiveData<List<TaskData>>(listOf())

    override val progres = MutableLiveData(true)

    override fun openUpdateTask(task: TaskData) {
        viewModelScope.launch {
            navigator.navigateTo(HomeFragmentDirections.actionHomeFragmentToAddTaskFragment(task = task))
        }
    }

    override fun openAddTask() {
        viewModelScope.launch {
            navigator.navigateTo(HomeFragmentDirections.actionHomeFragmentToAddTaskFragment(null))
        }
    }

    init {
        repository.getInCompletedTask().onEach {
            val res = ArrayList<TaskData>()
            it.forEach { task ->
                if (task.icFinish == 1) {
                    res.add(task)
                }
            }
            getNotCompList.value = res
        }.launchIn(viewModelScope)
        getTasks(0)
    }

    override fun getTasks(pos: Int) {
        when (pos) {
            0 -> {
                progres.value = true
                repository.getAllTasks().onEach {
                    tasks.value = it
                    progres.value = false
                }.launchIn(viewModelScope)
            }

            1 -> {
                progres.value = true
                repository.getCompletedTask().onEach {
                    tasks.value = it
                    progres.value = false
                }.launchIn(viewModelScope)
            }

            else -> {
                progres.value = true
                repository.getInCompletedTask().onEach {
                    tasks.value = it
                    progres.value = false
                }.launchIn(viewModelScope)
            }
        }
    }

    override fun updateTask(task: TaskData) {
        Log.d("YYY", task.title)
        repository.updateTask(task)
    }

    override fun deleteTask(task: TaskData) {
        repository.deleteTask(task)
    }
}