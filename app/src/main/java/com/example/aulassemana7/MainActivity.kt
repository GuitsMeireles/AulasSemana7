package com.example.aulassemana7

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.aulassemana7.teste.Resources

// Definição da classe MainActivity que herda de AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Declaração tardia (lateinit) de variáveis para o botão e o TextView
    private lateinit var btExecutar: Button
    private lateinit var tvResult: TextView

    // Método onCreate, ponto de entrada quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade
        setContentView(R.layout.activity_main)

        // Inicializa o botão e o TextView usando seus IDs no layout
        btExecutar = findViewById(R.id.bt_execute)
        tvResult = findViewById(R.id.tv_result)

        // Acessa a constante text_numero da classe Resources.id
        Resources.id.text_numero

        // Primeira forma de criar uma ação para um botão
        /*
        btExecutar.setOnClickListener {
            tvResult.text = "Guilherme Meireles"
        }
        */
    }

    // Segunda forma de criar uma ação para um botão
    /*
    fun cliqueBotao(view: View) {
        tvResult.text = "Guilherme Meireles"
    }
    */
}