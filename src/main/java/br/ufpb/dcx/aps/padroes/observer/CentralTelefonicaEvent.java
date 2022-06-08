package br.ufpb.dcx.aps.padroes.observer;

public class CentralTelefonicaEvent {

    private TipoSinal tipoSinal;

    public CentralTelefonicaEvent(TipoSinal tipoSinal){
        this.tipoSinal = tipoSinal;
    }

    public TipoSinal getTipoSinal(){
        return this.tipoSinal;
    }

}
