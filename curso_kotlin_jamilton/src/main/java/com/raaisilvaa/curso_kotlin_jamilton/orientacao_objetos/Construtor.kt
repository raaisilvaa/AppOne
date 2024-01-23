package com.raaisilvaa.curso_kotlin_jamilton.orientacao_objetos

class Usuario(var email: String, var senha: String ) {

    // Construtor
    init {
        this.email = email
        this.senha = senha
    }
}

fun main() {
    val usuario = Usuario("raai@hotmail.com", "123456")
    println("email: ${usuario.email} \nsenha: ${usuario.senha}")

}




/*
class Usuario(
    var email: String,
    var senha: String
) {

    //Construtor
    init {
        println("construtor executado")
        this.email = email
        this.senha = senha
    }

    //Método
    fun verificarUsuarioLogado() {

    }

}


    fun main(args: Array<String>) {

        val usuario = Usuario("jamilton@gmail.com", "123454")

        println("email: ${usuario.email} senha: ${usuario.senha}")

    }



 */