package br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.LabirintoFactory;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Parede;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Porta;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Sala;

public class WolfFactory implements LabirintoFactory {

    public Sala createSala(){
        return new SalaWolf();
    }

    public Parede createParede(){
        return new ParedeWolf();
    }

    public Porta createPorta(){
        return new PortaWolf();
    }
}
