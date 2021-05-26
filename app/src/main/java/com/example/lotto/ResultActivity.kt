package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    val lottoImageStartId = R.drawable.ball_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Toast.makeText(this,"Result Activity", Toast.LENGTH_LONG).show()

        val result = intent.getIntArrayExtra("result") ?: return

        result?.let {
            updateLottoBallImage(result.sortedBy { it })
        }
    }
    private fun updateLottoBallImage(result:List<Int>) {


        // val lottoImageStartId2 = R.drawable.ball_15(
        // val lottoImageStartId3 = R.drawable.ball_23
        val imageView18 = findViewById<ImageView>(R.id.imageView18)
        val imageView19 = findViewById<ImageView>(R.id.imageView19)
        val imageView20 = findViewById<ImageView>(R.id.imageView20)
        val imageView21 = findViewById<ImageView>(R.id.imageView21)
        val imageView22 = findViewById<ImageView>(R.id.imageView22)
        val imageView23 = findViewById<ImageView>(R.id.imageView23)

        imageView18.setImageResource(lottoImageStartId + (result[0] - 1))
        imageView19.setImageResource(lottoImageStartId + (result[1] - 1))
        imageView20.setImageResource(lottoImageStartId + (result[2] - 1))
        imageView21.setImageResource(lottoImageStartId + (result[3] - 1))
        imageView22.setImageResource(lottoImageStartId + (result[4] - 1))
        imageView23.setImageResource(lottoImageStartId + (result[5] - 1))
    }
}

