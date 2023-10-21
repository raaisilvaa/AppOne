package com.raaisilvaa.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textOne = findViewById<TextView>(R.id.textOne)
        val textTwo = findViewById<TextView>(R.id.textTwo)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        // Button Send Behavior
        buttonSubmit.setOnClickListener {
            val email = textTwo.text.toString()

            if(email.isBlank()) {
                textTwo.error = "E-mail inválido!"
            } else {
                textOne.text = textTwo.text.toString()
            }
        }
        buttonClear.setOnClickListener {
            textOne.text = ""
            textTwo.text = ""
        }
    }
}