package com.qx.tool

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "Welcome to QX TOOL"
            textSize = 24f
            gravity = Gravity.CENTER
        }
        setContentView(textView)
    }
}