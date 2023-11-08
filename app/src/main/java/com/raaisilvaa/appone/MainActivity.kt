package com.raaisilvaa.appone

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declarando variáveis do nosso código
        val tvNome = findViewById<TextView>(R.id.tvNome)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btSend = findViewById<Button>(R.id.btSend)
        val btClear = findViewById<Button>(R.id.btClear)

        btSend.setOnClickListener {
            val nomeCompleto = etNome.text.toString()
            val emailCompleto = etEmail.text.toString()

            if (nomeCompleto.isBlank()) {
                etNome.error = "Digite seu nome!"
            } else if (!nomeCompleto.contains(" ")) {
                etNome.error = "Nome inválido!"
            } else {
                tvNome.text = etNome.text.toString()
            }

            if (emailCompleto.isBlank()) {
                etEmail.error = "Digite seu e-mail!"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailCompleto).matches()) {
                etEmail.error = "E-mail inválido!"
            } else {
                tvEmail.text = etEmail.text.toString()

                Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show()
            }

        }

        btClear.setOnClickListener {
            val oldNome = tvNome.text
            val oldEmail = tvEmail.text
            val oldNome1 = etNome.text
            val oldEmail1 = etEmail.text

            tvNome.text = null
            tvEmail.text = null
            etNome.text = null
            etEmail.text = null

            val constraintLayout = findViewById<View>(R.id.constraintLayout)

            Snackbar.make(constraintLayout, "Limpado com sucesso!", Snackbar.LENGTH_INDEFINITE)
                .setAction("Desfazer") {
                    tvNome.text = oldNome
                    tvEmail.text = oldEmail
                    etNome.text = oldNome1
                    etEmail.text = oldEmail1



                    Toast.makeText(this, "Desfeito com sucesso!", Toast.LENGTH_SHORT).show()
                }
                .show()
        }


    }
}
