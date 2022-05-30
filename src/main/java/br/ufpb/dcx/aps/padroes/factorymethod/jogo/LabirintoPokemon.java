package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.pokemon.ParedePokemon;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.pokemon.PortaPokemon;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.pokemon.SalaPokemon;

public class LabirintoPokemon extends LabirintoWolf{



    public Sala createSala(){
        return new SalaPokemon();
    }

    public Parede createParede(){
        return new ParedePokemon();
    }

    public Porta createPorta(){
        return new PortaPokemon();
    }



}
