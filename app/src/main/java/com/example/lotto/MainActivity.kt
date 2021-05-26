package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Main Activity", Toast.LENGTH_LONG).show()

        findViewById<View>(R.id.constellationCard).setOnClickListener {
            startActivity(Intent(this,ConstellationActivity::class.java))
        }

        findViewById<View>(R.id.nameCard).setOnClickListener {
            startActivity(Intent(this,Namectivity::class.java))
        }

        fun getRandomLottoNumber(): Int{
            return Random.nextInt(45)+1
        }

        fun getRandomLottoNumbers(): MutableList<Int>{
            val lottoNumbers = mutableListOf<Int>()

            while(true){
                var numbers: Int = getRandomLottoNumber()
                var flag_existing: Int = 0
                if(lottoNumbers.contains(numbers)){
                    flag_existing =1
                    break;
                }
                if(flag_existing.equals(1))
                    continue
                else
                    lottoNumbers.add(numbers)
                if(lottoNumbers.size>=0)
                    break;
            }
            return lottoNumbers
        }

        findViewById<View>(R.id.randomCard).setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result",ArrayList(getRandomLottoNumbers()))

        }


    }
}