package com.example.adivinhenumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
      val numero = Random(1).nextInt(100)
      var editValor : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editValor = findViewById<EditText>(R.id.ed_palpite)

    }

    fun verificar(view: View) {
        val palpite = editValor?.text.toString().toInt()
        if(palpite==numero) {
            Toast.makeText(this, "Acertou!", Toast.LENGTH_LONG).show()
        } else if(palpite > numero) {
            Toast.makeText(this, "Está acima!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Está abaixo!", Toast.LENGTH_LONG).show()
        }
    }
}