package com.joma.appwitharchitecture.ui.fragments.action

import android.os.Bundle
import android.view.View
import com.joma.appwitharchitecture.base.BaseFragment
import com.joma.appwitharchitecture.databinding.FragmentActionBinding
import com.joma.appwitharchitecture.ui.main.MainActivity

class ActionFragment : BaseFragment<FragmentActionBinding>(FragmentActionBinding::inflate) {
    private lateinit var activity: MainActivity
    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMinus()
        btnPlus()
    }

    private fun btnMinus() {
        binding.btnMinus.setOnClickListener {
            activity.viewModel.minusToCount()
        }
    }

    private fun btnPlus() {
        binding.btnPlus.setOnClickListener {
            activity.viewModel.plusToCount()
        }
    }
}
