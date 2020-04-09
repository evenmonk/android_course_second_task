package com.example.secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(this::class.simpleName, "onCreate method initialized")

        val textView = findViewById<TextView>(R.id.text)

        counter = savedInstanceState?.getInt(COUNTER_ID, 0) ?: 0
        textView.text = "$counter"

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, SideActivity::class.java)
            intent.putExtra(COUNTER_ID, counter)
            startActivity(intent)
        }
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
        counter = savedInstanceState.getInt(COUNTER_ID)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(COUNTER_ID, counter + 1)
        super.onSaveInstanceState(outState)
    }

    companion object {
        const val COUNTER_ID = "counter_id"
    }
}
