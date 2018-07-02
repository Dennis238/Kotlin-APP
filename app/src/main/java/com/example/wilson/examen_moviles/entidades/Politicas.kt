package com.example.wilson.examen_moviles.entidades

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.wilson.examen_moviles.R
import com.example.wilson.examen_moviles.Registro

import kotlinx.android.synthetic.main.activity_politicas.*
import kotlinx.android.synthetic.main.content_politicas.*

class Politicas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politicas)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        botonLeerTodo.setOnClickListener {
            view: View ->  irAActividadPoliticasCompletas()
        }
        botonAceptar.setOnClickListener {
            view: View ->  irAActividadRegistro()
        }

         }

        private fun irAActividadPoliticasCompletas() {
            intent = Intent(this, PoliticasCompletas2::class.java)
            startActivity(intent)
        }

        private fun irAActividadRegistro() {
            intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }




}
