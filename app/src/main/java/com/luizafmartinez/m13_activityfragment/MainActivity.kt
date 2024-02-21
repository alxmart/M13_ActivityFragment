package com.luizafmartinez.m13_activityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("Ciclo_De_Vida", "onCreate")

        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_abrir)

        btnAbrir.setOnClickListener {

            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )

            startActivity( intent )
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo_Vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo_Vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo_Vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo_Vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo_Vida", "onDestroy")
    }


}









