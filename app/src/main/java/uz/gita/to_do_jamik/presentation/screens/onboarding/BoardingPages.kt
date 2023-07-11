package uz.gita.to_do_jamik.presentation.screens.onboarding

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.databinding.PageIntroBinding

/**
 *   Created by Jamik on 7/7/2023 ot 3:12 PM
 **/
class BoardingPages : Fragment(R.layout.page_intro) {

    private val binding by viewBinding(PageIntroBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pos = arguments?.getInt("pos")!!

        binding.apply {
            headerImageIntro.setImageResource(
                when (pos) {
                    0 -> R.drawable.ic_intro1
                    1 -> R.drawable.ic_intro2
                    else -> R.drawable.ic_intro3
                }
            )
            tvIntroTitle.text = resources.getStringArray(R.array.intro_titles)[pos]
            tvIntroDescription.text = resources.getStringArray(R.array.intro_subtitles)[pos]
        }

    }

}