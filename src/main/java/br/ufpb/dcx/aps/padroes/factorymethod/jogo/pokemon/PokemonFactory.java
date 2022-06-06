package br.ufpb.dcx.aps.padroes.factorymethod.jogo.pokemon;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.LabirintoFactory;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Parede;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Porta;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Sala;

public class PokemonFactory implements LabirintoFactory {


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
