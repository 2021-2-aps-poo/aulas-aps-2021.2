package br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Parede;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Porta;

public class ParedeWolf implements Parede {

    private Porta porta;

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
}
