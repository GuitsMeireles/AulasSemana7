package com.example.aulassemana7.teste

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aulassemana7.R

// Classe que demonstra o encadeamento de métodos
class Toast {

    // Variável para armazenar um valor de exemplo
    private var value: Int = 0

    // Método para definir o valor e retornar a própria instância da classe (encadeamento de métodos)
    fun setValue(value: Int): com.example.aulassemana7.teste.Toast {
        this.value = value
        return this
    }

    // Método para incrementar o valor e retornar a própria instância da classe (encadeamento de métodos)
    fun incrementValue(): com.example.aulassemana7.teste.Toast {
        this.value += 1
        return this
    }

    // Método para duplicar o valor e retornar a própria instância da classe (encadeamento de métodos)
    fun doubleValue(): com.example.aulassemana7.teste.Toast {
        this.value *= 2
        return this
    }

    // Método para obter o valor atual
    fun getValue(): Int {
        return this.value
    }
}

// Classe MainActivity que herda de AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criação de uma instância de ExampleClass e uso de encadeamento de métodos
        val example = Toast()
            .setValue(5)
            .incrementValue()
            .doubleValue()

        // Obtém o valor final após o encadeamento de métodos
        val result = example.getValue()

        // Exibe o valor final em um Toast
        Toast.makeText(this, "O valor final é: $result", Toast.LENGTH_LONG).show()
    }
}