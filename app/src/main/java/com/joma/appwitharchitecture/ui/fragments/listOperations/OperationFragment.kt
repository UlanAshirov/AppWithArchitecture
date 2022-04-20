package com.joma.appwitharchitecture.ui.fragments.listOperations

import com.joma.appwitharchitecture.base.BaseFragment
import com.joma.appwitharchitecture.databinding.FragmentOperationBinding
import com.joma.appwitharchitecture.ui.main.MainActivity

class OperationFragment :
    BaseFragment<FragmentOperationBinding>(FragmentOperationBinding::inflate) {
    private lateinit var activity: MainActivity
    private var countOperationPlus = 0
    private var countOperationMinus = 0

    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun setupObservers() {
        super.setupObservers()
        activity.viewModel.liveData.observe(viewLifecycleOwner, {
            if (it) {
                countOperationPlus++
            } else {
                countOperationMinus++
            }
            val text = "plus = $countOperationPlus \nminus = $countOperationMinus"
            binding.tvOperationList.text = text
        })
    }
}