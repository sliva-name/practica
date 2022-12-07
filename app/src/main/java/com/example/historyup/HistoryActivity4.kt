package com.example.historyup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class HistoryActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history4)
        findViewById<PDFView>(R.id.historyText4).fromAsset("history4.pdf").show()
    }
}