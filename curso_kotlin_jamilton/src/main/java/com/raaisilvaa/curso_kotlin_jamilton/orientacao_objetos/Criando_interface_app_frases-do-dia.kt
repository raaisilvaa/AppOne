package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.raaisilvaa.curso_kotlin_jamilton.R

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    val frases = arrayOf("Frase 1", "Frase 1", "Frase 1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gerarFrase(view: View) {
        // Encontrar o TextView no layout usando seu ID
        val texto = findViewById<TextView>(R.id.textResult)

        // Gerar um número aleatório entre 0 e 2
        val numeroAleatorio = (0..3).random()

        // Obter a frase correspondente ao número aleatório gerado
        val frase = frases[numeroAleatorio]

        // Definir o texto do TextView com a frase gerada
        texto.text = frase
    }

    fun exibirFrases(view: View) {
        // Encontrar o TextView no layout usando seu ID
        val texto: TextView = findViewById(R.id.textResult)

        // Inicializar uma string para armazenar o resultado final
        var textoResultado = ""

        // Iterar sobre cada frase no array de frases
        for (frase in frases) {
            // Adicionar a frase atual à string de resultado, seguida por uma quebra de linha
            textoResultado += "$frase\n"
        }

        // Definir o texto do TextView com a string de resultado
        texto.text = textoResultado
    }

}