package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.PortaWolf;

public interface Parede {


    public Porta getPorta();

    public void setPorta(Porta porta);
}
