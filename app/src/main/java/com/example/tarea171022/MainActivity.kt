package com.example.tarea171022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDos: Button = findViewById(R.id.btnUnoDos)
        btnDos.setOnClickListener { goToActivity2() }
        val btnTres: Button = findViewById(R.id.btnUnoTres)
        btnTres.setOnClickListener { goToActivity3() }
    }

    fun goToActivity2() {
        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun goToActivity3() {
        val intent= Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }

}