package com.example.kalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    TextView wynikitext;
    String oblicz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(SecondeActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        wynikitext = findViewById(R.id.wynik);
        wynikitext.setText(message);

    }
}
