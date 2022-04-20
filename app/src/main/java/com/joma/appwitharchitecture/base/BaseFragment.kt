package com.joma.appwitharchitecture.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: (inflate: LayoutInflater) -> VB
) : Fragment() {
    private var _binding: VB? = null
    protected val binding: VB
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initView()
        setupObservers()
        initListener()
        _binding = inflate.invoke(layoutInflater)
        return binding.root
    }

    open fun initListener() {

    }

    abstract fun initView()

    open fun setupObservers() {

    }
}