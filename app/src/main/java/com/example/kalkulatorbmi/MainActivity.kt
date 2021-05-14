package com.example.kalkulatorbmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulatorbmi.SecondeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun FirstScreen(view: View?) {
        val first = Intent(this, SecondeActivity::class.java)
        startActivity(first)
    }

    fun NextScreen(view: View?) {
        val next = Intent(this, NextActivity::class.java)
        startActivity(next)
    }

    fun DeathScreen(view: View?) {
        val death = Intent(this, DeathActivity::class.java)
        startActivity(death)
    }
}