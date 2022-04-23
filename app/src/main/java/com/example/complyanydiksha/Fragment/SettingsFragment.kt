package com.example.complyanydiksha.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.*


class SettingsFragment : Fragment() {
    private lateinit var SubscriptionLayout:RelativeLayout
    private lateinit var UserRoleLayout:RelativeLayout
    private lateinit var entityTypeLayout:RelativeLayout
    private lateinit var industryTypeLayout:RelativeLayout
    private lateinit var StockExchangeLayout:RelativeLayout
    private lateinit var complianceNatureLayout:RelativeLayout
    private lateinit var complianceTypeLayout:RelativeLayout
    private lateinit var backupLayout:RelativeLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view= inflater.inflate(R.layout.fragment_settings, container, false)
        SubscriptionLayout=view.findViewById(R.id.SubscriptionLayout)
        UserRoleLayout=view.findViewById(R.id.UserRoleLayout)
        entityTypeLayout=view.findViewById(R.id.entityTypeLayout)
        industryTypeLayout=view.findViewById(R.id.industryTypeLayout)
        StockExchangeLayout=view.findViewById(R.id.StockExchangeLayout)
        complianceNatureLayout=view.findViewById(R.id.complianceNatureLayout)
        complianceTypeLayout=view.findViewById(R.id.complianceTypeLayout)
        backupLayout=view.findViewById(R.id.backupLayout)



        SubscriptionLayout.setOnClickListener{
            var intent=Intent(context,SubscriptionActivity::class.java)
            startActivity(intent)
        }

        UserRoleLayout.setOnClickListener{
            var intent=Intent(context,UserActivity::class.java)
            startActivity(intent)
        }
        entityTypeLayout.setOnClickListener{
            var intent=Intent(context,EntityTypeActivity::class.java)
            startActivity(intent)
        }


        industryTypeLayout.setOnClickListener{
            var intent=Intent(context,IndustryTypeActivity::class.java)
            startActivity(intent)
        }

        StockExchangeLayout.setOnClickListener{
            var intent=Intent(context,StockExchangeActivity::class.java)
            startActivity(intent)
        }

        complianceNatureLayout.setOnClickListener{
            var intent=Intent(context,ComplainceNatureActivity::class.java)
            startActivity(intent)
        }

        complianceTypeLayout.setOnClickListener{
            var intent=Intent(context,ComplainceTypeActivity::class.java)
            startActivity(intent)
        }

        backupLayout.setOnClickListener{
            var intent=Intent(context,BackUpActivity::class.java)
            startActivity(intent)
        }
        return view
    }



}