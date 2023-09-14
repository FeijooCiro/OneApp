package com.mardelapps.oneapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var Email: EditText
    private lateinit var Contrasena: EditText
    private lateinit var Enviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Email = findViewById(R.id.editTextTextEmailAddress)
        Contrasena = findViewById(R.id.editTextTextPassword)
        Enviar = findViewById(R.id.button)

        Enviar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (loginVerification.verify(
                Email.text.toString(),
                Contrasena.text.toString()
            )
        ) {
            Log.d("Contraseña Correcta", Contrasena.text.toString())
            Toast.makeText(this, "Datos Recibidos", Toast.LENGTH_SHORT).show()
        } else {
            Log.d("Contraseña Incorrecta", Contrasena.text.toString())
            Toast.makeText(this, "Algo Falló", Toast.LENGTH_SHORT).show()
        }
    }
}
