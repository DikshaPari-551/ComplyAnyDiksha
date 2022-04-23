package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.complyanydiksha.R

class SupportActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etMobileNumber:EditText
    lateinit var etMessage:EditText
    lateinit var tvEmail:TextView
    lateinit var tvMobileNumber:TextView
    lateinit var tvMessage:TextView
    lateinit var btnSubmitted:Button
    lateinit var toolbarBackIcon:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)
        etEmail=findViewById(R.id.etEmail)
        etMobileNumber=findViewById(R.id.etMobileNumber)
        etMessage=findViewById(R.id.etMessage)
        tvEmail=findViewById(R.id.tvEmail)
        tvMobileNumber=findViewById(R.id.tvMobileNumber)
        tvMessage=findViewById(R.id.tvMessage)


        toolbarBackIcon=findViewById(R.id.toolbarBackIcon)
        toolbarBackIcon.setOnClickListener {
            val intent= Intent(this,DikshaLoginActivity::class.java)
            startActivity(intent)
        }

        btnSubmitted=findViewById(R.id.btnSubmitted)
        btnSubmitted.setOnClickListener{
            tvEmail.text=""
            tvMobileNumber.text=""
            tvMessage.text=""




            val mobile = etMobileNumber.text.toString()
            val message = etMessage.text.toString()
            val email=etEmail.text.toString()
            if (email.isEmpty()) {
                tvEmail.setText("*Please enter email address")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvEmail.setText("*Please enter valid email address")
            }
            else if(mobile.isEmpty()) {
                tvMobileNumber.setText("*Please enter mobile number")
            }
            else if(mobile.length<10) {
                tvMobileNumber.setText("*Please enter  valid mobile number")
            }
            else if(message.isEmpty()) {
                tvMessage.setText("*Please enter message")
            }
            else{
                Toast.makeText(this, "Submit", Toast.LENGTH_SHORT).show()
            }
        }
    }
}