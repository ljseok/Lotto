package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Main Activity", Toast.LENGTH_LONG).show()

        findViewById<View>(R.id.constellationCard).setOnClickListener {
            startActivity(Intent(this,ConstellationActivity::class.java))
        }
    }
}