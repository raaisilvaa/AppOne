package com.raaisilvaa.curso_kotlin_jamilton.curso_kotlin

// Constante global que pode ser acessado por todo o programa. VAL
fun somarPontoExtra(notaAluno: Int, pontoExtra: Double): Double {
    val notaComAcrescimo = notaAluno + pontoExtra
    return notaComAcrescimo
}

fun main() {
    println("Nota do aluno foi: ${somarPontoExtra(7, 0.5)}")
}
