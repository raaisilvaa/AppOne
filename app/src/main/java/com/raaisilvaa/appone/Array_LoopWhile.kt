package com.raaisilvaa.appone

import android.util.Patterns
/*
fun main() {
    val nome = arrayOf("Raí", "Silva", "Roberto")
    println(nome[2])
    println(nome[1])
}
*/
/*
fun sol() {
    val nome = intArrayOf(1, 10, 100, 1000) // array para números inteiros
    println(nome)
}
*/
// conversas do Whatsapp precisam de array como no codigo abaixo.
/*
fun main() {
    val conversas = arrayOf(
        arrayOf("João", "Olá, tudo bem?"),
        arrayOf("Maria", "Tudo certo"),
        arrayOf("Seedorf", "Ok!")
    )

    println(conversas[1][0]) // 1 vem das filerias e 0 da posição dentro das chaves.
}
*/
/*
fun main() {
    val name = intArrayOf(50, 500, 5000, 50000)
    val conversas = arrayOf(
        arrayOf("João", "Solto"),
        arrayOf("Cintia", "Oliveira"),
        arrayOf("Maria", "Santos"),
    )

    println(name[2])
    println(conversas[0][1])
    println("name: ${name[2]}, conversas: ${conversas[0][1]}")
}
*/
// LOOPS WHILE: While significado enquanto
/*
fun main() {
    var numero = 1
    /*numero += 2 // somar +2 na variável, serve para menos, divisão e multiplicação também.
    numero += 2 // somar +2 na variável, serve para menos, divisão e multiplicação também.*/
    while (numero <= 50) {
        println(numero)
        numero++
    }

}
*/

fun main() {
    val conversas = arrayOf(
        arrayOf("Antecedência"),
        arrayOf("Liminar"),
        arrayOf("Justiça"),
        arrayOf("Liberdade"),
        arrayOf("Caravana"),
    )
/*
    var numero = 0
    while (numero < conversas.size) { // aqui eu exibo um único array que selecionar
        println(conversas[numero][0])
        numero++;
    }

 */
    for (conversa in conversas) { // aqui eu exibo todos de uma vez.
        println(conversa[0])
    }
}





