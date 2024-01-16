package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos
// ENTRADA DE DADOS
class JogadorGladiators {
    var nome = ""
    var idade = ""
    var posicao = ""
    var numeracaoCamisa = ""

    // PROCESSAMENTO DE DADOS
    fun dados() {
        println("Nome: $nome, $idade")
    }
}

// SAÍDA DE DADOS
fun main() {
    val jogador = "Raí"
    val rai = JogadorGladiators()

    rai.nome = "Raí"
    rai.idade = "31"
    rai.posicao = "Volante"
    rai.numeracaoCamisa = "5"

    rai.dados()

}