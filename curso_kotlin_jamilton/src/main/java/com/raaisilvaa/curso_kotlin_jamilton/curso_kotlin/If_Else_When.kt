package com.raaisilvaa.curso_kotlin_jamilton.curso_kotlin
// Aprendendo sobre o in que vem de intervalo entre números ou objetos.
/*
fun main() {
    val notaAluno = 10
// Dessa forma nÃo preciso ficar criando métodos de 5 a 10 como aprovação.
    if (notaAluno in 5..10) {
        println("Aprovado!")
    } else {
        println("Reprovado!")
    }
}
*/

// Aprendendo sobre When e alguns exemplos.
/*
fun main() {
    val opcao = 6

    when(opcao) {
        1 -> println("Cartão de crédito")
        2 -> println("Extrato bancário")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionada")
    }
}
*/
// Nota de alunos se foi aprovado, recuperação ou aprovado.

fun main() {
    val notaAluno = 10

    when(notaAluno) {
        in 0..5 -> println("$notaAluno: Reprovado!")
        in 6..6 -> println("$notaAluno: Recuperação!")
        in 7..10 -> println("$notaAluno: Aprovado!")
        else -> println("Nota desconhecida!")
    }

}
