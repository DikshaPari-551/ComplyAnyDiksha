package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanydiksha.Model.ModelOverdue
import com.example.complyanydiksha.R
import com.example.complyanydiksha.adapter.OverdueAdapter

class OverdueActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: OverdueAdapter
    lateinit var backBtn:TextView

    var array: ArrayList<ModelOverdue> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overdue)

        recyclerView = findViewById(R.id.recycler_Overdue)
        backBtn=findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            finish()
        }

        var data1 = ModelOverdue(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data2 = ModelOverdue(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data3 = ModelOverdue(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data4 = ModelOverdue(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data5 = ModelOverdue(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data6 = ModelOverdue(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data7 = ModelOverdue(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data8 = ModelOverdue(
            "IN-GSDN2SYR",
            "harry-monthly",
            "Payment",
            "April-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data9 = ModelOverdue(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )
        var data10 = ModelOverdue(
            "IN-CW87YBYO",
            "Timetakend",
            "Meeting",
            "April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data11 = ModelOverdue(
            "IN-VNVJY3Z1",
            "upgrade plan2",
            "Meeting",
            "June-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data12 = ModelOverdue(
            "IN-DFIXP7D",
            "upgrade plan2",
            "Return",
            "Jun-2021",
            "2021-06-10T00:00:00.000Z",
            ""
        )
        var data13 = ModelOverdue(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data14 = ModelOverdue(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data15 = ModelOverdue(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data16 = ModelOverdue(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data17 = ModelOverdue(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data18 = ModelOverdue(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data19 = ModelOverdue(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )

        var data20 = ModelOverdue(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)
        array.add(data7)
        array.add(data8)
        array.add(data9)
        array.add(data10)
        array.add(data11)
        array.add(data12)
        array.add(data13)
        array.add(data14)
        array.add(data15)
        array.add(data16)
        array.add(data17)
        array.add(data18)
        array.add(data19)
        array.add(data20)


        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        adapter = OverdueAdapter(this, array)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

    }
}

//class MainActivity : AppCompatActivity() {
//
//    lateinit var recyclerView: RecyclerView
//
//    //lateinit var layoutManager: RecyclerView.LayoutManager
//    lateinit var adapter: MyAdapter
//
//    var array: ArrayList<ModelClass> = ArrayList()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////        supportFragmentManager.beginTransaction()
////            .replace(R.id.frame,HomeFragment())
////            .commit()
//
//
//        recyclerView = findViewById(R.id.my_recycler)
//
//
//        var data1 = ModelClass(
//            "Afganistan",
//            "test",
//            "Beverages",
//            "Stock Exchange",
//            "1",
//            "2022-03-14",
//            "Buisness",
//            "RefKF30FOGM"
//        )
//        var data2 = ModelClass(
//            "Albania",
//            "suh",
//            "Aerospace Defense",
//            "INCOME",
//            "233",
//            "2022-02-20",
//            "Buisness",
//            "Ref60R9ZOES"
//        )
//        var data3 = ModelClass(
//            "Afghanistan",
//            "WeWeWe",
//            "BPO & KPO",
//            "INCOME",
//            "4343",
//            "2022-02-22",
//            "Professional",
//            "Ref50650F13"
//        )
//        var data4 = ModelClass(
//            "Algeria",
//            "hjg",
//            "Tesla",
//            "Stock Exchange",
//            "55",
//            "2022-02-05",
//            "Professional",
//            "RefMF5Y0OLP"
//        )
//        var data5 = ModelClass(
//            "Afganistan",
//            "gdsf",
//            "Google",
//            "Excise Duty,Tax",
//            "454",
//            "2022-02-05",
//            "Enterprise",
//            "Ref0DMF4M42"
//        )
//        var data6 = ModelClass(
//            "Aland Island",
//            "hi",
//            "Tesla",
//            "Labour Law",
//            "555",
//            "2022-02-05",
//            "Buisness",
//            "Ref5ROVIYX7"
//        )
//        var data7 = ModelClass(
//            "Afganistan",
//            "hidf",
//            "Air Freight",
//            "Custom Law",
//            "5588",
//            "2022-02-04",
//            "Individual",
//            "RefLS2FP2JL"
//        )
//
//        array.add(data1)
//        array.add(data2)
//        array.add(data3)
//        array.add(data4)
//        array.add(data5)
//        array.add(data6)
//        array.add(data7)
//
//
//        // this creates a vertical layout Manager
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        // This will pass the ArrayList to our Adapter
//        adapter = MyAdapter(this, array)
//
//        // Setting the Adapter with the recyclerview
//        recyclerView.adapter = adapter
//    }
//
//}