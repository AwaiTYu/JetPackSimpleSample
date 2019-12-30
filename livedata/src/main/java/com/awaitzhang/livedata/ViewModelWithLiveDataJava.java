package com.awaitzhang.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author : 张俊杰
 * time    : 2019/12/30
 * desc    : TODO
 */
public class ViewModelWithLiveDataJava extends ViewModel {
    private MutableLiveData<Integer> likeNumber;

    public MutableLiveData<Integer> getLikeNumber() {
        if (likeNumber == null) {
            likeNumber = new MutableLiveData<>();
            likeNumber.setValue(0);
        }
        return likeNumber;
    }

    public void addLikeNumber(int number) {
        likeNumber.setValue(likeNumber.getValue() + number);
    }
}
