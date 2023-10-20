package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private int prezzo;
    private int iva;

   public Prodotto(String nome, String descrizione, int prezzo, int iva){

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.generateCode();
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public String getNomeAndCode() {
        return nome + codice;
    }

    public void setNomeandCode(String nome, int codice) {
        this.nome = nome;
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }


    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }


    public int prezzoFinale() {
        return (this.prezzo * this.iva / 100 + this.prezzo);
    }


    //Code Generator

    private void generateCode() {
        Random rand = new Random();
        codice = rand.nextInt(901) + 100;
    }

    public int getCodice() {
        return codice;
    }
}
