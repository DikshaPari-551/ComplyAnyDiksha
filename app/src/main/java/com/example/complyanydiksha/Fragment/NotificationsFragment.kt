package com.example.complyanydiksha.Fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanydiksha.Model.NotificationModel
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.RegisterEmailNotificationActivity
import com.example.complyanydiksha.adapter.NotificationAdapter

class NotificationsFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var addIconNotification : TextView

    //lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: NotificationAdapter

    var array: ArrayList<NotificationModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_notifications, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewNotification)

        addIconNotification = view.findViewById(R.id.addIconNotification)

         //intent to registerEmailNotification screen
        addIconNotification.setOnClickListener {
            Intent(activity as Context, RegisterEmailNotificationActivity::class.java).also {
                startActivity(it)
            }
        }

        var data1 = NotificationModel(
            "Afganistan",
            "test",
            "Beverages",
            "Stock Exchange",
            "1",
            "2022-03-14",
            "Buisness",
            "RefKF30FOGM"
        )
        var data2 = NotificationModel(
            "Albania",
            "suh",
            "Aerospace Defense",
            "INCOME",
            "233",
            "2022-02-20",
            "Buisness",
            "Ref60R9ZOES"
        )
        var data3 = NotificationModel(
            "Afghanistan",
            "WeWeWe",
            "BPO & KPO",
            "INCOME",
            "4343",
            "2022-02-22",
            "Professional",
            "Ref50650F13"
        )
        var data4 = NotificationModel(
            "Algeria",
            "hjg",
            "Tesla",
            "Stock Exchange",
            "55",
            "2022-02-05",
            "Professional",
            "RefMF5Y0OLP"
        )
        var data5 = NotificationModel(
            "Afganistan",
            "gdsf",
            "Google",
            "Excise Duty,Tax",
            "454",
            "2022-02-05",
            "Enterprise",
            "Ref0DMF4M42"
        )
        var data6 = NotificationModel(
            "Aland Island",
            "hi",
            "Tesla",
            "Labour Law",
            "555",
            "2022-02-05",
            "Buisness",
            "Ref5ROVIYX7"
        )
        var data7 = NotificationModel(
            "Afganistan",
            "hidf",
            "Air Freight",
            "Custom Law",
            "5588",
            "2022-02-04",
            "Individual",
            "RefLS2FP2JL"
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)
        array.add(data7)


        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(context)
        // This will pass the ArrayList to our Adapter
        adapter = NotificationAdapter(activity as Context, array)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
        return view
    }



}