package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

// Metodos com retorno
/*
class AllFibra(double: Double) {
    var salarioMensal: Double = double

    fun calculoSalarioFibra(bonus: Int): Double {
        return salarioMensal - 240 + bonus
    }
}

fun main() {
    val salario = 2500.25
    val funcionarioCigano = AllFibra(salario)
    val bonus = 60

    val total = funcionarioCigano.calculoSalarioFibra(bonus)

    println(total)
}
*/











// () valorCorte e valorBarba está sendo chamado dentro da função para obter o valor.
class CorteRafaelBarbeiro(valorCorte: Int, valorBarba: Int) {
    var corte: Int = valorCorte
    var barba: Int = valorBarba

    // DescontoCorte está sendo chamado dentro da função como númeri inteiro.
    fun somaCorteBarbearia(descontoCorte: Int): Int {
        return (corte + barba) - descontoCorte // retornando nossa conta.
    }
}

fun main() {
    val valorCorte = 45
    val valorBarba = 35
    val descontoCorte = 5

    // Criando uma variável para encaixar a class e dentro os valores a serem exibidos.
    val combo = CorteRafaelBarbeiro(valorCorte, valorBarba)

    // Criando uma variável para chamar o combo junto com a função somaCorteBarbearia e dentro o descontoCorte.
    val comboDesconto = combo.somaCorteBarbearia(descontoCorte)

    println(comboDesconto)
}