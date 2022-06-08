package br.ufpb.dcx.aps.padroes.observer;

import javax.swing.event.TreeSelectionListener;
import java.util.LinkedList;
import java.util.List;

public class CentralTelefonica {

    private List<CentralTelefonicaListener> listeners = new LinkedList<>();


    public void addListener(CentralTelefonicaListener telefone){
        this.listeners.add(telefone);
    }


    public void novaChamada(TipoSinal sinal){

        CentralTelefonicaEvent event = new CentralTelefonicaEvent(sinal);

        for(CentralTelefonicaListener listener: listeners) {
                listener.novaChamada(event);
        }

    }

}
