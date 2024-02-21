
package com.luizafmartinez.m13_activityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetalhesActivity : AppCompatActivity() {

    lateinit var btnFechar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        btnFechar = findViewById(R.id.btn_fechar)

        btnFechar.setOnClickListener {
            finish()
        }

    }
}