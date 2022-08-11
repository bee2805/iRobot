package com.example.irobot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.irobot.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  //This sets what XML frontend to use

        // example of getting access for btn click
        binding.btnStart.setOnClickListener {
            // Functionality onClick
            // Get access to input value
            val username = binding.etUsername.text.toString()

            // Check if input field is empty
            if(username.toString() == ""){
                //Add validation (Toast or SnackBar)
                // 1. toast
                //var toast = Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()

                binding.etUsername.error = "Please Add Username"
            } else {
                // Navigate to next activity
                Log.i("Clicked!", "$username")

                //intent navigation
                //context from where intent happens
                //new activity
                val intent = Intent(this, QuestionActivity::class.java)

                // pass data
                intent.putExtra("username", username)

                startActivity(intent)
                //finish()
            }
        }
    }
}