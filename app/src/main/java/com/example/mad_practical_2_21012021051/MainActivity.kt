package com.example.mad_practical_2_21012021051

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called!!")
    }

    fun showMessage(message: String) {
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj: ConstraintLayout? = findViewById(R.id.mainConstraint)
        if (obj != null) {
            Snackbar.make(obj, message, Snackbar.LENGTH_SHORT).show()
        }


        fun onStart() {
            super.onStart()
            showMessage("onStart method is called!!")
        }

        fun onResume() {
            super.onResume()
            showMessage("onResume method is called!!")
        }

        fun onRestart() {
            super.onRestart()
            showMessage("onRestart method is called!!")
        }

        fun onPause() {
            super.onPause()
            showMessage("onPause method is called!!")
        }

        fun onStop() {
            super.onStop()
            showMessage("onStop method is called!!")
        }

        fun onDestroy() {
            super.onDestroy()
            showMessage("onDestroy method is called!!")
        }

    }
}
