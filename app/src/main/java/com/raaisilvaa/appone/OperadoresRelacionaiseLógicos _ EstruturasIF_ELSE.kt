package com.raaisilvaa.appone// Operadores relacionais, exemplos:
/*
fun com.raaisilvaa.appone.main() {
    var igual: Boolean = 11 == 10 // Igual a
    var diferente: Boolean = 11 != 11 // Diferente
    var maiorque: Boolean = 80 > 50 // Maior que
    var menorque: Boolean = 100 < 50 // Menor que
    var maiorouigual: Boolean = 100 >= 100 // Maior ou igual
    var menorouigual: Boolean = 200 <= 100 // Menor ou igual
}

fun com.raaisilvaa.appone.main() {
    val compras = 300
    val resultado = compras >= 300
    println(resultado)
}
*/

/* Operadores Lógicos
* Promoção Mercado Livre
* Compras >= 300 OU idade >= 50
* &&: E  ||: OU

fun com.raaisilvaa.appone.main() {
    val compras = 200
    val idade = 50
    val resultado = compras >= 200 && idade >= 50
    println(resultado)
}
*/
/*
fun com.raaisilvaa.appone.main() {
    val maiorIdade = 18

    if (maiorIdade >= 18) {
        println("Pode entrar!")
    } else {
        println("Você é menor de idade!")
    }

}
*/
/*
fun com.raaisilvaa.appone.main() {
    val desconto = 900
    val idade = 18

    if (desconto >= 1000 && idade >= 18) {
        println("DESCONTO DE 30%")
    } else {
        println("Volte sempre!")
    }
}
*/
// Condições para ver se o número é maior ou menos ou igual.
fun main() {
    val numero1 = 10
    val numero2 = 20

    if (numero1 > numero2) {
        println("Número 1 é o maior")
    } else if (numero2 > numero1) {
        println("Número 2 é o maior")
    } else if (numero1 == numero2) {
        println("Números iguais!")
    }
}