package com.joma.appwitharchitecture.ui.fragments.result

import com.joma.appwitharchitecture.base.BaseFragment
import com.joma.appwitharchitecture.databinding.FragmentResultBinding
import com.joma.appwitharchitecture.ui.main.MainActivity

class ResultFragment : BaseFragment<FragmentResultBinding>(FragmentResultBinding::inflate) {
    private lateinit var activity: MainActivity
    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun setupObservers() {
        super.setupObservers()
        activity.viewModel.count.observe(viewLifecycleOwner, {
            binding.tvResult.text = it.toString()
        })
    }
}
