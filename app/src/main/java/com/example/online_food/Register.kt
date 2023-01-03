package com.example.online_food

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val btnRegister2 = findViewById<Button>(R.id.btnRegister2)
        btnRegister2.setOnClickListener{
            finish()
        }
    }
}