package com.example.smart21

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnshotoast.setOnClickListener {
            Log.i("Mainactivity","button was clicked")
            Toast.makeText(this,"button was clicked",Toast.LENGTH_LONG).show()

        }
        sendmassage_id.setOnClickListener {
            val massage: String = edUsermassage.text.toString()
            Toast.makeText(this,massage,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Secondactivity::class.java)
            startActivity(intent)
        }
    }
}
