
package com.luizafmartinez.m13_activityfragment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var btnFechar: Button
    lateinit var textFilme : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        btnFechar = findViewById(R.id.btn_fechar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras // Todos os parâmetros passados

        if ( bundle != null) {

            /*
            val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificacao")
            val avaliacoes = bundle.getDouble("avaliacoes")
            */

            //val resultado = "Filme: $filme  Class.: $classificacao  Aval.: $avaliacoes"

            val filme = if ( Build.VERSION.SDK_INT  >= 33 ) { // Versão >= 33

                bundle.getSerializable("filme", Filme::class.java)
            } else {
                bundle.getSerializable("filme") as Filme
            }

            textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"
        }

        btnFechar.setOnClickListener {

            finish()
        }
    }
}

