package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class DemoActivity : AppCompatActivity() {
    lateinit var backHelpDemo:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        backHelpDemo = findViewById(R.id.backHelpDemo)
        backHelpDemo.setOnClickListener{
            onBackPressed()
        }
    }
    override fun onBackPressed() {
        finish()
    }

}