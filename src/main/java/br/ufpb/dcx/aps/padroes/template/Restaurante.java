package br.ufpb.dcx.aps.padroes.template;

public class Restaurante {


    public static void main(String[] args) {

        Receita receitaboloC = new ReceitaBoloChocolate();

        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.cozinhar(receitaboloC);


    }
}
