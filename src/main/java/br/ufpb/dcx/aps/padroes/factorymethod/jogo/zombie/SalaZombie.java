package br.ufpb.dcx.aps.padroes.factorymethod.jogo.zombie;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Parede;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.Sala;

import java.util.ArrayList;
import java.util.List;

public class SalaZombie implements Sala {

    private int maxParedes = 6;

    private List<Parede> paredes = new ArrayList<>();


    public int getMaxParedes() {
        return maxParedes;
    }

    public void setMaxParedes(int maxParedes) {
        this.maxParedes = maxParedes;
    }

    public void addParede(Parede parede){
        if(paredes.size() == maxParedes)
            throw new RuntimeException("Máximo de paredes: "+maxParedes);
        this.paredes.add(parede);
    }


    public List<Parede> getParedes() {
        return paredes;
    }

}
