package com.example.kalkulatorbmi

class Questions {
    var mQustions = arrayOf(
            "Covid19 należy do grupy koronawirusów. Atakuje on:?",
            "CO oznacza skrot DDM?",
            "Osoba, która nie przestrzega środków ostrożności zaraża około?",
            "Ile wynosi zalecany dystans miedzy osobami w Pandemii [m]?",
            "Czy miałeś Covid-19?",
            "Czy Covid-19 przybył z Kosmosu"
    )
    private val mChoices = arrayOf(arrayOf("płuca i drogi oddechowe", "płuca", "drogi oddechowe", "jelita"), arrayOf("dom-dezynfekcja-maseczka", "dystans-dezynfekcja-maseczka", "dezynfekcja-dystans-maseczka", "dom-dezynfekcja-mycie rąk"), arrayOf("2 osób", "4-5 osób", "5 osób", "2-3 osób"), arrayOf("2", "3", "4", "2.5"), arrayOf("Tak", "Nie", "Nie wiem", "Może"), arrayOf("Tak", "Nie", "Nie wiem", "Może"))
    private val mCorrectAnswers = arrayOf("płuca i drogi oddechowe", "dezynfekcja-dystans-maseczka", "2-3 osób", "2.5", "Tak", "Tak")
    fun getQuestion(a: Int): String {
        return mQustions[a]
    }

    fun getChoice1(a: Int): String {
        return mChoices[a][0]
    }

    fun getChoice2(a: Int): String {
        return mChoices[a][1]
    }

    fun getChoice3(a: Int): String {
        return mChoices[a][2]
    }

    fun getChoice4(a: Int): String {
        return mChoices[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return mCorrectAnswers[a]
    }
}