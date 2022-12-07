package com.example.historyup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class HistoryActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history3)
        findViewById<PDFView>(R.id.historyText3).fromAsset("history3.pdf").show()
    }
}