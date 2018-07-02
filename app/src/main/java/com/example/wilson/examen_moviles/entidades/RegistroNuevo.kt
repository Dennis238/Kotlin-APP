package com.example.wilson.examen_moviles.entidades

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.wilson.examen_moviles.Lugares
import com.example.wilson.examen_moviles.R

import kotlinx.android.synthetic.main.activity_registro_nuevo.*
import kotlinx.android.synthetic.main.content_registro_nuevo.*

class RegistroNuevo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_nuevo)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        botonEnviar.setOnClickListener{
            view: View? -> irAActividadLugares()
        }
    }

    private fun irAActividadLugares(){

        intent = Intent(this, Lugares::class.java)
        startActivity(intent)
    }

}
