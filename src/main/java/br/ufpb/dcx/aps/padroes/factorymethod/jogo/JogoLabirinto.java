package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.ParedeWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.PortaWolf;
import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.SalaWolf;

public class JogoLabirinto {


    public void montarLabirinto(LabirintoFactory factory){

        Sala s1 = factory.createSala();

        s1.addParede(factory.createParede());
        s1.addParede(factory.createParede());
        s1.addParede(factory.createParede());

        Porta automatica = factory.createPorta();

        Parede paredes1s2 = factory.createParede();
        paredes1s2.setPorta(automatica);

        Sala s2 = factory.createSala();
        s2.addParede(factory.createParede());
        s2.addParede(paredes1s2);
        s2.addParede(factory.createParede());

        Parede p23 = factory.createParede();
        p23.setPorta(automatica);

        s2.addParede(p23);

        Sala s3 = factory.createSala();
        s3.setMaxParedes(3);
        s3.addParede(factory.createParede());
        s3.addParede(p23);
        s3.addParede(factory.createParede());

    }



}
