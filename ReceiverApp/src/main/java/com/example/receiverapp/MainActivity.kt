package com.example.receiverapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val receivedDataButton: Button = findViewById(R.id.receivedDataButton)
        receivedDataButton.text = "No Data Received"
    }
}
