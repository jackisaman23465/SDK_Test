package com.example.sdk_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtoast.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast().ToastString(this)
    }
}