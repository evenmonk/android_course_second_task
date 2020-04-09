package com.example.secondtask

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_side.*
import kotlin.math.pow


class SideActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)
        Log.i(this::class.simpleName, "onCreate method initialized")

        val intentCounter : Int = intent.getIntExtra("counter", 0)
        second_text.text = "${ intentCounter.toDouble().pow(2.0).toInt()}"
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

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        setResult(Activity.RESULT_OK, Intent())
        finish()
        Log.i(this::class.simpleName, "KeyDown method initialized")
        return super.onKeyDown(keyCode, event)
    }

    companion object{
        private const val COUNTER_NAME = "SideActivity"

        fun createSideActivityIntent(context: Context, counter : Int): Intent{
            val intent = Intent(context, SideActivity::class.java)
            intent.putExtra(COUNTER_NAME, counter)
            return intent
        }
    }
}