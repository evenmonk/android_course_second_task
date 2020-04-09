package com.example.secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView



class SideActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)
        Log.i(this::class.simpleName, "onCreate method initialized")

        val textView = findViewById<TextView>(R.id.second_text)

        val intentCounter : Int = intent.extras?.getInt(MainActivity.COUNTER_ID) ?: counter
        textView.text = (intentCounter * intentCounter).toString()
    }


    override fun onStart(){
        super.onStart()
        Log.i(this::class.simpleName, "onStart method initialized")
    }

    override fun onResume() {
        super.onResume()
        Log.i(this::class.simpleName, "onResume method initialized")
    }

    override fun onPause() {
        super.onPause()
        Log.i(this::class.simpleName, "onPause method initialized")
    }

    override fun onStop() {
        super.onStop()
        Log.i(this::class.simpleName, "onStop method initialized")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(this::class.simpleName, "onRestart method initialized")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(this::class.simpleName, "onDestroy method initialized")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt(MainActivity.COUNTER_ID)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(MainActivity.COUNTER_ID, counter)
        super.onSaveInstanceState(outState)
    }

}