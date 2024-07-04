package com.example.aulassemana7.teste

// Função que aceita um número variável de argumentos do tipo Int
fun sum(vararg numbers: Int): Int {
    var total = 0
    for (number in numbers) {
        total += number
    }
    return total
}

// Função principal
fun main() {
    // Chamando a função sum com diferentes números de argumentos
    val result1 = sum(1, 2, 3, 4, 5)
    println("Resultado 1: $result1")

    val result2 = sum(10, 20, 30)
    println("Resultado 2: $result2")

    val result3 = sum()
    println("Resultado 3: $result3")

    // Passando um array para a função sum usando o operador de espalhamento (*)
    val numbers = intArrayOf(7, 8, 9)
    val result4 = sum(*numbers)
    println("Resultado 4: $result4")
}