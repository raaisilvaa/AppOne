package com.raaisilvaa.appone

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declarando variáveis do nosso código
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val exibirPhone = findViewById<TextView>(R.id.exibirPhone)
        val etEmail = findViewById<TextView>(R.id.etEmail)
        val digitePhone = findViewById<TextView>(R.id.digitePhone)
        val btSend = findViewById<Button>(R.id.btSend)
        val btClear = findViewById<Button>(R.id.btClear)

        btSend.setOnClickListener {
            val email = etEmail.text.toString()
            val telefone = digitePhone.text.toString()

            fun isValidPhoneNumber(phoneNumber: String): Boolean {
                val pattern = Regex("^[0-9]{11,}\$")
                return pattern.matches(phoneNumber)
            }

            if (email.isBlank()) {
                etEmail.error = "Digite seu e-mail!"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "E-mail inválido!"
            } else if (telefone.isBlank()) {
                digitePhone.error = "Digite seu número!"
            } else if (!isValidPhoneNumber(telefone)) {
                digitePhone.error = "Número inválido!"
            } else {
                tvResult.text = etEmail.text.toString()
                exibirPhone.text = digitePhone.text.toString()
                // Animação quando clicado no botão enviar.
                Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show()
            }
        }

        btClear.setOnClickListener {
            val oldText = tvResult.text
            val oldPhone = exibirPhone.text

            tvResult.text = null
            exibirPhone.text = null
            etEmail.text = null
            digitePhone.text = null

            val constraintLayout = findViewById<View>(R.id.constraintLayout)
            Snackbar.make(constraintLayout, "Apagado com sucesso!", Snackbar.LENGTH_INDEFINITE)
                .setAction("Desfazer") {
                    // Verifique se esta parte do código é executado

                    tvResult.text = oldText
                    exibirPhone.text = oldPhone
                    etEmail.text = oldText
                    digitePhone.text = oldPhone

                    // Código caso a restauração tenha dado certo exibir uma mensagem para o usuário
                    Toast.makeText(this, "Restaurado com sucesso!", Toast.LENGTH_SHORT).show()
                }
                .show()
        }


    }

    }



































/*
// Botão clicável de ação e condições
        btSend.setOnClickListener {
            val email = etEmail.text.toString()
            val telefone = digitePhone.text.toString()
            // Condição que verifica se o e-mail é válido ou não
            if(email.isBlank()) {
                etEmail.error = "Digite seu e-mail"
            } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                etEmail.error = "E-mail inválido"
            } else {
                tvResult.text = etEmail.text.toString()
            }
            // Função para validar o número de telefone
            fun isValidPhoneNumber(phoneNumber: String): Boolean {
                val pattern = Regex("^[0-9]{11,}\$")
                return pattern.matches(phoneNumber)
            }
            // Condição que verifica se o número de telefone é válido ou não
            if(telefone.isBlank()) {
                digitePhone.error = "Digite seu número!"
            } else if(!isValidPhoneNumber(telefone)) {
                digitePhone.error = "Número de telefone inválido!"
            } else {
                exibirPhone.text = digitePhone.text.toString()
            }
        }
        // Botão clicável para limpar os campos
        btClear.setOnClickListener {
            tvResult.text = ""
            exibirPhone.text = ""
            etEmail.text = null
            digitePhone.text = null
        }
 */