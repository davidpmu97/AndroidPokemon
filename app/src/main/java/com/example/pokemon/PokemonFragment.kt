package com.example.pokemon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_pokemon.*
class PokemonFragment : Fragment() {

    private val args by navArgs<PokemonFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pokemon, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)
        pokemonImage.setImageResource(args.pokemon.picture)
        var nombre = args.pokemon.name
        Toast.makeText(activity, " $nombre", Toast.LENGTH_SHORT).show()
        pokemonName.text = args.pokemon.name
        var number = args.pokemon.number.toString()
        pokemonNumber.text = "$number"
        var typing = args.pokemon.type
        type.text = "$typing"

    }



}
