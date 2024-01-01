@file:Suppress("UNREACHABLE_CODE")

package com.raaisilvaa.appone

import android.util.Patterns
fun main() {
    print("Digite um número para ver a tabuada: ")
    val numero = readln().toInt()

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}