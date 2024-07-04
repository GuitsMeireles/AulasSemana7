package com.example.aulassemana7

fun main() {
    // Criação de listas
    val numbers = listOf(1, 2, 3, 4, 5)

    // Dobrar todos os números
    val doubledNumbers = numbers.map { it * 2 }
    println("Números dobrados: $doubledNumbers")

    // Converter números para Strings
    val numberStrings = numbers.map { "Number $it" }
    println("Números convertidos para Strings: $numberStrings")

    // Converter Strings para maiúsculas
    val names = listOf("Alice", "Bob", "Charlie")
    val upperCaseNames = names.map { it.toUpperCase() }
    println("Nomes em maiúsculas: $upperCaseNames")

    // Mapear para pares de chave-valor
    val keyValuePairs = numbers.map { it to (it * it) }
    println("Pares de chave-valor: $keyValuePairs")

    // Acessar uma propriedade de objeto
    data class Person(val name: String, val age: Int)
    val people = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))
    val namesWithAges = people.map { "${it.name} is ${it.age} years old" }
    println("Nomes com idades: $namesWithAges")
}