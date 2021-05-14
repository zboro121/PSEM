package com.example.kalkulatorbmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulatorbmi.NextActivity
import java.util.*

class NextActivity : AppCompatActivity() {
    var answer1: Button? = null
    var answer2: Button? = null
    var answer3: Button? = null
    var answer4: Button? = null
    var score: TextView? = null
    var question: TextView? = null
    private val mQuestions = Questions()
    private var mAnswer: String? = null
    private var mScore = 0
    private val mQuestionsLenght = mQuestions.mQustions.size
    var r: Random? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        r = Random()
        answer1 = findViewById<View>(R.id.answer1) as Button
        answer2 = findViewById<View>(R.id.answer2) as Button
        answer3 = findViewById<View>(R.id.answer3) as Button
        answer4 = findViewById<View>(R.id.answer4) as Button
        score = findViewById<View>(R.id.score) as TextView
        question = findViewById<View>(R.id.question) as TextView
        score!!.text = "Score:$mScore"
        updateQuestion(r!!.nextInt(mQuestionsLenght))
        answer1!!.setOnClickListener {
            if (answer1!!.text === mAnswer) {
                mScore++
                score!!.text = "Score:$mScore"
                updateQuestion(r!!.nextInt(mQuestionsLenght))
            } else {
                gameOver()
            }
        }
        answer2!!.setOnClickListener {
            if (answer2!!.text === mAnswer) {
                mScore++
                score!!.text = "Score:$mScore"
                updateQuestion(r!!.nextInt(mQuestionsLenght))
            } else {
                gameOver()
            }
        }
        answer3!!.setOnClickListener {
            if (answer3!!.text === mAnswer) {
                mScore++
                score!!.text = "Score:$mScore"
                updateQuestion(r!!.nextInt(mQuestionsLenght))
            } else {
                gameOver()
            }
        }
        answer4!!.setOnClickListener {
            if (answer4!!.text === mAnswer) {
                mScore++
                score!!.text = "Score:$mScore"
                updateQuestion(r!!.nextInt(mQuestionsLenght))
            } else {
                gameOver()
            }
        }
    }

    private fun updateQuestion(num: Int) {
        question!!.text = mQuestions.getQuestion(num)
        answer1!!.text = mQuestions.getChoice1(num)
        answer2!!.text = mQuestions.getChoice2(num)
        answer3!!.text = mQuestions.getChoice3(num)
        answer4!!.text = mQuestions.getChoice4(num)
        mAnswer = mQuestions.getCorrectAnswer(num)
    }

    private fun gameOver() {
        val alertDialogBuilder = AlertDialog.Builder(this@NextActivity)
        alertDialogBuilder
                .setMessage("Game Over! Your score is: $mScore points.")
                .setCancelable(false)
                .setPositiveButton("New Game"
                ) { dialogInterface, i -> startActivity(Intent(applicationContext, NextActivity::class.java)) }
                .setNegativeButton("Exit"
                ) { dialogInterface, i -> finish() }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}