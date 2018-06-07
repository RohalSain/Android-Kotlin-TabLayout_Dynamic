package com.developer.rohal.kotlin

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import android.view.View
import com.developer.rohal.kotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.developer.rohal.kotlin.viewmodel.LoginViewModel
import com.developer.rohal.kotlin.presenter.Presenter
import android.databinding.adapters.TextViewBindingAdapter.setText
import android.support.annotation.Nullable
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.developer.rohal.kotlin.viewmodel.Pager


class MainActivity : AppCompatActivity() {

    lateinit var bindingObject: ActivityMainBinding
    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingObject = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bindViews()

    }

    private fun bindViews() {
        val tabLayout = bindingObject.tabs

        //tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        //tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        //tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        val adapter = Pager(supportFragmentManager,3)
        pager.offscreenPageLimit = 3
        pager.adapter = adapter
        tabLayout.setupWithViewPager(pager)
        /*
        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                pager.currentItem = 1
            }

        })

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{

            override fun onPageSelected(position: Int) {
                pager.currentItem = position
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        }) */
    }
}
