package com.example.groceryappprojectcharles.model.remote.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.groceryappprojectcharles.view.fragments.BeefComboFragment
import com.example.groceryappprojectcharles.view.fragments.BeefKabobFragment

class SubCatBeefFragmentAdapter(fm: FragmentManager, private val subCount:Int) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return subCount
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0-> BeefKabobFragment()
            1 -> BeefComboFragment()
            else -> BeefComboFragment()
        }

    }
}