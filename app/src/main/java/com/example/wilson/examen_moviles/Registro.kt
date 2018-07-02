package com.example.wilson.examen_moviles

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.wilson.examen_moviles.entidades.RegistroNuevo

import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.content_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        botonIniciarSesion.setOnClickListener {
            view: View ->  irAActividadLugares()
        }

        botonRegistro.setOnClickListener {
            view: View? ->  irAActividadRegistroNuevo()
        }
    }
    private fun irAActividadLugares() {
        intent = Intent(this, Lugares::class.java)
        startActivity(intent)
    }
    private fun irAActividadRegistroNuevo() {
        intent = Intent(this, RegistroNuevo::class.java)
        startActivity(intent)
    }

}
