package com.example.online_food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


lateinit var btnFragMakanan : TextView
lateinit var btnFragmMinuman : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_menu)

        btnFragMakanan = findViewById(R.id.btnFragMakanan)
        btnFragmMinuman = findViewById(R.id.btnFragMinuman)

        btnFragMakanan.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.rvLayout, MakananFragment())
            fr.commit()
        }
        btnFragmMinuman.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.rvLayout, MinumanFragment())
            fr.commit()
        }

        var fr = supportFragmentManager.beginTransaction()
        fr.replace(R.id.rvLayout, MakananFragment())
        fr.commit()

        Log.i("Main Activity","onCreat")

    }
}
