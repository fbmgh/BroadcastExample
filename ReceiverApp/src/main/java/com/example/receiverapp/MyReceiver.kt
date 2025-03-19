package com.example.receiverapp

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    @SuppressLint("SetTextI18n")
    override fun onReceive(context: Context?, intent: Intent?) {
        val part1 = intent?.getStringExtra("part1")
        val part2 = intent?.getStringExtra("part2")

        Toast.makeText(context, "Received: $part1, $part2", Toast.LENGTH_SHORT).show()

        if (context != null) {
            val activity = context as? MainActivity
            activity?.runOnUiThread {
                val receivedDataButton: Button = activity.findViewById(R.id.receivedDataButton)
                receivedDataButton.text = "$part1, $part2"
            }
        }
    }
}
