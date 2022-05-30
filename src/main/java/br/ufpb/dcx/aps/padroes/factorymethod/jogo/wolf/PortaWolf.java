package br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Porta;

public class PortaWolf implements Porta {

    private boolean aberta = true;


    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }

    public boolean isAberta(){
        return this.aberta;
    }
}
