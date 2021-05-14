package com.example.kalkulatorbmi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity() {
    lateinit var wynikitext: TextView
    var oblicz: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val intent = intent
        val message = intent.getStringExtra(SecondeActivity.EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        wynikitext = findViewById(R.id.wynik)
        wynikitext.setText(message)
    }
}