package com.example.historyup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class HistoryActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history5)
        findViewById<PDFView>(R.id.historyText5).fromAsset("history5.pdf").show()
    }
}