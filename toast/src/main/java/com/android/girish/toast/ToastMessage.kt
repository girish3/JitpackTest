package com.android.girish.toast

import android.content.Context
import android.widget.Toast

object ToastMessage {

    fun display(context: Context) {
        Toast.makeText(context, "This is release library", Toast.LENGTH_LONG).show()
    }
}