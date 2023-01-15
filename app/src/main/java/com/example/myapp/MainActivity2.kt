package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()



        val loginbutton = findViewById<Button>(R.id.loginButton)
        val nametext = findViewById<EditText>(R.id.editTextTextPersonName)
        val passwordtext = findViewById<EditText>(R.id.editTextTextPassword)

        val myname = "Hussa"
        val pass = "12345"


        loginbutton.setOnClickListener {
            val username =nametext.text.toString()
            val password = passwordtext.text.toString()

        if (username==myname.toString()&&password==pass.toString()){
            val intent = Intent (this , MainActivity3:: class.java)
            startActivity(intent)

        }
            else {
            Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
        }
    }}
}