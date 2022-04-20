package com.joma.appwitharchitecture.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.joma.appwitharchitecture.ui.fragments.action.ActionFragment
import com.joma.appwitharchitecture.ui.fragments.listOperations.OperationFragment
import com.joma.appwitharchitecture.ui.fragments.result.ResultFragment

class PagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ActionFragment()
            1 -> return ResultFragment()
        }
        return OperationFragment()
    }
}