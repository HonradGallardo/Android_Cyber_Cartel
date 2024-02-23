package com.gallardo.cyber_cartel

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gallardo.cyber_cartel.Adapters.Category.PSU_Adapter
import com.gallardo.cyber_cartel.Adapters.User_Addresses_Adapter
import com.gallardo.cyber_cartel.DataClass.Category.PSU_DC
import com.gallardo.cyber_cartel.DataClass.My_Purchase_All_DC
import com.gallardo.cyber_cartel.DataClass.User_Addresses_DC

class Category_Psu: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userAddressAdapter: PSU_Adapter
    private var allitemlist = ArrayList<PSU_DC>()
    private lateinit var img_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_psu)

        recyclerView = findViewById(R.id.category_psu_rv)
        userAddressAdapter = PSU_Adapter(this, allitemlist)

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = userAddressAdapter

        my_Purchase_All_Data()
    }
    private fun my_Purchase_All_Data() {
        var items = PSU_DC("All Item", 100, R.drawable.image)
        allitemlist.add(items)
    }
}