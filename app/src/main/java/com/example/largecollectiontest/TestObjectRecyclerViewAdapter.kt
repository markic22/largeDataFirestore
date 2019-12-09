package com.example.largecollectiontest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TestObjectRecyclerViewAdapter(val testObjectList: List<TestObject>): RecyclerView.Adapter<TestObjectRecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
         val title: TextView = view.findViewById(R.id.text)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.test_object_item_layout,
            parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return testObjectList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = "$position  ${testObjectList[position].name}"
    }

}