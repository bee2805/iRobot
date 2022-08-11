package com.example.irobot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.irobot.databinding.ActivityQuestionBinding
import com.example.irobot.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {

    // define our binding view
    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get extra from intent
        val username = intent.getStringExtra("username")

        //call for all my questions
        var questions = getAllQuestions()

        //eg. of log to logcat
        Log.i("Question Count: ", "${questions[0].questionText}")

        binding.tvQuestionText.text = "Welcome $username, your first question is ${questions[1].questionText}"

        // R.id.tv_question_text.setText = (questions[0].questionText)
    }
}