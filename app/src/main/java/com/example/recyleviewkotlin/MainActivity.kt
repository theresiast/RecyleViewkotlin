package com.example.recyleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<superhero>(
            superhero(
                R.drawable.new_poster_2,
                "Mencuri Raden Saleh",
                "loren Lipsum loren Lipsum ",
            ),
            superhero(
                R.drawable.new_poster_4,
                "Me and you Vs The World ",
                "loren Lipsum loren Lipsum",
            ),
            superhero(
                R.drawable.new_poster_5,
                "Laskar Pelangi",
                "loren Lipsum loren Lipsum",
            ),
            superhero(
                R.drawable.new_poster_6,
                "TAUFIQ",
                "loren Lipsum loren Lipsum",
            ),
           superhero(
                R.drawable.new_poster_7,
                "BOMBE",
                "loren Lipsum loren Lipsum",
            ),
            superhero(
                R.drawable.new_poster_8,
                "DILAN",
                "loren Lipsum loren Lipsum",

                ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SupeheroAdapter(this, superheroList) {

        }
    }
}