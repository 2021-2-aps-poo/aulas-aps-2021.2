package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.zombie.ParedeZombie;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.zombie.PortaZombie;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.zombie.SalaZombie;

public class LabirintoZombie extends LabirintoWolf {

    public Sala createSala() {
        return new SalaZombie();
    }

    public Parede createParede() {
        return new ParedeZombie();
    }

    public Porta createPorta() {
        return new PortaZombie();
    }

}
