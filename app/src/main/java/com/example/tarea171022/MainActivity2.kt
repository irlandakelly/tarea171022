package com.example.tarea171022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnUno: Button = findViewById(R.id.btnDosUno)
        btnUno.setOnClickListener { goToActivity1() }
        val btnTres: Button = findViewById(R.id.btnDosTres)
        btnTres.setOnClickListener { goToActivity3() }
    }

    fun goToActivity1() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun goToActivity3() {
        val intent= Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }

}