package com.example.smart21

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context:Context,val hobbies:List<Hobby>) :RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent:ViewGroup, viewtype: Int): MyViewHolder {
          val view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
         return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
       return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, possition: Int) {
        val hobby=hobbies[possition]
        holder.SetData(hobby,possition)

    }

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var currentHobby:Hobby?=null
        var curretPossition:Int=0
        init {
          itemView.setOnClickListener {
              Toast.makeText(context,currentHobby!!.tittle+" clicked",Toast.LENGTH_LONG).show()
          }
            itemView.imgShare.setOnClickListener {
                val massage: String = "My hobby is :"+currentHobby!!.tittle
                val intent= Intent()
                intent.action= Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,massage)
                intent.type="text/plain"
                context.startActivity(Intent.createChooser(intent,"share to"))
            }
        }
       fun SetData(hobby: Hobby?,poss:Int){
           itemView.txvTitle.text=hobby!!.tittle
           this.currentHobby=hobby
           this.curretPossition=poss

       }
    }
}
