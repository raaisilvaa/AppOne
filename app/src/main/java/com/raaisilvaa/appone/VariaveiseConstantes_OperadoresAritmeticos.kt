package com.raaisilvaa.appone
// Variáveis e constantes e tipos primitivos.
var idade: Byte = 52 // Números entre -128 e 127
var idade2: Int = 123456 // Representa números inteiros padrão de 32 bits.
var idade3: Short = 1000 // Representa números inteiros curtos de 16 bits.
var idade4: Long = 987654321L // Representa números inteiros longos de 64 bits.
var idade5: Float = 3.14f //Representa números de ponto flutuante de precisão simples de 32 bits.
var idade6: Double = 2.71828 // Representa números de ponto flutuante de dupla precisão de 64 bits.
var idade7: Char = 'A' // Representa um caractere Unicode.
var idade8: Boolean = true or false // Verdadeiro ou falso.

// Operadores aritméticos
var somar = 10 + 20
var subtrair = 20 - 5
var multiplicar = 10 * 2
var dividir = 10 / 2
var restoDivisao = 10 % 3 // 1
/* Precedência de operadores
1.Parênteses
2.Multiplicação e divisão
3.Subtração e adição
*/

// Convertendo número para inteiro.
fun main() {
    val peso = 83
    val altura = 1.83

    val resultado = peso / altura

    val resultadoInt = resultado.toInt()

    println(resultadoInt)
}




