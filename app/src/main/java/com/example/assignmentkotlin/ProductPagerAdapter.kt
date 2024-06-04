package com.example.assignmentkotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ProductPagerAdapter(fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ProductListFragment()
            1 -> ProductListFragment()
            2 -> ProductListFragment()
            else -> null!!
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}
