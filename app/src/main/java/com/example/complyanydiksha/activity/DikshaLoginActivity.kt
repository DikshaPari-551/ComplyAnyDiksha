package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan

import com.example.complyanydiksha.Fragment.BusinessPartnerFragment
import com.example.complyanydiksha.Fragment.UserFragment
import com.example.complyanydiksha.R
import com.example.complyanydiksha.adapter.ViewPagerAdapter
import com.example.complyanydiksha.databinding.ActivityDikshaLoginBinding

class DikshaLoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDikshaLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDikshaLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTabs()
//        changeColorTextView()

        binding.txtSupport.setOnClickListener {
            Intent(this, SupportActivity::class.java).also {
                startActivity(it)
            }
        }

    }

    private fun setupTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.getFragment(UserFragment(), "User")
        adapter.getFragment(BusinessPartnerFragment(), "Business Partner")
        binding.viewPager2.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager2)
    }

//    // added colors in textView
//    private fun changeColorTextView() {
//        val mText = binding.txtSupport.text.toString()
//        val mSpannableString = SpannableString(mText)
//        val mBlue = ForegroundColorSpan(resources.getColor(R.color.grey))
//
//        mSpannableString.setSpan(mBlue, 10, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//        binding.txtSupport.text = mSpannableString
//    }

    override fun onBackPressed() {
        finish()
    }

}