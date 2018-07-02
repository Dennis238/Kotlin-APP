package com.example.wilson.examen_moviles

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.wilson.examen_moviles.entidades.IngresarVoz

import kotlinx.android.synthetic.main.activity_lugares.*
import kotlinx.android.synthetic.main.content_lugares.*

class Lugares : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        botonUbicacionesAnteriores.setOnClickListener{
            view: View? ->  irAActividadUbicacionesAnteriores()
        }

        botonIngresarVoz.setOnClickListener{
            view: View? ->  irAActividadIngresarVoz()
        }

    }

    private fun irAActividadUbicacionesAnteriores (){
        intent = Intent(this, ActividadListar::class.java)

        startActivity(intent)
    }

    private fun irAActividadIngresarVoz (){
        intent = Intent(this, IngresarVoz::class.java)
        startActivity(intent)
    }
}
