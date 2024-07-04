package com.example.aulassemana7.teste

// Definição de uma classe de dados
data class Desestruturacao(
    var name: String,
    var age: Int
) {
    // Método para definir o nome e retornar a própria instância (encadeamento de métodos)
    fun setName(name: String): Desestruturacao {
        this.name = name
        return this
    }

    // Método para definir a idade e retornar a própria instância (encadeamento de métodos)
    fun setAge(age: Int): Desestruturacao {
        this.age = age
        return this
    }

    // Método para incrementar a idade e retornar a própria instância (encadeamento de métodos)
    fun incrementAge(): Desestruturacao {
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

    // Desestruturação de objetos Person
    val (name, age) = person
    println("Desestruturação - Nome: $name, Idade: $age")

    // Outro exemplo de desestruturação
    val (anotherName, anotherAge) = anotherPerson
    println("Desestruturação - Nome: $anotherName, Idade: $anotherAge")
}