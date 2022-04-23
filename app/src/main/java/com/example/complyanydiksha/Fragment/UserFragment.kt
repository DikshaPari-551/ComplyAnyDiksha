package com.example.complyanydiksha.Fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.complyanydiksha.MainActivity
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.ForgetPasswordActivity
import com.example.complyanydiksha.activity.TermsOfUseActivity
import com.example.complyanydiksha.databinding.FragmentUserBinding


class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentUserBinding.inflate(inflater, container, false)
        val view = binding.root

     //   changeColorTextView()

        binding.btnContinue.setOnClickListener {

            val etCompanyId = binding.etCompanyId.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
           binding.tvCompanyId.text=""
           binding.tvEmail.text=""
            binding.tvCompanyId.text=""
            binding.tvEmail.text=""


            if(etCompanyId.isEmpty()){
                binding.tvCompanyId.setText("*Please enter companyId")
            }
           else if (etCompanyId.length < 4) {
                binding.tvCompanyId.setText("*CompanyId contain atleast 4 character")
            }

            else if (email.isEmpty()) {
                binding.tvEmail.setText("*Please enter email address")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.tvEmail.setText("*Please enter valid email address")
            }
            else {
                binding.btnLogin.visibility = View.VISIBLE
                binding.etPass.visibility = View.VISIBLE
                binding.btnContinue.visibility = View.GONE
            }
        }


        // added clicks on login button
        binding.btnLogin.setOnClickListener{

            val pass = binding.etPass.text.toString().trim()
             binding.tvPass.text=""

            if(pass.isEmpty()){
                binding.tvPass.visibility=View.VISIBLE
                binding.tvPass.setText("*Please enter password")

            }
            else if (pass.length < 8) {
                binding.tvPass.visibility=View.VISIBLE

                binding.tvPass.setText("Password contains atleast 8 characters")
            }
            else{

                Intent(activity as Context, MainActivity::class.java).also{
                    startActivity(it)
                }
            }
        }

        binding.txtForgotPassword.setOnClickListener {
            Intent(context, ForgetPasswordActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.termsOfUse.setOnClickListener {
            Intent(context, TermsOfUseActivity::class.java).also {
                startActivity(it)
            }
        }
        return view
    }

   /* private fun changeColorTextView() {
        val mText = binding.txtTerms2.text.toString()

        val mSpannableString = SpannableString(mText)
        val mBlue = ForegroundColorSpan(resources.getColor(R.color.blue))

        mSpannableString.setSpan(mBlue, 32, 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.txtTerms2.text = mSpannableString
    }*/

}
