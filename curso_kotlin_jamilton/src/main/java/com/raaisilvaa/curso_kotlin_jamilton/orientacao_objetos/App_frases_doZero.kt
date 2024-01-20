package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

import java.util.Timer
import java.util.TimerTask

class NumerosSorte {
    val numeros = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    fun geradorNumeros():Int {
        return numeros.random()
    }
}

fun main() {
    val exibirNumeros = NumerosSorte()

    // Usar Timer para agendar a tarefa de sorteio a cada 3 segundos
    Timer().scheduleAtFixedRate(object : TimerTask() {
        override fun run() {
            val sortearNumero = exibirNumeros.geradorNumeros()
            println(sortearNumero)
        }
    }, 0, 8000) // Iniciar imediatamente e repetir a cada 3000 milissegundos (3 segundos)
}