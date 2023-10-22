package com.raaisilvaa.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etEmail = findViewById<TextView>(R.id.etEmail)
        val btSend = findViewById<Button>(R.id.btSend)
        val btClear = findViewById<Button>(R.id.btClear)

        btSend.setOnClickListener {
            val email = etEmail.text.toString()


            // is blank verifica se o campo foi digitado corretamente
            if(email.isBlank()) {
                etEmail.error = "Digite seu e-mail"
            // Patterns verifica se o campo foi digitado com o @ ou faltandl algo
            } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "E-mail inválido!"
            } else {
                tvResult.text = etEmail.text.toString()
            }
            // método de fazer o botão limpar efetuar o disparo de limpar
        btClear.setOnClickListener {
            tvResult.text = ""
            etEmail.text = null
        }
    }
}
}

