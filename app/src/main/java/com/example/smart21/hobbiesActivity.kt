package com.example.smart21

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Layout
import kotlinx.android.synthetic.main.activity_hobbies.*

class hobbiesActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        recycle_view.layoutManager=layoutManager

        val adapter=HobbiesAdapter(this,supplier.hobbies)
        recycle_view.adapter=adapter

    }
}