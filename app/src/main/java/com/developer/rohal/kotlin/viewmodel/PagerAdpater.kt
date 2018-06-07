package com.developer.rohal.kotlin.viewmodel

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.developer.rohal.kotlin.Tab1

class MyPagerAdapter(fragmentManager: FragmentManager,var tabCount: Int) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    // Returns total number of pages
    override fun getCount(): Int {
        return tabCount
    }

    // Returns the fragment to display for that page
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> {
                Tab1()
            }
            1 -> {
                Tab1()
            }
            2 -> {
                Tab1()
            }
            else -> null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "Tab1"
            1 -> title = "Tab2"
            2 -> title = "Tab3"
        }
        return title
    }

    companion object {
        private val NUM_ITEMS = 3
    }
}