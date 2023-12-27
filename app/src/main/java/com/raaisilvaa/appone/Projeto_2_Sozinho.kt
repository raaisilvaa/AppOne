package com.raaisilvaa.appone

import android.os.Build
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class Projeto_2_Sozinho : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projeto2_sozinho)

        val textResult = findViewById<TextView>(R.id.textResult)
        val textResultPhone = findViewById<TextView>(R.id.textResultPhone)
        val textEmail= findViewById<TextView>(R.id.textEmail)
        val numPhone = findViewById<TextView>(R.id.numPhone)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btLimpar = findViewById<Button>(R.id.btLimpar)

        // Botão clicável
        btEnviar.setOnClickListener {
            // Puxando váriaveis de fora da chave para dentro
            val toEmail = textEmail.text.toString()
            val toPhone = numPhone.text.toString()

            fun isValidPhoneNumber(phoneNumber: String): Boolean {
                val pattern = Regex("^[0-9]{11,}\$")
                return pattern.matches(phoneNumber)
            }

            // Condições de validação de e-mail
            if (toEmail.isBlank()) {
                textEmail.error = "Digite seu e-mail!"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(toEmail).matches()) {
                textEmail.error = "E-mail inválido!"
            } else if (toPhone.isBlank()) {
                numPhone.error = "Digite seu número!"
            } else if (!isValidPhoneNumber(toPhone)) {
                numPhone.error = "Número inválido!"
            } else {
                textResult.text = textEmail.text.toString()
                textResultPhone.text = numPhone.text.toString()
                // Mostrar o Toast somente quando ambos os campos forem válidos
                Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show()
            }
        }

        // Botão clicável e com funcão de limpar todos os campos
        btLimpar.setOnClickListener {
            val oldText = textResult.text
            val oldPhone = textResultPhone.text

            textResult.text = null
            textResultPhone.text = null
            textEmail.text = null
            numPhone.text = null

            val constraintLayout = findViewById<View>(R.id.constraintLayout)
            Snackbar.make(constraintLayout, "Apagado com sucesso!", Snackbar.LENGTH_INDEFINITE)
                .setAction("Desfazer") {
                    textResult.text = oldText
                    textEmail.text = oldText
                    textResultPhone.text = oldPhone
                    numPhone.text = oldPhone

                    Toast.makeText(this, "Desfeito com sucesso!", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        }

        }
