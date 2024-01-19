package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

// Metodos com retorno

class AllFibra(double: Double) {
    var salarioMensal: Double = double

    fun calculoSalarioFibra(bonus: Int): Double {
        return salarioMensal - 240 + bonus
    }
}

fun main1() {
    val salario = 2500.25
    val funcionarioCigano = AllFibra(salario)
    val bonus = 60

    val total = funcionarioCigano.calculoSalarioFibra(bonus)

    println(total)
}












// () valorCorte e valorBarba está sendo chamado dentro da função para obter o valor.
class CorteRafaelBarbeiro(valorCorte: Int, valorBarba: Int) {
    var corte: Int = valorCorte
    var barba: Int = valorBarba

    // DescontoCorte está sendo chamado dentro da função como númeri inteiro.
    fun somaCorteBarbearia(descontoCorte: Int): Int {
        return (corte + barba) - descontoCorte // retornando nossa conta.
    }
}

fun main2() {
    val valorCorte = 45
    val valorBarba = 35
    val descontoCorte = 5

    // Criando uma variável para encaixar a class e dentro os valores a serem exibidos.
    val combo = CorteRafaelBarbeiro(valorCorte, valorBarba)

    // Criando uma variável para chamar o combo junto com a função somaCorteBarbearia e dentro o descontoCorte.
    val comboDesconto = combo.somaCorteBarbearia(descontoCorte)

    println(comboDesconto)
}
// Criando uma classe e armazenando o var.
//
class DistribuidoraDeOvos(precoCartela: Int, precoUnitario: Int) {
    var precoCartelaOvos: Int = precoCartela
    var precoUnitarioOvos: Int = precoUnitario

    // Função para a nossa ação para efetuar o calculo e retorno dessa mesma função.
    fun calculoDesconto(descontoOvos: Int): Int {
        val quantidadeCartelaOvos = 1

        return if ( quantidadeCartelaOvos <= 2) {
            precoCartelaOvos * quantidadeCartelaOvos
        } else {
            (precoCartelaOvos * quantidadeCartelaOvos) - descontoOvos
        }

    }
}

fun main() {
    val precoCartela = 20
    val precoUnitario = 2
    val descontoOvos = 3

    val compras = DistribuidoraDeOvos(precoCartela, precoUnitario)

    val somaTotal = compras.calculoDesconto(descontoOvos)

    println(somaTotal)
}