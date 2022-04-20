package com.joma.appwitharchitecture.ui.main

import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.joma.appwitharchitecture.base.BaseActivity
import com.joma.appwitharchitecture.databinding.ActivityMainBinding

val fragmentList = arrayOf("action", "result", "operations")

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun initView() {
        val adapter = PagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        initTab()
    }

    private fun initTab() {
        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            tab.text = fragmentList[position]
        }.attach()
    }
}