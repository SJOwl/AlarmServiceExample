package com.example.sj.alarmservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context,
                           intent: Intent) {
        Toast.makeText(context, "Alarm! ${intent.getStringExtra("time")}", Toast.LENGTH_LONG).show()
        Log.d("timer", "alarm , alarm !!!!!       ${intent.getStringExtra("time")}")
    }
}