package com.example.tarea171022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val btnUno: Button = findViewById(R.id.btnCuatroUno)
        btnUno.setOnClickListener { goToActivity1() }
    }

    fun goToActivity1() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}