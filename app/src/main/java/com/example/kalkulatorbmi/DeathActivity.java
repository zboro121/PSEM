package com.example.kalkulatorbmi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import java.util.Random;

public class DeathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death);
        WebView webView=findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/index.html");

    }
}
