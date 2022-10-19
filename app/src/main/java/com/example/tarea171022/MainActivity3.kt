package com.example.tarea171022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btnUno: Button = findViewById(R.id.btnTresUno)
        btnUno.setOnClickListener { goToActivity1() }
        val btnTres: Button = findViewById(R.id.btnTresDos)
        btnTres.setOnClickListener { goToActivity2() }
    }

    fun goToActivity1() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun goToActivity2() {
        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}