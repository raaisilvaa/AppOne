package com.raaisilvaa.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.TextView

class Projeto_2_Sozinho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projeto2_sozinho)

        val textResult = findViewById<TextView>(R.id.textResult)
        val textResultPhone = findViewById<TextView>(R.id.textResultPhone)
        val textEmail = findViewById<TextView>(R.id.textEmail)
        val numPhone = findViewById<TextView>(R.id.numPhone)
        val btEnviar = findViewById<TextView>(R.id.btEnviar)
        val btLimpar = findViewById<TextView>(R.id.btLimpar)

        // Aqui, você está declarando duas variáveis booleanas, emailError e phoneError,
        // para rastrear se há erros nos campos de e-mail e telefone.
        // Inicialmente, eles são definidos como false, o que significa que não há erros.
        var emailError = false
        var phoneError = false

        btEnviar.setOnClickListener {
            val email = textEmail.text.toString()
            val phone = numPhone.text.toString()

            // Você está limpando quaisquer erros anteriores, definindo as mensagens de erro para null,
            // para garantir que as mensagens de erro anteriores não sejam exibidas.
            textEmail.error = null
            numPhone.error = null

            if (email.isBlank() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                textEmail.error = "E-mail inválido!"
                emailError = true
            } else {
                emailError = false
            }

            if (phone.isBlank()) {
                numPhone.error = "Digite seu telefone"
                phoneError = true
            } else {
                phoneError = false
            }
            // Aqui, você está verificando se não há erros nos campos de e-mail e telefone
            // (ou seja, emailError e phoneError são false). Se não houver erros,
            // você atualiza os campos textResult e textResultPhone com os valores de email e phone.
            if (!emailError && !phoneError) {
                textResult.text = email
                textResultPhone.text = phone
            }
        }
        // Dentro do bloco de clique do botão "Limpar", você está redefinindo os campos de resultados
        // textResult e textResultPhone) e os campos de entrada (textEmail e numPhone)
        // para seus estados iniciais vazios ou nulos. Além disso, você está redefinindo as
        // variáveis emailError e phoneError para false, para indicar que não há mais erros.
        btLimpar.setOnClickListener {
            textResultPhone.text = ""
            textResult.text = ""
            textEmail.text = null
            numPhone.text = null
            emailError = false
            phoneError = false
        }





        }


    }