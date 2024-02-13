@file:Suppress("UNREACHABLE_CODE")

package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objeto

import androidx.annotation.VisibleForTesting
import kotlin.time.times

/*
CRIE UM APP QUE TRANSFORME NÚMERO DE DOUBLE PARA INTEIRO.
1- criar as variáveis.
2- criar a soma.
3- criar transformação de double para inteiro.

fun main() {
    val num1 = 5.1
    val num2 = 3.2
    val resultado = (num1 + num2).toInt()

    println("Resultado: $resultado")
}
*/
/*
fun main() {
    val nota1: Double = 9.9
    val nota2: Double = 6.5
    val nota3: Double = 8.1

    val resultado = (nota1 + nota2 + nota3).toInt() / 3

    println(resultado)
}
*/
/*
class Retangulo() {
    val comprimento: Double = 4.0
    val largura: Double = 3.0

    fun calculaArea(): Int {
        return (comprimento * largura).toInt()
    }
}

fun main() {
    val classeRetangulo = Retangulo()
    val resultado = classeRetangulo.calculaArea()

    println(resultado)

}
*/
/*
fun verificarParImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("$numero é um número par.")
    } else {
        println("$numero é um numero ímpar.")
    }
}

fun main() {
    val numero1 = 10
    val numero2 = 7

    verificarParImpar(numero1)
    verificarParImpar(numero2)
}
*/


fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 1
    println("$n is spelt as '${number2word[n]}'")
}