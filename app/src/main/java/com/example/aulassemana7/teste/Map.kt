package com.example.aulassemana7.teste

fun main() {
    // Criação de Maps
    val mutableMap = mutableMapOf("Kotlin" to 1, "Java" to 2, "Python" to 3)
    val readOnlyMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")

    // Adicionar e remover elementos
    mutableMap["JavaScript"] = 4
    println("Map mutável após adicionar elemento: $mutableMap")

    mutableMap.remove("Java")
    println("Map mutável após remover elemento: $mutableMap")

    // Acesso a elementos
    println("Valor associado a 'Python': ${mutableMap["Python"]}")

    // Iteração sobre elementos
    println("Elementos do map somente leitura:")
    for ((key, value) in readOnlyMap) {
        println("$key -> $value")
    }

    // Tamanho do map
    println("Tamanho do map somente leitura: ${readOnlyMap.size}")

    // Filtrar elementos
    val filteredMap = readOnlyMap.filter { (key, _) -> key > 1 }
    println("Elementos do map com chave maior que 1: $filteredMap")

    // Mapear elementos
    val mappedMap = readOnlyMap.mapValues { (_, value) -> value.length }
    println("Elementos do map com valores mapeados para seus comprimentos: $mappedMap")

    // Verificar se todos os elementos satisfazem uma condição
    val allValuesLengthGreaterThanTwo = readOnlyMap.all { (_, value) -> value.length > 2 }
    println("Todos os valores têm comprimento maior que 2? $allValuesLengthGreaterThanTwo")

    // Verificar se algum elemento satisfaz uma condição
    val anyKeyGreaterThanTwo = readOnlyMap.any { (key, _) -> key > 2 }
    println("Alguma chave é maior que 2? $anyKeyGreaterThanTwo")
}