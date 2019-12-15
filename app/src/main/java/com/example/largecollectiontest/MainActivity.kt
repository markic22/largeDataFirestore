package com.example.largecollectiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.UiThread
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {

    val firestore = FirebaseFirestore.getInstance()
    var list: MutableList<TestObject>? = mutableListOf()
    var secondaryList: MutableList<DifferentObject>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progress.show()
        button.visibility = View.VISIBLE

        button.setOnClickListener {
            launchOnIO {
                for (y in 10 until 20) {
                    for (x in 0 until 1000) {
                        Log.d("add", "add document: $x")
                        firestore.collection("list").add(TestObject(type = y.toLong()))
                    }
                }
            }
        }

        getObjectsInBatches()
    }


    fun getObjectsInBatches() {
        for (x in 0 until 20) {
            firestore.collection("list").whereEqualTo("type", x.toLong())
                .addSnapshotListener { snapshots, e ->

                    if(e != null){
                        count.text = e.message
                        return@addSnapshotListener
                    }
                    count.text = "done for $x"
                    val list = mutableListOf<TestObject>()

                        snapshots?.forEachIndexed { index, queryDocumentSnapshot ->
                            list.add(queryDocumentSnapshot.toObject(TestObject::class.java))
                        }
                        Log.d("read", "list size: ${list.size}")

                }
        }
    }

    fun getAllObjects(){
        firestore.collection("list").limit(8000)
            .addSnapshotListener { snapshots, e ->
                snapshots?.forEachIndexed { index, queryDocumentSnapshot ->
                    Log.d("Document read",  " and count number $index")
                }
            }
    }
}


fun launchOnIO(block: suspend CoroutineScope.() -> Unit): Job {
    return GlobalScope.launch(Dispatchers.IO) { block() }
}


suspend fun <T> withIOContext(block: suspend CoroutineScope.() -> T): T {
    return withContext(Dispatchers.IO) { block() }
}
