package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos
/*
Pilar 01 - Abstração
* Modelo (classes)
* Entidade (pessoas ou coisas imprescindiveis)
* Identidade
* Características (atributos)
* Ações (métodos)
*/

class Jogador { // Modelo (utilizar UpperCamelCase, ex: JogadorCaro, JogadorRaiSilva.)
    // Atributos (utilizam Lower Case Case. ex: kartMario, pneuLiso.)
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar() { // Métodos(ações) || São feitas pelo seu jogador nesse código.
        println("Acelerar: $pneu")
    }
}

fun main() {
    // Criar instância de um objeto.
    val rai = Jogador()
    rai.kart = "Normal"
    rai.pneu = "Standard"
    rai.planador = "Paraquedas"

    rai.acelerar()

    val jogador1 = "Raí"



    val computador = Jogador()
    computador.kart = "Race"
    computador.pneu = "Glider"
    computador.planador = "Avião"

    computador.acelerar()

    val jogador2 = "Computador"

}

