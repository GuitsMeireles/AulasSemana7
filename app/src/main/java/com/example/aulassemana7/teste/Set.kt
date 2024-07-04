package com.example.aulassemana7.teste

fun main() {
    // Criação de sets
    val mutableSet = mutableSetOf("Kotlin", "Java", "Python")
    val readOnlySet = setOf(1, 2, 3, 4, 5)

    // Adicionar e remover elementos
    mutableSet.add("JavaScript")
    println("Set mutável após adicionar elemento: $mutableSet")

    mutableSet.remove("Java")
    println("Set mutável após remover elemento: $mutableSet")

    // Verificar se um elemento está presente
    println("Set contém 'Python'? ${mutableSet.contains("Python")}")

    // Iteração sobre elementos
    println("Elementos do set somente leitura:")
    for (element in readOnlySet) {
        println(element)
    }

    // Tamanho do set
    println("Tamanho do set somente leitura: ${readOnlySet.size}")

    // Filtrar elementos
    val filteredSet = readOnlySet.filter { it > 2 }.toSet()
    println("Elementos do set maiores que 2: $filteredSet")

    // Mapear elementos
    val mappedSet = readOnlySet.map { it * 2 }.toSet()
    println("Elementos do set multiplicados por 2: $mappedSet")

    // Verificar se todos os elementos satisfazem uma condição
    val allEven = readOnlySet.all { it % 2 == 0 }
    println("Todos os elementos são pares? $allEven")

    // Verificar se algum elemento satisfaz uma condição
    val anyEven = readOnlySet.any { it % 2 == 0 }
    println("Algum elemento é par? $anyEven")
}