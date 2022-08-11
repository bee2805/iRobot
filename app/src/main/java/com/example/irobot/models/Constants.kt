package com.example.irobot.models

import com.example.irobot.R

object Constants {

    // This function will return all the questions
    fun getAllQuestions() : ArrayList<Question>{
        // 1. Create empty array list
        var allQuestions = ArrayList<Question>()

        // TODO: 2. Create data
        val que1 = Question(
            1,
            "Are you a robot?",
            R.drawable.ic_help,
            "Yes",
            "No"
        )

        val que2 = Question(
            2,
            "What is love?",
            R.drawable.ic_help,
            "I don't know, something you can eat?",
            "An emotion I get when looking at you ;)"
        )

        // 4. Add question to array
        allQuestions.add(que1)
        allQuestions.add(que2)

        // 3. return data
        return allQuestions;
    }

}