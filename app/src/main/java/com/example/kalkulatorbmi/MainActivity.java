package com.example.kalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void FirstScreen(View view) {
        Intent first = new Intent(this, SecondeActivity.class);
        startActivity(first);
    }
    public void NextScreen(View view) {
        Intent next = new Intent(this, NextActivity.class);
        startActivity(next);
    }
    public void DeathScreen(View view) {
        Intent death = new Intent(this, DeathActivity.class);
        startActivity(death);
    }
}