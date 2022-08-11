package com.example.irobot.models

//data keyword = blueprint
data class Question (
    val id: Int,
    val questionText: String,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String
    // Val answer: Int
    // val active: Boolean
)