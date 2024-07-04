package com.example.aulassemana7.teste

// Definição de uma classe de dados
data class Person(
    var name: String,
    var age: Int
) {
    // Método para definir o nome e retornar a própria instância (encadeamento de métodos)
    fun setName(name: String): Person {
        this.name = name
        return this
    }

    // Método para definir a idade e retornar a própria instância (encadeamento de métodos)
    fun setAge(age: Int): Person {
        this.age = age
        return this
    }

    // Método para incrementar a idade e retornar a própria instância (encadeamento de métodos)
    fun incrementAge(): Person {
        this.age += 1
        return this
    }
}

fun main() {
    // Criação de uma instância de Person e uso de encadeamento de métodos
    val person = Person("Alice", 25)
        .setName("Bob")
        .setAge(30)
        .incrementAge()

    // Exibe as informações da pessoa no console
    println("Nome: ${person.name}, Idade: ${person.age}")

    // Outro exemplo com encadeamento de métodos
    val anotherPerson = Person("Charlie", 20)
        .incrementAge()
        .setName("David")

    // Exibe as informações da outra pessoa no console
    println("Nome: ${anotherPerson.name}, Idade: ${anotherPerson.age}")
}