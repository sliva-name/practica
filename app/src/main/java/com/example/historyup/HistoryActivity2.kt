package com.example.historyup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class HistoryActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history2)
        findViewById<PDFView>(R.id.historyText2).fromAsset("history2.pdf").show()
    }
}