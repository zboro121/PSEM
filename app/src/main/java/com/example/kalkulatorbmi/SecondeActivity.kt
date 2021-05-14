package com.example.kalkulatorbmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondeActivity : AppCompatActivity() {
    var waga: EditText? = null
    var wzrost: EditText? = null
    var wiek: EditText? = null
    var wynikitext: TextView? = null
    var sex: TextView? = null
    var oblicz: String? = null
    var WynikiBMI: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconde)
        waga = findViewById(R.id.waga)
        wzrost = findViewById(R.id.wzrost)
        wynikitext = findViewById(R.id.wynik)
        sex = findViewById(R.id.plec)
        wiek = findViewById(R.id.wiek)
    }

    fun sendMessage(view: View?) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val S1 = waga!!.text.toString()
        val S2 = wzrost!!.text.toString()
        val S3 = sex!!.text.toString()
        val S4 = wiek!!.text.toString()
        val wartoscWagi: Float = S1.toFloat()
        val wartoscWzrostu: Float = S2.toFloat() / 100
        val bmi = wartoscWagi / (wartoscWzrostu * wartoscWzrostu)
        val wartoscWiek: Float = S4.toFloat()
        val hbM = 66.5 + 17.7 * wartoscWagi - 6.8 * wartoscWiek
        val hbK = 655.1 + 9.6 * wartoscWagi + 1.9 * wartoscWzrostu - 4.7 * wartoscWiek
        val focaccia = """
               Focaccia z pomidorkami, grillowanym kurczakiem i rukolą
               Krok 1
               Focaccie przekrój wzdłuż na pół, wytnij większe prostokąty i posmaruj oliwą. Posyp przyprawą Knorr i zapiecz w piekarniku z funkcją grilla.
               Krok 2
               Kurczaka pokrój w mniejsze kawałki, skrop oliwą, dopraw przyprawą Knorr oraz przeciśniętym czosnkiem i usmaż na patelni grillowej.
               Krok 3
               Pomidorki pokrój na pół. Rukolę umyj i lekko osusz. Natkę pietruszki posiekaj.
               Krok 4
               Jak focaccia będzie lekko rumiana - ponownie skrop ją oliwą. Na wierzchu połóż garść rukoli, ułóż na wierzchu kawałki kurczaka oraz połówki pomidorków. Posyp dodatkowo posiekaną pietruszką oraz przyprawą śródziemnomorską Knorr.
               
               """.trimIndent()
        val piers = """
               Piersi z kurczaka w sosie po baskijsku
               Krok 1
               Przekrój każdą pierś kurczaka ukośnie na pół i podsmaż na patelni do momentu, gdy mięso się zrumieni.
               Krok 2
               Posiekaj cebulę i czosnek, dodaj do kurczaka, podsmaż wszystko przez chwilę.
               Krok 3
               Podawaj danie z ryżem, makaronem lub z ziemniakami, w zależności od preferencji.
               Krok 4
               Dodaj sos Knorr i białe wino. Duś całość pod przykryciem przez około 15 minut.
               
               """.trimIndent()
        WynikiBMI = if (S3 == "K") {
            if (bmi < 14) {
                """
     wygłodzenie!
     Twoje zapotrzebowanie kal. wynosi:${hbK}kal
     $piers
     """.trimIndent()
            } else if (bmi < 16.5) {
                """
     Masz niedowage!
     Twoje zapotrzebowanie kal. wynosi:${hbK}kal
     $piers
     """.trimIndent()
            } else if (bmi >= 16.5 && bmi <= 23.9) {
                """
     Waga prawidłowa!
     Twoje zapotrzebowanie kal. wynosi:${hbK}kal
     $piers
     """.trimIndent()
            } else if (bmi >= 24 && bmi <= 28.9) {
                """
     Masz nadwagę, przejdz na diete!
     Twoje zapotrzebowanie kal. wynosi:${hbK}kal
     $focaccia
     """.trimIndent()
            } else {
                """
     Jestes otyła, przejdz na diete!
     Twoje zapotrzebowanie kal. wynosi:${hbK}kal
     $focaccia
     """.trimIndent()
            }
        } else {
            if (bmi < 16) {
                """
     wygłodzenie!
     Twoje zapotrzebowanie kal. wynosi:${hbM}kal
     $piers
     """.trimIndent()
            } else if (bmi < 18.5) {
                """
     Masz niedowage!
     Twoje zapotrzebowanie kal. wynosi:${hbM}kal
     $piers
     """.trimIndent()
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                """
     Waga prawidłowa!
     Twoje zapotrzebowanie kal. wynosi:${hbM}kal
     $piers
     """.trimIndent()
            } else if (bmi >= 25 && bmi <= 29.9) {
                """
     Masz nadwagę, przejdz na diete!
     Twoje zapotrzebowanie kal. wynosi:${hbM}kal
     $focaccia
     """.trimIndent()
            } else {
                """
     Jestes otyły, przejdz na diete!
     Twoje zapotrzebowanie kal. wynosi:${hbM}kal
     $focaccia
     """.trimIndent()
            }
        }
        oblicz = "Wyniki:$bmi\n$WynikiBMI"
        intent.putExtra(EXTRA_MESSAGE, oblicz)
        startActivity(intent)
    }

    companion object {
        const val EXTRA_MESSAGE = "com.example.kalkulatorbmi.MESSAGE"
    }
}