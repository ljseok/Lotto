package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)
            findViewById<View>(R.id.GoResultButton).setOnClickListener {
                val intent = Intent(this,ResultActivity::class.java)
                startActivity(intent)
            }

      //  Toast.makeText(this,"Consellation Activity", Toast.LENGTH_LONG).show()


    }
}