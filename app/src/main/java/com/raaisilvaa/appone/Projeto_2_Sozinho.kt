package com.raaisilvaa.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Projeto_2_Sozinho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projeto2_sozinho)

        val textResult = findViewById<TextView>(R.id.textResult)
        val textResultPhone = findViewById<TextView>(R.id.textResultPhone)
        val textEmail= findViewById<TextView>(R.id.textEmail)
        val numPhone = findViewById<TextView>(R.id.numPhone)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btLimpar = findViewById<Button>(R.id.btLimpar)

        // Bot!ao clicável
        btEnviar.setOnClickListener {
            // Puxando váriaveis de fora da chave para dentro
            val toEmail = textEmail.text.toString()
            val toPhone = numPhone.text.toString()

            // Condições de validação de e-mail
            if (toEmail.isBlank()) {
                textEmail.error = "Digite seu e-mail!"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(toEmail).matches()) {
                textEmail.error = "E-mail inválido!"
            } else {
                textResult.text = textEmail.text.toString()
            }

            // Função para validar o número de telefone para quantos números e caracteres, etc.
            fun isValidPhoneNumber(phoneNumber: String): Boolean {
                val pattern = Regex("^[0-9]{11,}\$")
                return pattern.matches(phoneNumber)
            }
            // Condições de validação de número de telefone puxando da função acima
            if (toPhone.isBlank()) {
                numPhone.error = "Digite seu número!"
            } else if (!isValidPhoneNumber(toPhone)) {
                numPhone.error = "Número inválido!"
            } else {
                textResultPhone.text = numPhone.text.toString()
            }

            // Animação na tela após certo comportamento
            // THIS: ele referencia a Activy que está sendo trabalhada
            // LENGTH SHORT: feedback mais curto
            // LENGTH LONG: feedback mais longo

            Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show() }

       // Botão clicável e com funcão de limpar todos os campos
        btLimpar.setOnClickListener {
            textResult.text = ""
            textResultPhone.text = ""
            textEmail.text = null
            numPhone.text = null
        }

        // TODO: Implement Toast

        // TODO: Implement Snackbar



        }


    }