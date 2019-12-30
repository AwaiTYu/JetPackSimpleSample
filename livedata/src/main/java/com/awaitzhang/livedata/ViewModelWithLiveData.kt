package com.awaitzhang.livedata

import androidx.annotation.IntegerRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

/**
 *    @author : 张俊杰
 *    time    : 2019/12/30
 *    desc    : ViewModel 和 LiveData
 */
class ViewModelWithLiveData : ViewModel() {
    private var likeNumber: MutableLiveData<Int>? = null

    fun getLikeNumber(): MutableLiveData<Int> {
        if (likeNumber == null) {
            likeNumber = MutableLiveData()
            likeNumber!!.value = 0
        }
        return likeNumber!!
    }

    fun addNumber(number: Int) {
        likeNumber!!.value = likeNumber!!.value!!.plus(number)
    }
}