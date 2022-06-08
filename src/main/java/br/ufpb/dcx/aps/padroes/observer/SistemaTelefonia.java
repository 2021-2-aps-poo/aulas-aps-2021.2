package br.ufpb.dcx.aps.padroes.observer;

public class SistemaTelefonia {

    public static void main(String[] args) {


        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();
        Telefone telefone3 = new Telefone();
        Telefone telefone4 = new Telefone();
        Telefone telefone5 = new Telefone();

        Fax fax = new Fax();


        CentralTelefonica central = new CentralTelefonica();

        central.addListener(telefone);
        central.addListener(telefone2);
        central.addListener(telefone3);
        central.addListener(telefone4);
        central.addListener(telefone5);
        central.addListener(fax);

        central.novaChamada(TipoSinal.dados);


    }




}
