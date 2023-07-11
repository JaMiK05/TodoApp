package uz.gita.to_do_jamik.presentation.screens.splash.viewmodel

import android.util.Log
import androidx.lifecycle.*
import kotlinx.coroutines.*
import javax.inject.Inject

/**
 *   Created by Jamik on 7/7/2023 ot 2:18 PM
 **/
class SplashViewModelImpl @Inject constructor() : SplashViewModel, ViewModel() {
    override val liveData = MutableLiveData(false)

    init {
        viewModelScope.launch {
            delay(1500)
            liveData.value = true
        }
    }

}