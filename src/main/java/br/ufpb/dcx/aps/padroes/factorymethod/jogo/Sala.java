package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.ParedeWolf;

public interface Sala {

    public void addParede(Parede parede);

    public void setMaxParedes(int maxParedes);
}
