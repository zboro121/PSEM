package com.example.kalkulatorbmi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class SecondeActivity extends AppCompatActivity{
    public static final String EXTRA_MESSAGE = "com.example.kalkulatorbmi.MESSAGE";
    EditText waga, wzrost, wiek;
    TextView wynikitext, sex;
    String oblicz, WynikiBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);

        waga = findViewById(R.id.waga);
        wzrost = findViewById(R.id.wzrost);
        wynikitext = findViewById(R.id.wynik);
        sex = findViewById(R.id.plec);
        wiek = findViewById(R.id.wiek);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String S1 = waga.getText().toString();
        String S2 = wzrost.getText().toString();
        String S3 = sex.getText().toString();
        String S4 = wiek.getText().toString();
        float wartoscWagi = Float.parseFloat(S1);
        float wartoscWzrostu = Float.parseFloat(S2) / 100;
        float bmi = wartoscWagi / (wartoscWzrostu * wartoscWzrostu);
        float wartoscWiek = Float.parseFloat(S4);
        double hbM = 66.5 + (17.7 * wartoscWagi) - (6.8 * wartoscWiek);
        double hbK = 655.1 + (9.6 * wartoscWagi) + (1.9 * wartoscWzrostu) - (4.7*wartoscWiek);
        String focaccia = "Focaccia z pomidorkami, grillowanym kurczakiem i rukolą\n" + "Krok 1\n" + "Focaccie przekrój wzdłuż na pół, wytnij większe prostokąty i posmaruj oliwą. Posyp przyprawą Knorr i zapiecz w piekarniku z funkcją grilla.\n" + "Krok 2\n" +
                "Kurczaka pokrój w mniejsze kawałki, skrop oliwą, dopraw przyprawą Knorr oraz przeciśniętym czosnkiem i usmaż na patelni grillowej.\n" + "Krok 3\n" +
                "Pomidorki pokrój na pół. Rukolę umyj i lekko osusz. Natkę pietruszki posiekaj.\n" + "Krok 4\n" +
                "Jak focaccia będzie lekko rumiana - ponownie skrop ją oliwą. Na wierzchu połóż garść rukoli, ułóż na wierzchu kawałki kurczaka oraz połówki pomidorków. Posyp dodatkowo posiekaną pietruszką oraz przyprawą śródziemnomorską Knorr.\n";
        String piers = "Piersi z kurczaka w sosie po baskijsku\n" + "Krok 1\n" +
                "Przekrój każdą pierś kurczaka ukośnie na pół i podsmaż na patelni do momentu, gdy mięso się zrumieni.\n" + "Krok 2\n" +
                "Posiekaj cebulę i czosnek, dodaj do kurczaka, podsmaż wszystko przez chwilę.\n" + "Krok 3\n" +
                "Podawaj danie z ryżem, makaronem lub z ziemniakami, w zależności od preferencji.\n" + "Krok 4\n" +
                "Dodaj sos Knorr i białe wino. Duś całość pod przykryciem przez około 15 minut.\n";

        if (S3.equals("K")) {
            if (bmi < 14) {
                WynikiBMI = "wygłodzenie!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbK + "kal\n" + piers;
            } else if (bmi < 16.5) {
                WynikiBMI = "Masz niedowage!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbK + "kal\n" + piers;
            } else if (bmi >= 16.5 && bmi <= 23.9) {
                WynikiBMI = "Waga prawidłowa!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbK + "kal\n" + piers;
            } else if (bmi >= 24 && bmi <= 28.9) {
                WynikiBMI = "Masz nadwagę, przejdz na diete!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbK + "kal\n" + focaccia;
            } else {
                WynikiBMI = "Jestes otyła, przejdz na diete!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbK + "kal\n" + focaccia;
            }
        } else {
            if (bmi < 16) {
                WynikiBMI = "wygłodzenie!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbM + "kal\n" + piers;
            } else if (bmi < 18.5) {
                WynikiBMI = "Masz niedowage!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbM + "kal\n" + piers;
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                WynikiBMI = "Waga prawidłowa!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbM + "kal\n" + piers;
            } else if (bmi >= 25 && bmi <= 29.9) {
                WynikiBMI = "Masz nadwagę, przejdz na diete!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbM + "kal\n" + focaccia;
            } else {
                WynikiBMI = "Jestes otyły, przejdz na diete!" + "\n" + "Twoje zapotrzebowanie kal. wynosi:" + hbM + "kal\n" + focaccia;
            }
        }

        oblicz = "Wyniki:" + bmi + "\n" + WynikiBMI;
        intent.putExtra(EXTRA_MESSAGE, oblicz);
        startActivity(intent);
    }
}
