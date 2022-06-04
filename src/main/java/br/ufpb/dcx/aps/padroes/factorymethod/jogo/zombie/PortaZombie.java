package br.ufpb.dcx.aps.padroes.factorymethod.jogo.zombie;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Porta;

public class PortaZombie implements Porta {

    private boolean aberta = true;


    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }

    public boolean isAberta(){
        return this.aberta;
    }
}