package com.example.largecollectiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val firestore = FirebaseFirestore.getInstance()
    var list: MutableList<TestObject>? = mutableListOf()
    var secondaryList: MutableList<DifferentObject>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progress.show()
        button.visibility = View.VISIBLE


        //click on button generates additional items
        button.setOnClickListener {
            for (x in 0 until 1000){
                Log.d("add", "add document: $x")
                firestore.collection("list").add(TestObject())
                firestore.collection("secondList").add(DifferentObject())
            }
        }

        recyclerView.layoutManager = LinearLayoutManager(this)

        firestore.collection("list").addSnapshotListener { snapshots, e ->
            //the issue is appearant even without puting all of this into objects
//            list = snapshots?.toObjects(TestObject::class.java)
//            recyclerView.adapter = TestObjectRecyclerViewAdapter(list!!)
            count.text = snapshots?.documents?.size.toString()
//            progress.hide()
        }

        firestore.collection("secondList").addSnapshotListener { snapshots, e ->
//                        secondaryList = snapshots?.toObjects(DifferentObject::class.java)

        }
    }
}
