package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

// Métodos com retorno, ações com ou sem retorno.

class FuncionarioBanco(double: Double) {
    // Atributo
    var salario: Double = double

    // Método
    fun calcularSalarioDesconto(bonus: Int): Double {

        return salario - 20 + bonus

       /* println("$salarioComDesconto")*/
    }
}

fun main() {
    val salarioFuncionario = 2000.23
    // Crio uma variável que irei guardar o FuncionárioBanco e dentro guardo a variável salarioFuncionario
    // Que irá sobrescrever o salário que está vazio dentro da classe.
    val funcionarioA = FuncionarioBanco(salarioFuncionario)
    val bonus = 80

    // Atribui a funcionarioA para pegar o valor do salário e usa o calcularSalarioDesconto
    // Para obter o retorno do salário - 20 + bonus
    val salarioComDesconto = funcionarioA.calcularSalarioDesconto(bonus)

    println(salarioComDesconto)

}