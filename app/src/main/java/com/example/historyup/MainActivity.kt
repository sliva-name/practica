package com.example.historyup

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn1(view: View) {
        val activity = Intent(this@MainActivity, HistoryActivity::class.java)
        startActivity(activity)
    }
    fun btn2(view: View) {
        val activity = Intent(this@MainActivity, HistoryActivity2::class.java)
        startActivity(activity)
    }
    fun btn3(view: View) {
        val activity = Intent(this@MainActivity, HistoryActivity3::class.java)
        startActivity(activity)
    }
    fun btn4(view: View) {
        val activity = Intent(this@MainActivity, HistoryActivity4::class.java)
        startActivity(activity)
    }
    fun btn5(view: View) {
        val activity = Intent(this@MainActivity, HistoryActivity5::class.java)
        startActivity(activity)
    }
}