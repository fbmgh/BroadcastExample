package com.example.senderapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton: View = findViewById(R.id.sendButton)
        sendButton.setOnClickListener {
            sendBroadcastMessage()
        }
    }

    private fun sendBroadcastMessage() {
        val intent = Intent("com.example.receiverapp.ACTION_ID")
        intent.putExtra("part1", "John")
        intent.putExtra("part2", "30")
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        sendBroadcast(intent)
    }
}
