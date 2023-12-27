package com.raaisilvaa.appone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textNome = findViewById<TextView>(R.id.textNome)
        val textTelefone = findViewById<TextView>(R.id.textTelefone)
        val digiteName = findViewById<TextView>(R.id.digiteName)
        val digiteNumber = findViewById<TextView>(R.id.digiteNumber)
        val botaoSalvar = findViewById<Button>(R.id.botaoSalvar)
        val botaoApagar = findViewById<Button>(R.id.botaoApagar)
        val constraintLayout = findViewById<View>(R.id.constraintLayout)

        botaoSalvar.setOnClickListener {
            val nameDigite = digiteName.text.toString()
            val numberDigite = digiteNumber.text.toString()

            fun isValidPhoneNumber(phoneNumber: String): Boolean {
                val pattern = Regex("^[0-9]{11,}\$")
                return pattern.matches(phoneNumber)
            }

            if (nameDigite.isBlank()) {
                digiteName.error = "Type your name"
            } else if (!nameDigite.contains(" ")) {
                digiteName.error = "Invalid name"
            } else if (numberDigite.isBlank()) {
                digiteNumber.error = "Enter your number"
            }  else if (!isValidPhoneNumber(numberDigite)){
                digiteNumber.error = "Invalid number"
            } else {
                textNome.text = digiteName.text.toString()
                textTelefone.text = digiteNumber.text.toString()

                Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show()
            }

            botaoApagar.setOnClickListener {
                val voltarTexto = textNome.text
                val voltarNumero = textTelefone.text

                textNome.text = null
                textTelefone.text = null
                digiteName.text = null
                digiteNumber.text = null

                Snackbar.make(constraintLayout, "Apagado com sucesso!", Snackbar.LENGTH_SHORT)
                    .setAction("Desfazer") {
                        textNome.text = voltarTexto
                        textTelefone.text = voltarNumero
                        digiteName.text = voltarTexto
                        digiteNumber.text = voltarNumero

                        Toast.makeText(this, "Desfeito com sucesso!", Toast.LENGTH_SHORT).show()
                    }

                    .show()
            }

        }

    }
}