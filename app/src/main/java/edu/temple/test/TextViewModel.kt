package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    private val size = MutableLiveData<Float>()

    fun setSelectedText(textSize: Float) {
        this.size.value = textSize
    }

    fun getSelectedText() : LiveData<Float> {
        return size
    }

}