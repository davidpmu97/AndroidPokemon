package com.example.pokemon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*
// TODO: Rename parameter arguments, choose names that match

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        pokemon_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = Adapter(createData())
        }
    }
    fun createData(): ArrayList<Pokemon>{
        val pokemons = ArrayList<Pokemon>()
        pokemons.add(Pokemon(R.drawable.dos,2, "Ivysaur","Planta"))
        pokemons.add(Pokemon(R.drawable.tres,3, "Venusaur","Planta"))
        pokemons.add(Pokemon(R.drawable.cuatro,4, "Charmander","Fuego"))
        pokemons.add(Pokemon(R.drawable.cinco, 5,"Charmeleon","Fuego"))
        pokemons.add(Pokemon(R.drawable.seis,6, "Charizard","Fuego"))
        pokemons.add(Pokemon(R.drawable.siete,7, "Squirtle","Agua"))
        pokemons.add(Pokemon(R.drawable.ocho,8, "Wartortle","Agua"))
        pokemons.add(Pokemon(R.drawable.nueve,9, "Blastoise","Agua"))
        pokemons.add(Pokemon(R.drawable.pika,25, "PIKACHUUU!!","Rayo"))
        pokemons.add(Pokemon(R.drawable.raichu,26, "Raichu","Rayo"))
        pokemons.add(Pokemon(R.drawable.aegislash,681, "Aegislash-sama","Metal"))
        return pokemons
    }
}