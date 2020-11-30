package com.example.jitpacktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.girish.toast.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage.display(this)
    }
}