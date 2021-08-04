package com.example.activitylifecyclep7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("Lifecycle","onCreate")

        val btn : Button = findViewById(R.id.btnAdd)
        val tv : TextView = findViewById(R.id.tvQuestion)
        val tvName : TextView = findViewById(R.id.tvName)

        btn.setOnClickListener(){
            tv.text = generateQuestion()
        }
    }
    override fun onStart(){
        super.onStart()

        Log.i("LifeCycle","onStart")

    }
    override fun onResume(){
        super.onResume()

        Log.i("LifeCycle","onResume")

    }
    override fun onPause(){
        super.onPause()

        Log.i("LifeCycle","onPause")

    }

    override fun onStop() {
        super.onStop()

        Log.i("LifeCycle","onStop")

    }
    override fun onDestroy(){
        super.onDestroy()

        Log.i("LifeCycle","onDestroy")

    }
    fun generateQuestion() : String{
        var no1 = (Math.random()*100).toInt()
        var no2 = (Math.random()*100).toInt()

        return "${no1} + ${no2} = ?"
    }
}