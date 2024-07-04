package com.example.aulassemana7.teste

fun main() {
    // Criando conjuntos
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6, 7, 8)

    // União dos conjuntos
    val unionSet = set1.union(set2)
    println("União dos conjuntos: $unionSet")

    // União com conjunto vazio
    val emptySet = emptySet<Int>()
    val unionWithEmptySet = set1.union(emptySet)
    println("União com conjunto vazio: $unionWithEmptySet")

    // União com duplicados
    val set3 = setOf(1, 2, 3, 4, 5)
    val set4 = setOf(4, 5, 6, 7, 8, 8, 8) // Contém duplicados
    val unionWithDuplicates = set3.union(set4)
    println("União com duplicados: $unionWithDuplicates")
}