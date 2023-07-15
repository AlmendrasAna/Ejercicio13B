package com.example.ejercicio13b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

data class Hero(
    val superHero: String,
    val publisher: String,
    val realName: String,
    var photo: String
)

fun main() {
    var heroes = mutableListOf<Hero>()
    var comprobacion = "s"

    do {

        println("nombre")
        var superhero = readln()
        println("publisher")
        var publisher = readln()
        println("nombre real")
        var realName = readln()
        println("foto")
        var photo = readln()

        println("desea seguir ingresando super heroes? n para salir")
        comprobacion = readln()
        heroes.add(Hero(superhero, publisher, realName, photo))
    } while (!comprobacion.equals("n"))

    for (h in heroes) {
        println(heroes)
    }

}