package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos
/*
class JogadorGladiators {
    var nome = ""
    var idade = ""
    var posicao = ""
    var numeracaoCamisa = ""

    fun dados() {
        println("Posição: $posicao")
    }
}

fun main() {
    val jogador = JogadorGladiators()
    jogador.posicao = "Volante"

    jogador.dados()
}
 */

class CarrosChevrolet(s: String, s1: String, s2: String, s3: String) {
    // Atributos das classes.
    var nome = s
    var cor = s1
    var pneuAro = s2
    var ano = s3

    // Criando uma ação que são os métodos.
    fun dadosInseridos() {
        println("Nome: $nome, Cor: $cor, Pneu Aro: $pneuAro, Ano: $ano")
    }

}

fun main() {
    val ônix = CarrosChevrolet("Ônix", "Azul", "18", "2022")
    val camaro = CarrosChevrolet("Camaro", "Amarelo", "22", "2018" )


    ônix.dadosInseridos()
    camaro.dadosInseridos()
}