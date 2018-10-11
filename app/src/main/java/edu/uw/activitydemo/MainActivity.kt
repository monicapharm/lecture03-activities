package edu.uw.activitydemo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MAIN"
    private val COUNT_KEY: String = "count"
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            // application was created
            count = savedInstanceState.getInt(COUNT_KEY)
        }

        val button: Button = findViewById<Button>(R.id.my_button)
        button.text = "Times clicked: $count"

        button.setOnClickListener {
            //            Log.v(TAG, "you clicked me!")
//            count++
//            button.text = "Times clicked: $count"
//            Toast.makeText(this, "clicked!", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.v(TAG, "count: $count")
        Log.v(TAG, "onCreate called")
    }

    fun handleButtonClick(view: View) {
            count++
            val button: Button = findViewById<Button>(R.id.my_button)
            button.text = "Times clicked: $count"
            Toast.makeText(this, "clicked!", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.v(TAG, "onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(COUNT_KEY, count) // put a string in the bundle
        super.onSaveInstanceState(outState)

    }
}