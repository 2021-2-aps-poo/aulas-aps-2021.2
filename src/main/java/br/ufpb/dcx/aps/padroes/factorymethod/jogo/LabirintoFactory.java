package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.ParedeWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.PortaWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.SalaWolf;

public interface LabirintoFactory {


    public Sala createSala();

    public Parede createParede();

    public Porta createPorta();
}
