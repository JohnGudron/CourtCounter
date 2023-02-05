package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var scoreA = 0

    var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reset(view: View) {
        scoreA = 0
        scoreB = 0
        findViewById<TextView>(R.id.scoreA).text = scoreA.toString()
        findViewById<TextView>(R.id.scoreB).text = scoreB.toString()
    }

    fun button2A(view: View) {
        scoreA+=2
        findViewById<TextView>(R.id.scoreA).text = scoreA.toString()
    }

    fun button3A(view: View) {
        scoreA+=3
        findViewById<TextView>(R.id.scoreA).text = scoreA.toString()
    }

    fun buttonFreeA(view: View) {
        scoreA+=1
        findViewById<TextView>(R.id.scoreA).text = scoreA.toString()
    }

    fun button2B(view: View) {
        scoreB+=2
        findViewById<TextView>(R.id.scoreB).text = scoreB.toString()
    }

    fun button3B(view: View) {
        scoreB+=3
        findViewById<TextView>(R.id.scoreB).text = scoreB.toString()
    }

    fun buttonFreeB(view: View) {
        scoreB+=1
        findViewById<TextView>(R.id.scoreB).text = scoreB.toString()
    }




}