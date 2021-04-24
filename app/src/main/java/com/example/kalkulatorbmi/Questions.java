package com.example.kalkulatorbmi;

public class Questions {

    public String mQustions[] = {
            "Covid19 należy do grupy koronawirusów. Atakuje on:?",
            "CO oznacza skrot DDM?",
            "Osoba, która nie przestrzega środków ostrożności zaraża około?",
            "Ile wynosi zalecany dystans miedzy osobami w Pandemii [m]?",
            "Czy miałeś Covid-19?",
            "Czy Covid-19 przybył z Kosmosu"

    };

    private String mChoices [][] = {
            {"płuca i drogi oddechowe", "płuca", "drogi oddechowe", "jelita"},
            {"dom-dezynfekcja-maseczka", "dystans-dezynfekcja-maseczka", "dezynfekcja-dystans-maseczka", "dom-dezynfekcja-mycie rąk"},
            {"2 osób", "4-5 osób", "5 osób", "2-3 osób"},
            {"2", "3", "4", "2.5"},
            {"Tak", "Nie", "Nie wiem", "Może"},
            {"Tak", "Nie", "Nie wiem", "Może"}

    };

    private String mCorrectAnswers[] = {"płuca i drogi oddechowe", "dezynfekcja-dystans-maseczka", "2-3 osób", "2.5", "Tak", "Tak"};

    public String getQuestion(int a) {
        String question = mQustions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
