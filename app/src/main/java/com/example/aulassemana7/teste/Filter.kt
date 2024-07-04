package com.example.aulassemana7.teste

fun main() {
    // Criação de listas
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")

    // Filtrando números pares
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Números pares: $evenNumbers")

    // Filtrando números maiores que 5
    val numbersGreaterThanFive = numbers.filter { it > 5 }
    println("Números maiores que 5: $numbersGreaterThanFive")

    // Filtrando nomes que começam com 'A'
    val namesStartingWithA = names.filter { it.startsWith("A") }
    println("Nomes que começam com 'A': $namesStartingWithA")

    // Filtrando nomes com comprimento maior que 3
    val namesWithLengthGreaterThanThree = names.filter { it.length > 3 }
    println("Nomes com comprimento maior que 3: $namesWithLengthGreaterThanThree")

    // Filtrando elementos não nulos
    val nullableNames = listOf("Alice", null, "Bob", null, "Charlie")
    val nonNullNames = nullableNames.filterNotNull()
    println("Nomes não nulos: $nonNullNames")
}