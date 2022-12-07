package com.example.historyup

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        findViewById<PDFView>(R.id.historyText).fromAsset("history.pdf").show()
    }
}
