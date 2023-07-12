package uz.gita.to_do_jamik.presentation.screens.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.to_do_jamik.R

public class OnBoardingFragmentDirections private constructor() {
  public companion object {
    public fun actionOnBoardingToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_onBoarding_to_homeFragment)
  }
}
