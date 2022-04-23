package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanydiksha.Model.CompletedModel
import com.example.complyanydiksha.R
import com.example.complyanydiksha.adapter.CompletedAdapter
import com.example.complyanydiksha.adapter.OverdueAdapter

class CompletedActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CompletedAdapter
    lateinit var backBtn: TextView
    var array: ArrayList<CompletedModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_completed)
        recyclerView = findViewById(R.id.recycler_completed)
        backBtn=findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            finish()
        }

        var data1 = CompletedModel(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data2 = CompletedModel(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data3 = CompletedModel(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data4 = CompletedModel(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data5 = CompletedModel(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data6 = CompletedModel(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data7 = CompletedModel(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data8 = CompletedModel(
            "IN-GSDN2SYR",
            "harry-monthly",
            "Payment",
            "April-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data9 = CompletedModel(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )
        var data10 = CompletedModel(
            "IN-CW87YBYO",
            "Timetakend",
            "Meeting",
            "April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data11 = CompletedModel(
            "IN-VNVJY3Z1",
            "upgrade plan2",
            "Meeting",
            "June-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data12 = CompletedModel(
            "IN-DFIXP7D",
            "upgrade plan2",
            "Return",
            "Jun-2021",
            "2021-06-10T00:00:00.000Z",
            ""
        )
        var data13 = CompletedModel(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data14 = CompletedModel(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data15 = CompletedModel(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data16 = CompletedModel(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data17 = CompletedModel(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data18 = CompletedModel(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data19 = CompletedModel(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )

        var data20 = CompletedModel(
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
       // adapter = CompletedAdapter(this,array)
adapter= CompletedAdapter(this,array)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }
}