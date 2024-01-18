package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos
/*
Pilar 01 - Abstração
* Modelo (classes)
* Entidade (pessoas ou coisas imprescindiveis)
* Identidade
* Características (atributos): variável
* Ações (métodos)
*/

class JogadoresTitular { // Modelo (utilizar UpperCamelCase, ex: JogadorCaro, JogadorRaiSilva.)
    // Atributos (utilizam Lower Case Case. ex: kartMario, pneuLiso.)
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar() { // Métodos(ações) || São feitas pelo seu jogador nesse código.
        println("Kart: $kart, Pneu: $pneu, Planaldor: $planador")
    }
}

fun main() {
    // Criar instância de um objeto.
    val jogador1 = JogadoresTitular()
    jogador1.kart = "Normal"
    jogador1.pneu = "Standard"
    jogador1.planador = "Paraquedas"

    jogador1.acelerar()




    val computador = JogadoresTitular()
    computador.kart = "Race"
    computador.pneu = "Glider"
    computador.planador = "Avião"

    computador.acelerar()


}

