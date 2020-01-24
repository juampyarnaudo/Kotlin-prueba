package com.example.kotlinprueba.Activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.kotlinprueba.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

    }

    override fun onBackPressed() {
        if (exitEnabled) {
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this, "Presiona atras nuevamente para salir...", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable { exitEnabled = false }, 2000)

    }
}
