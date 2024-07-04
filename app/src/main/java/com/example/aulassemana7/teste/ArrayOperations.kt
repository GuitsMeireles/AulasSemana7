package com.example.aulassemana7.teste

import java.util.Arrays
import java.util.stream.Collectors

object ArrayOperations {
    @JvmStatic
    fun main(args: Array<String>) {
        // Criação de arrays
        val intArray = intArrayOf(1, 2, 3, 4, 5)
        val stringArray = arrayOf("Java", "Kotlin", "Python")

        // Acesso e modificação de elementos
        println("Primeiro elemento de intArray: " + intArray[0])
        intArray[0] = 10
        println("Primeiro elemento de intArray após modificação: " + intArray[0])

        // Iteração sobre elementos
        println("Elementos de stringArray:")
        for (element in stringArray) {
            println(element)
        }

        // Tamanho do array
        println("Tamanho de intArray: " + intArray.size)

        // Adicionar elementos (cria um novo array)
        val newArray = intArray.copyOf(intArray.size + 1)
        newArray[newArray.size - 1] = 6
        println("Novo array após adicionar elemento:")
        println(newArray.contentToString())

        // Subarray
        val subArray = Arrays.copyOfRange(intArray, 1, 4)
        println("Subarray de intArray:")
        println(subArray.contentToString())

        // Ordenar array
        Arrays.sort(intArray)
        println("intArray ordenado:")
        println(intArray.contentToString())

        // Filtrar array
        val filteredList = Arrays.stream(intArray)
            .filter { i: Int -> i > 2 }
            .boxed()
            .collect(Collectors.toList())
        println("Elementos de intArray maiores que 2:")
        println(filteredList)

        // Reduzir array
        val sum = Arrays.stream(intArray).reduce(
            0
        ) { i: Int, i1: Int ->
            Integer.sum(
                i,
                i1
            )
        }
        println("Soma dos elementos de intArray: $sum")
    }
}