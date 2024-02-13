package com.raaisilvaa.curso_kotlin_jamilton.curso_kotlin

/*
== Igual a
!= Diferente
> Maior que
< Menor que
>= Maior ou igual
<= Menor ou igual
&& E
|| Ou
! Negação
 */

/* Promoção de supermercado com descontos.
1- Elencar a idade e o total gasto pra ver se a promoção é válida.
2- Verificar se a idade e o total de compras gastas são compatíveis para obter o desconto.
3- Elencar o desconto em caso afirmativo.
 */

fun main() {
    val idadeCliente = 50
    val gastoTotalCompra = 300
    val desconto = gastoTotalCompra - 15

    if (idadeCliente >= 50 && gastoTotalCompra >= 500) {
        println("Você faz parte da promoção e sua compra ficará $desconto reais!")
    } else {
        println("Você não faz parte da promoção!")
    }
}
