package com.example.recyclertestthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclertestthree.adapter.PersonAdapter
import com.example.recyclertestthree.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personArray = ArrayList<Person>()
        personArray.add(
            Person(
                R.drawable.pic,
                "Johnny Willi0n",
                R.drawable.couple,
                "2k",
                "69",
                "30"
            )
        )
        personArray.add(
            Person(
                R.drawable.girl,
                "Emilia Willi0n",
                R.drawable.coupletwo,
                "5k",
                "99",
                "20"
            )
        )
        var personAdapter = PersonAdapter(personArray)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = personAdapter
    }
}

