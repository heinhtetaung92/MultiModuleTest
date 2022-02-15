package com.yoshi.core

import android.content.Context
import android.widget.Toast

class SampleProvider(val context: Context) {

    fun showToast(str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }

}