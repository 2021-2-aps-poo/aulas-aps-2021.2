package br.ufpb.dcx.aps.padroes.factorymethod.jogo;

import br.ufpb.dcx.aps.padroes.factorymethod.jogo.wolf.WolfFactory;

public class JogoWolf {

    public static void main(String[] args) {

        JogoLabirinto labirintoWolf = new JogoLabirinto();
        labirintoWolf.montarLabirinto(new WolfFactory());

    }
}
