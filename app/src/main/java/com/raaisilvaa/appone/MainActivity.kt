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
        val etEmail = findViewById<TextView>(R.id.etEmail)
        val btSend = findViewById<Button>(R.id.btSend)
        val btClear = findViewById<Button>(R.id.btClear)

        btSend.setOnClickListener {
            tvResult.text = etEmail.text.toString()

            Toast.makeText(this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show()
        }

        btClear.setOnClickListener {
            val oldText = tvResult.text

            tvResult.text = null
            etEmail.text = null

            val constraintLayout = findViewById<View>(R.id.constraintLayout)

            Snackbar.make(constraintLayout, "Limpado com sucesso!", Snackbar.LENGTH_INDEFINITE)
                .setAction("Desfazer") {
                    tvResult.text = oldText
                    etEmail.text = oldText

                    Toast.makeText(this, "Desfeito com sucesso!", Toast.LENGTH_SHORT).show()
                }
                .show()
        }


    }

    }