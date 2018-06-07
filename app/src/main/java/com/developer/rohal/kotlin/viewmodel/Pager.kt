package com.developer.rohal.kotlin.viewmodel

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.developer.rohal.kotlin.Tab1


class Pager(fm: FragmentManager,var tabCount: Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> {
                return Tab1()
            }
            1 -> {
                return Tab1()
            }
            2 -> {
                return Tab1()
            }
            else -> return null
        }
    }
    override fun getCount(): Int {
        return tabCount
    }
    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "Court A"
            1 -> title = "Court B"
            2 -> title = "Court C"
        }
        return title
    }
}