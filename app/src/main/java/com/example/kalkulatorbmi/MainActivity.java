package com.example.kalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText waga, wzrost;
    TextView wynikitext, sex;
    String oblicz, WynikiBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waga = findViewById(R.id.waga);
        wzrost = findViewById(R.id.wzrost);
        wynikitext = findViewById(R.id.wynik);
        sex = findViewById(R.id.plec);
    }
    public void obliczBMI(View view) {
        String S1 = waga.getText().toString();
        String S2 = wzrost.getText().toString();
        String S3 = sex.getText().toString();

        float wartoscWagi = Float.parseFloat(S1);
        float wartoscWzrostu = Float.parseFloat(S2) / 100;

        float bmi = wartoscWagi / (wartoscWzrostu * wartoscWzrostu);

        if (S3.equals("K")) {
            if (bmi < 14) {
                WynikiBMI = "wygłodzenie";
            } else if (bmi < 16.5) {
                WynikiBMI = "Masz niedowage";
            } else if (bmi >= 16.5 && bmi <= 23.9) {
                WynikiBMI = "Waga prawidłowa";
            } else if (bmi >= 24 && bmi <= 28.9) {
                WynikiBMI = "Masz nadwagę, przejdz na diete";
            } else {
                WynikiBMI = "Jestes otyła, przejdz na diete";
            }
        }
        else {
                if (bmi < 16) {
                    WynikiBMI = "wygłodzenie";
                } else if (bmi < 18.5) {
                    WynikiBMI = "Masz niedowage";
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    WynikiBMI = "Waga prawidłowa";
                } else if (bmi >= 25 && bmi <= 29.9) {
                    WynikiBMI = "Masz nadwagę, przejdz na diete";
                } else {
                    WynikiBMI = "Jestes otyły, przejdz na diete";
                }
        }

        oblicz = "Wyniki:" + bmi + "\n" + WynikiBMI;

        wynikitext.setText(oblicz);
    }
}