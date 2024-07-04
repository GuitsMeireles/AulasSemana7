package com.example.aulassemana7.teste

fun main() {
    // Criação de listas
    val mutableList = mutableListOf("Kotlin", "Java", "Python")
    val readOnlyList = listOf(1, 2, 3, 4, 5)

    // Adicionar e remover elementos
    mutableList.add("JavaScript")
    println("Lista mutável após adicionar elemento: $mutableList")

    mutableList.remove("Java")
    println("Lista mutável após remover elemento: $mutableList")

    // Acesso e modificação de elementos
    println("Primeiro elemento da lista: ${mutableList[0]}")
    mutableList[0] = "Swift"
    println("Lista mutável após modificação: $mutableList")

    // Iteração sobre elementos
    println("Elementos da lista somente leitura:")
    for (element in readOnlyList) {
        println(element)
    }

    // Tamanho da lista
    println("Tamanho da lista somente leitura: ${readOnlyList.size}")

    // Filtrar elementos
    val filteredList = readOnlyList.filter { it > 2 }
    println("Elementos da lista maiores que 2: $filteredList")

    // Mapear elementos
    val mappedList = readOnlyList.map { it * 2 }
    println("Elementos da lista multiplicados por 2: $mappedList")

    // Reduzir coleção
    val sum = readOnlyList.reduce { acc, i -> acc + i }
    println("Soma dos elementos da lista: $sum")

    // Verificar se todos os elementos satisfazem uma condição
    val allEven = readOnlyList.all { it % 2 == 0 }
    println("Todos os elementos são pares? $allEven")

    // Verificar se algum elemento satisfaz uma condição
    val anyEven = readOnlyList.any { it % 2 == 0 }
    println("Algum elemento é par? $anyEven")
}