package com.example.smart21

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class Secondactivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this,"i ma in second activity",Toast.LENGTH_LONG).show()
    }


}