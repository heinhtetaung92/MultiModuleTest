package com.yoshi.rewards

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel
    @Inject constructor(): ViewModel() {
    fun showToast(context: Context) {
        Toast.makeText(context, "This is sample ViewModel", Toast.LENGTH_SHORT).show()
    }
}