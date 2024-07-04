package com.example.aulassemana7.teste

// Classe externa
class OuterClass {

    // Variável da classe externa
    private var outerValue: Int = 0

    // Classe aninhada (nested class) não pode acessar membros da classe externa
    class NestedClass {
        // Variável da classe aninhada
        private var nestedValue: Int = 0

        // Método da classe aninhada
        fun setNestedValue(value: Int): NestedClass {
            this.nestedValue = value
            return this
        }

        // Método para obter o valor da classe aninhada
        fun getNestedValue(): Int {
            return this.nestedValue
        }
    }

    // Classe interna (inner class) pode acessar membros da classe externa
    inner class InnerClass {
        // Método da classe interna
        fun setOuterValue(value: Int): InnerClass {
            this@OuterClass.outerValue = value
            return this
        }

        // Método para incrementar o valor da classe externa
        fun incrementOuterValue(): InnerClass {
            this@OuterClass.outerValue += 1
            return this
        }

        // Método para obter o valor da classe externa
        fun getOuterValue(): Int {
            return this@OuterClass.outerValue
        }
    }
}

fun main() {
    // Uso da classe aninhada (nested class)
    val nestedInstance = OuterClass.NestedClass()
        .setNestedValue(10)

    // Obtém o valor da classe aninhada
    val nestedResult = nestedInstance.getNestedValue()

    // Exibe o valor da classe aninhada no console
    println("O valor da NestedClass é: $nestedResult")

    // Uso da classe interna (inner class)
    val outerInstance = OuterClass()
    val innerInstance = outerInstance.InnerClass()
        .setOuterValue(5)
        .incrementOuterValue()

    // Obtém o valor da classe externa modificado pela classe interna
    val innerResult = innerInstance.getOuterValue()

    // Exibe o valor da classe interna no console
    println("O valor da InnerClass é: $innerResult")
}