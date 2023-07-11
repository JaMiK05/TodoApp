package uz.gita.to_do_jamik.presentation.screens.onboarding

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.databinding.ScreenIntroBinding
import uz.gita.to_do_jamik.presentation.adapter.PageAdapter
import uz.gita.to_do_jamik.presentation.screens.onboarding.OnBoardingFragmentDirections.Companion.actionOnBoardingToHomeFragment
import uz.gita.to_do_jamik.utils.AppObject
import uz.gita.to_do_jamik.utils.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 7/7/2023 ot 3:09 PM
 **/

@AndroidEntryPoint
class OnBoardingFragment : Fragment(R.layout.screen_intro) {

    @Inject
    lateinit var navigator: AppNavigator

    @Inject
    lateinit var shared: SharedPreferences

    private val adapter: PageAdapter by lazy {
        PageAdapter(requireActivity())
    }

    private val binding by viewBinding(ScreenIntroBinding::bind)

    private val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            val current = binding.viewPagerIntro.currentItem
            if (current == 0) {
                requireActivity().finishAffinity()
            } else {
                binding.viewPagerIntro.currentItem = current - 1
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

            viewPagerIntro.adapter = adapter
            viewPagerIntro.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                @SuppressLint("SetTextI18n")
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int,
                ) {
                    if (position == 0) {

                        binding.btnIntroBack.apply {
                            visibility = View.INVISIBLE
                            isEnabled = false
                        }
                    } else {
                        binding.btnIntroBack.apply {
                            visibility = View.VISIBLE
                            isEnabled = true
                        }
                    }
                    if (position == 2) {

                        binding.introNextBtn.apply {
                            text = "Get Started"
                        }
                    } else {

                        binding.introNextBtn.apply {
                            text = "Next"
                        }
                    }
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                }
            })
            introNextBtn.setOnClickListener {
                val current = binding.viewPagerIntro.currentItem
                if (current == 2) {
                    openMain()
                } else binding.viewPagerIntro.currentItem = current + 1
            }
            btnIntroBack.setOnClickListener {
                val current = binding.viewPagerIntro.currentItem
                binding.viewPagerIntro.currentItem = current - 1
            }

        }
    }

    @SuppressLint("CommitPrefEdits")
    private fun openMain() {
        shared.edit().putBoolean(AppObject.obBoard, false).apply()
        runBlocking {
            navigator.navigateTo(actionOnBoardingToHomeFragment())
        }
    }
}