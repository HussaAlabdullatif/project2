package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()

        val myname = "Hussa"
        val backar = findViewById<ImageView>(R.id.backsignn)

        backar.setOnClickListener {
            val intent = Intent (this , MainActivity2:: class.java)
            startActivity(intent)

        }




        Toast.makeText(this, "welcome back $myname", Toast.LENGTH_SHORT).show()


    }
    }

