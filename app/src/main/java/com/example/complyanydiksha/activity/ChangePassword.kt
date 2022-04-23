package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.complyanydiksha.Fragment.PostFragment
import com.example.complyanydiksha.R
import com.example.complyanydiksha.databinding.ActivityChangePasswordBinding

class ChangePassword : AppCompatActivity() {

    private lateinit var binding : ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        // validations
        binding.btnUpdate.setOnClickListener {
            val oldPass = binding.etOldPass.text.toString().trim()
            val newPass = binding.etNewPass.text.toString().trim()
            val confirmPass = binding.etConfirmNewPass.text.toString().trim()

            val checkPass = "^" +
                    "(?=.*[0-9])" +   // at least 1 digit
                    "(?=.*[a-zA-Z])" +   // any letter
                    "(?=.*[@#$%^&+=])" +  // at least 1 spacial character
                    "(?=\\S+$)" +    // no white space
                    ".{8,}" +        // at least 8 character
                    "$"

            if (oldPass.isEmpty()){
                binding.tvOldPass.setText("*This field is required")
            }
            else if (oldPass == newPass){
                binding.tvNewPass.setText("*New password must me different")
            }
            else if (newPass.isEmpty()){
                binding.tvNewPass.setText("*This field is required")
            }
            else if(newPass.length < 8){
                binding.tvNewPass.setText("*Password must contain at least 8 characters")
            }
            else if (!newPass.matches(checkPass.toRegex())){
                binding.tvNewPass.setText("*Password too weak")
            }
            else if (confirmPass != newPass){
                binding.tvConfirmNewPass.setText("*New password and confirm password must be same")
            }
            else{
                binding.etOldPass.text.clear()
                binding.etNewPass.text.clear()
                binding.etConfirmNewPass.text.clear()

                Toast.makeText(this, "Password Updated...", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}
       // btnUpdate=findViewById(R.id.btnUpate)


      /*  btnUpdate.setOnClickListener{
           *//* Intent(this, fragment::class.java).also{
                startActivity(it)*//*
            val intent1 = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent1)
            }*/


