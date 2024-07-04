package com.example.aulassemana7.teste

// Definição de uma classe de dados com acessores customizados
data class Getter(
    var name: String,
    var age: Int
) {
    // Propriedade customizada para armazenar o sobrenome
    var surname: String = ""
        get() = field.uppercase() // Custom getter que retorna o sobrenome em letras maiúsculas
        set(value) {
            field = value.trim() // Custom setter que remove espaços em branco do sobrenome
        }
}

fun main() {
    // Criação de uma instância de Person e configuração de propriedades
    val person = Person("Alice", 25).apply {
        name = "  Smith  " // Define o sobrenome com espaços em branco
    }

    // Exibe as informações da pessoa no console
    println("Nome: ${person.name}, Idade: ${person.age}, Sobrenome: ${person.name}")

    // Outro exemplo com acessores customizados
    val anotherPerson = Person("Charlie", 20).apply {
        name = "Johnson"
    }

    // Exibe as informações da outra pessoa no console
    println("Nome: ${anotherPerson.name}, Idade: ${anotherPerson.age}, Sobrenome: ${anotherPerson.name}")

    // Desestruturação de objetos Person
    val (name, age) = person
    println("Desestruturação - Nome: $name, Idade: $age")

    // Outro exemplo de desestruturação
    val (anotherName, anotherAge) = anotherPerson
    println("Desestruturação - Nome: $anotherName, Idade: $anotherAge")
}