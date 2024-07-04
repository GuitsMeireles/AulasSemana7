package com.example.aulassemana7.teste

// Definição de uma classe chamada Matematica
class Matematica {
    // Método somar que pertence à classe Matematica
    fun somar(n1: Int, n2: Int): Int {
        return n1 + n2 // Retorna a soma de n1 e n2
    }
}

// Função somar que não pertence a uma classe
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2 // Retorna a soma de n1 e n2
}

// Função calcular que recebe uma função como parâmetro
fun calcular(funcao: (Int, Int) -> Int) {
    // Chama a função passada como parâmetro com os valores 10 e 10
    val retorno = funcao(10, 10)
    // Imprime o resultado da função
    println(retorno)
}

//  fun executar() {
//      println("Executar")
//  }

//fun executar2() = println("Executar 2")


class Botao() {
    fun configurarCliqueBotao(funcao: () -> Unit) {
    }
}


//Função main, ponto de entrada do programa
fun main() {

    //val botao = Botao()
    //    botao.configurarCliqueBotao( {
    //        println("Executou funcao lambda")
    //    } )

    // Funcao Lambda
    //val funcaoLambda =
    //{ nome: String, idade: Int -> println("Executar nome: $nome, idade: $idade") }

    //funcaoLambda("Guilherme", 22)

    // Cria uma instância da classe Matematica
    //val matematica = Matematica()
    // Chama a função calcular passando o método somar da classe Matematica como argumento
    //calcular(matematica::somar)

    // Descomentar as linhas abaixo para testar outras formas de chamar a função somar

    // Cria uma instância da classe Matematica e chama o método somar diretamente
    // val matematica = Matematica()
    // val retorno = matematica.somar(10, 10)

    // Chama a função somar que não pertence a uma classe
    // val retorno = somar(10, 10)

    // Chama a função calcular passando a função somar que não pertence a uma classe
    // calcular(::somar)

    // Imprime o resultado da função somar
    // println(retorno)
}