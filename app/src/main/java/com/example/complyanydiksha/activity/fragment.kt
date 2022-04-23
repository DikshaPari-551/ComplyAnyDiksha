package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanydiksha.Fragment.PostFragment
import com.example.complyanydiksha.R

class fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, PostFragment())
            .commit()
    }
}