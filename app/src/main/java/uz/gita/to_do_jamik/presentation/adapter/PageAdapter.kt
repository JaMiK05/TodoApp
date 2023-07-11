package uz.gita.to_do_jamik.presentation.adapter

import android.os.Bundle
import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.to_do_jamik.presentation.screens.onboarding.BoardingPages

class PageAdapter(f: FragmentActivity) : FragmentStateAdapter(f) {
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        val introFragment = BoardingPages()

        introFragment.arguments = Bundle().apply {
            putInt("pos", position)
        }

        return introFragment
    }
}