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

        btEnviar.setOnClickListener {
            val email = textEmail.text.toString()
            val phone = numPhone.text.toString()


            if(email.isBlank() || phone.isBlank()) {
                textEmail.error = "Digite seu e-mail"
                numPhone.error = "Digite seu telefone"

            } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                textEmail.error = "E-mail inválido!"
                numPhone.error = "Número de telefone inválido!"
            } else {
                textResult.text = textEmail.text.toString()
                textResultPhone.text = numPhone.text.toString()
            }

            btLimpar.setOnClickListener {
                textResultPhone.text = ""
                textResult.text = ""
                textEmail.text = null
                numPhone.text = null
            }





        }


    }
}