package uz.gita.to_do_jamik.presentation.screens.splash

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.*
import androidx.lifecycle.Observer
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.databinding.FragmentSplashBinding
import uz.gita.to_do_jamik.presentation.screens.splash.AppSplashFragmentDirections.Companion.actionAppSplashFragmentToHomeFragment
import uz.gita.to_do_jamik.presentation.screens.splash.AppSplashFragmentDirections.Companion.actionAppSplashFragmentToOnBoarding
import uz.gita.to_do_jamik.presentation.screens.splash.viewmodel.*
import uz.gita.to_do_jamik.utils.AppObject
import uz.gita.to_do_jamik.utils.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 7/7/2023 ot 2:11 PM
 **/
@AndroidEntryPoint
class AppSplashFragment : Fragment(R.layout.fragment_splash) {

    @Inject
    lateinit var navigator: AppNavigator

    @Inject
    lateinit var shared: SharedPreferences

    private val binding by viewBinding(FragmentSplashBinding::bind)
    private val viewModel: SplashViewModel by viewModels<SplashViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.liveData.observe(this, observer)
    }

    private val observer = Observer<Boolean> {
        if (it) {
            runBlocking {
                if (shared.getBoolean(AppObject.obBoard, true)) {
                    navigator.navigateTo(actionAppSplashFragmentToOnBoarding())
                } else {
                    navigator.navigateTo(actionAppSplashFragmentToHomeFragment())
                }
            }
        }
    }
}