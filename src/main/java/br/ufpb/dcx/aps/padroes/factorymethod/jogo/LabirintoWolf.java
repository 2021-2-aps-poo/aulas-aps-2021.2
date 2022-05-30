package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.ParedeWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.PortaWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.SalaWolf;

public class LabirintoWolf {


    public void montarLabirinto(){

        Sala s1 = createSala();

        s1.addParede(createParede());
        s1.addParede(createParede());
        s1.addParede(createParede());

        Porta automatica = createPorta();

        Parede paredes1s2 = createParede();
        paredes1s2.setPorta(automatica);

        Sala s2 = createSala();
        s2.addParede(createParede());
        s2.addParede(paredes1s2);
        s2.addParede(createParede());

        Parede p23 = createParede();
        p23.setPorta(automatica);

        s2.addParede(p23);

        Sala s3 = createSala();
        s3.setMaxParedes(3);
        s3.addParede(createParede());
        s3.addParede(p23);
        s3.addParede(createParede());

    }

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
