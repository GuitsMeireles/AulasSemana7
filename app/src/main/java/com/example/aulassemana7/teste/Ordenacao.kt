package com.example.aulassemana7.teste

data class Pessoa(val nome: String, val idade: Int)

fun main() {
    // Criando lista de pessoas
    val pessoas = listOf(
        Pessoa("Alice", 29),
        Pessoa("Bob", 31),
        Pessoa("Charlie", 25),
        Pessoa("David", 35),
        Pessoa("Eve", 27)
    )

    // Ordenação por idade usando sortedBy
    val pessoasOrdenadasPorIdade = pessoas.sortedBy { it.idade }
    println("Pessoas ordenadas por idade: $pessoasOrdenadasPorIdade")

    // Ordenação por nome usando sortedBy
    val pessoasOrdenadasPorNome = pessoas.sortedBy { it.nome }
    println("Pessoas ordenadas por nome: $pessoasOrdenadasPorNome")

    // Ordenação reversa usando sortedByDescending
    val pessoasOrdenadasPorIdadeDesc = pessoas.sortedByDescending { it.idade }
    println("Pessoas ordenadas por idade (descendente): $pessoasOrdenadasPorIdadeDesc")

    // Ordenação personalizada usando sortedWith
    val pessoasOrdenadasPorIdadeNome = pessoas.sortedWith(compareBy({ it.idade }, { it.nome }))
    println("Pessoas ordenadas por idade e nome: $pessoasOrdenadasPorIdadeNome")

    // Ordenação de números usando sorted
    val numeros = listOf(5, 2, 8, 1, 9, 3)
    val numerosOrdenados = numeros.sorted()
    println("Números ordenados: $numerosOrdenados")
}