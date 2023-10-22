package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    private int numeroDiConto;
    private String nomeProprietario;
    private int saldoConto;

    private int codiceConto;

    public Conto( String nomeProprietario, int saldoConto){

        this.numeroDiConto = numeroDiConto;
        this.nomeProprietario = nomeProprietario;
        this.saldoConto = saldoConto;
        this.generateCode();
    }


    // Codice casuale conto
    private void generateCode() {
        Random rand = new Random();
        codiceConto = rand.nextInt(901) + 100;
    }

    // Getter del codice del conto
    public int getCodice() {
        return codiceConto;
    }

    // Getters e Setters proprietario
    public String getNome() {
        return nomeProprietario;
    }

    public void setNome(String nome) {
        this.nomeProprietario = nome;
    }

    // Getters numero del conto

    public int getNumeroDiConto() {
        return numeroDiConto;
    }

    // Getters saldo del conto

    public int saldoConto() {
        return saldoConto;
    }

    // Aggiungi soldi

    public void AggiungiSoldi(int piuSoldi) {
        saldoConto += piuSoldi;
    }

    //Preleva soldi

    public void PrelevaSoldi(int menoSoldi) {

        if (menoSoldi > 0 && saldoConto >= menoSoldi) {
            saldoConto -= menoSoldi;
        } else {
            System.out.println("Non puoi effettuare il prelievo. Il saldo è insufficiente o l'importo è negativo.");
        }
    }
}
