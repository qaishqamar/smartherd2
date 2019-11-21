package com.example.listview_bta

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview= findViewById<ListView>(R.id.main_listview)
       /* val mycolor= Color.parseColor("#FF0000")
        listview.setBackgroundColor(mycolor)*/
        listview.adapter=MyCustemAdapter(this)
    }
}
 class MyCustemAdapter(private val context:Context):BaseAdapter(){
     override fun getCount(): Int {
         return 5
     }

     override fun getItemId(position: Int): Long {
        return position.toLong()
     }

     override fun getItem(position: Int): Any {
         return "my item"

     }

     override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
         val textview=TextView(context)
         textview.text="my rows are here"
         return(textview)
     }

 }




