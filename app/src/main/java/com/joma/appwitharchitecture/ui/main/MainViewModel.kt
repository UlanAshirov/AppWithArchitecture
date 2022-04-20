package com.joma.appwitharchitecture.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = MutableLiveData<Int>()
    private var a = 0
    var liveData = MutableLiveData<Boolean>()

    fun plusToCount() {
    a++
        count.value = a
        liveData.value = true
    }

    fun minusToCount() {
       a--
        count.value = a
        liveData.value = false
    }
}