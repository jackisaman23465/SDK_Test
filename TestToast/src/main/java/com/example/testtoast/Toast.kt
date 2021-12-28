package com.example.testtoast

import android.content.Context
import android.widget.Toast

class Toast {
    fun ToastString(context: Context){
        Toast.makeText(context,"有了!",Toast.LENGTH_LONG).show()
    }
}