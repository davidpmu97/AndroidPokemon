package com.example.pokemon


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val pokemons: List<Pokemon>)
    : RecyclerView.Adapter<Adapter.MovieViewHolder>(){


    inner class MovieViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var number = renglon.findViewById<TextView>(R.id.number)
        var name = renglon.findViewById<TextView>(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.row, parent, false)
        return MovieViewHolder(renglon_vista)

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val pokemon= pokemons[position]
        holder.name.text = pokemon.name
        holder.number.text = pokemon.number.toString()
        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToPokemonFragment(
                pokemon
            )
            holder.itemView.findNavController().navigate(action)





        }
    }


    override fun getItemCount(): Int {
        return pokemons.size
    }
}