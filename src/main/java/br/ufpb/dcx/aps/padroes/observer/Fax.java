package br.ufpb.dcx.aps.padroes.observer;

public class Fax implements CentralTelefonicaListener {


    @Override
    public void novaChamada(CentralTelefonicaEvent event) {
        if(event.getTipoSinal().equals(TipoSinal.dados))
            this.receberDados();
    }


    public void receberDados(){
        System.out.println("KUEFH&*YH(Y&(T#@(&#@*TBI*&TE&¨@WTBE!&I@WTE&@¨WTG@&WT");
    }
}
