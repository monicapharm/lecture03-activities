package edu.uw.activitydemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MAIN"
    private val MSG_KEY = "message_key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            Log.v(TAG, "You clicked me!")

            Toast.makeText(this@MainActivity, "Starting second activity", Toast.LENGTH_LONG).show()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d(TAG, "onCreate() called")

        if (savedInstanceState != null) {
            Log.v(TAG, "Recreated")
            Log.v(TAG, savedInstanceState.getString(MSG_KEY))
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop() called")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy() called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(MSG_KEY, "Hello world") //store a message

        super.onSaveInstanceState(outState)
    }
}
