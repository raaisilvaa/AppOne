package com.raaisilvaa.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declarando variáveis do nosso código
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val exibirPhone = findViewById<TextView>(R.id.exibirPhone)
        val etEmail = findViewById<TextView>(R.id.etEmail)
        val digitePhone = findViewById<TextView>(R.id.digitePhone)
        val btSend = findViewById<TextView>(R.id.btSend)
        val btClear = findViewById<TextView>(R.id.btClear)

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

}
}