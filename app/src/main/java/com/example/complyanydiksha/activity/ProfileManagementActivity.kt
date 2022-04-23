package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.complyanydiksha.R

class ProfileManagementActivity : AppCompatActivity() {
    lateinit var profile:TextView
    lateinit var changePassword:TextView
    lateinit var resourceManagement:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_management)
        profile=findViewById(R.id.profile)
        changePassword=findViewById(R.id.changePassword)
        resourceManagement=findViewById(R.id.resourceManagement)

        profile.setOnClickListener {
            val intent1 = Intent(this, ProfileActivity::class.java)
            startActivity(intent1)
        }
        changePassword.setOnClickListener {
            val intent1 = Intent(this, ChangePassword::class.java)
            startActivity(intent1)
        }
        resourceManagement.setOnClickListener {
            val intent1 = Intent(this, ResourceManagementActivity::class.java)
            startActivity(intent1)
        }
    }
}