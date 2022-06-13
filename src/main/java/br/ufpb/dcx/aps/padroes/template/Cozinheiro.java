package br.ufpb.dcx.aps.padroes.template;

public class Cozinheiro {


    public void cozinhar(Receita receita){
        receita.juntarIngredientes();
        receita.levarAoForno();
        receita.retirarDoForno();
    }
}
