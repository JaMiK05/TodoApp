package uz.gita.to_do_jamik.presentation.screens.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.to_do_jamik.R

public class AppSplashFragmentDirections private constructor() {
  public companion object {
    public fun actionAppSplashFragmentToOnBoarding(): NavDirections =
        ActionOnlyNavDirections(R.id.action_appSplashFragment_to_onBoarding)

    public fun actionAppSplashFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_appSplashFragment_to_homeFragment)
  }
}
