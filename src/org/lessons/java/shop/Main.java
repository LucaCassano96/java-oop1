package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {


        Prodotto prodotto1 = new Prodotto("tastiera", "tastiera intelligente che scrive per te", 50, 22);


        String nomeProdotto = prodotto1.getNome();
        String descrizioneProdotto1 = prodotto1.getDescrizione();
        int prezzo = prodotto1.getPrezzo();
        int prezzoFinale = prodotto1.prezzoFinale();
        int iva = prodotto1.getIva();
        String nomeECodice = prodotto1.getNomeAndCode();
        int codice = prodotto1.getCodice();

        System.out.println("nome prodotto: " + nomeProdotto + "\n" + "prezzo prodotto €" +  prezzoFinale);
    }


}
