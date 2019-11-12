package com.example.smart21

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class Secondactivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle?=intent.extras
        val msg:String=bundle!!.getString("user_massage")
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        txvUsermassage.text=msg
    }


}