package com.example.recyleviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SupeheroAdapter(private val context: Context,  private val Superhero : List<superhero>, val listener: (superhero) -> Unit)

    :    RecyclerView.Adapter<SupeheroAdapter.Superheroviwewholder>(){

    class Superheroviwewholder(view: View) : RecyclerView.ViewHolder(view) {
        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)


        fun binView(superhero: superhero, listener: (superhero) -> Unit){
            imgSuperhero.setImageResource(superhero.imgSuperhero)
            nameSuperhero.text = superhero.nameSuperhero
            descSuperhero.text = superhero.descSuperhero


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Superheroviwewholder {
        return Superheroviwewholder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }


    override fun onBindViewHolder(holder: Superheroviwewholder, position: Int) {
        holder.binView(Superhero[position], listener )
    }

    override fun getItemCount(): Int = Superhero.size

}




