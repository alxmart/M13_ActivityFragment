package com.luizafmartinez.m13_activityfragment

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String
) : Parcelable   // RECOMENDADO !!! Usar nos próximos projetos !!


/*class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String
) : Serializable*/

