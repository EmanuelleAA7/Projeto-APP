package com.example.continuada1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculaMediaPonderada(Componente:View){

        val nota1 = et_nota1.text.toString().toDouble()
        val nota2 = et_nota2.text.toString().toDouble()
        val peso1 = et_peso1.text.toString().toDouble()
        val peso2 = et_peso2.text.toString().toDouble()
        val nome = et_nome.text.toString()

        if(nome.isEmpty()){
            Toast.makeText(this, "Por favor, escreva o seu nome primeiro", Toast.LENGTH_SHORT).show()
        } else if (nota1 < 0 || nota1 > 10 ){
            Toast.makeText(this, "A \"nota1\" precisa ser de 0 a 10", Toast.LENGTH_SHORT).show()
        } else if (peso1 < 1 || peso1 > 2 ){
            Toast.makeText(this, "O \"peso1\" precisa ser 1 ou 2", Toast.LENGTH_SHORT).show()
        } else if (peso2 <1 || peso2 > 2 ){
            Toast.makeText(this, "O \"peso2\" precisa ser 1 ou 2", Toast.LENGTH_SHORT).show()
        } else{
            val mediaPonderada = (nota1*peso1) + (nota2*peso2) / peso1 + peso2
            if(mediaPonderada < 8.3){
                tv_resultado.text = "Sua nota ponderada foi $mediaPonderada. Você não passou."
                tv_resultado.setTextColor(Color.RED)
                tv_resultado.visibility = View.VISIBLE
            }else{
                tv_resultado.text = "Sua nota ponderada foi $mediaPonderada.Você passou, parabéns!"
                tv_resultado.setTextColor(Color.GREEN)
                tv_resultado.visibility = View.VISIBLE
            }
        }
    }
}


