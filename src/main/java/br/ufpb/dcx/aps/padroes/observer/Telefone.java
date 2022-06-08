package br.ufpb.dcx.aps.padroes.observer;

public class Telefone implements CentralTelefonicaListener{


    public void tocarCampainha(){
        System.out.println("Triiiiimmmmmmm");
    }


    @Override
    public void novaChamada(CentralTelefonicaEvent event) {
        if(event.getTipoSinal() == TipoSinal.voz)
            this.tocarCampainha();
    }
}
