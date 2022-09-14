package com.bignerdranch.androin.pr11

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AboutActivity : Activity() {

    public lateinit var NameBook: EditText
    public lateinit var CreaterBook: EditText
    public lateinit var CountListBook: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)
            NameBook = findViewById(R.id.NameBookEdit)
            CreaterBook = findViewById(R.id.CreaterBookEdit)
            CountListBook = findViewById(R.id.CountListBookEdit)
        }
}