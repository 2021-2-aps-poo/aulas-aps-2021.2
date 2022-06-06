package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.pokemon.PokemonFactory;

public class JogoPokemon {

    public static void main(String[] args) {
        JogoLabirinto pokemon = new JogoLabirinto();
        pokemon.montarLabirinto(new PokemonFactory());

    }
}
