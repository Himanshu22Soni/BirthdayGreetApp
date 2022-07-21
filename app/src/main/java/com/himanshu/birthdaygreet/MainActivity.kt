package com.himanshu.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var birthdayButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        birthdayButton = findViewById(R.id.birthdayButton)
        val inputtedValue = findViewById<EditText>(R.id.inputField)
        birthdayButton.setOnClickListener {
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, inputtedValue.text.toString())
            startActivity(intent)
        }
    }


}