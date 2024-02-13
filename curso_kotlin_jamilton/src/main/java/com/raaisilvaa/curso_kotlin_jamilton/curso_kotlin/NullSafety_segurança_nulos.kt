package com.raaisilvaa.curso_kotlin_jamilton.curso_kotlin

// Criando uma classe
class Carro {
    var cor = "Vermelho"

    fun acelerar() {

    }
}
// Criando um nulo.
fun main() {
    var carro: Carro? = null
    val cor = carro?.cor ?: "cor padrão"
    println(carro?.cor)
}