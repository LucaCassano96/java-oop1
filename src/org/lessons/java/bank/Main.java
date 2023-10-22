package org.lessons.java.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanNome = new Scanner(System.in);
        System.out.println("Aggiungi il tuo nome");
        String nomeProprietario = scanNome.nextLine();

        Conto conto = new Conto( nomeProprietario, 0);

        System.out.println("il codice del tuo conto è " + conto.getCodice());

        //Aggiungi soldi

        Scanner scan = new Scanner(System.in);
        System.out.println("Ciao " + nomeProprietario + " Vuoi aggiungere soldi?");
        String vuoiAggiungereSoldi = scan.nextLine();

        if (vuoiAggiungereSoldi.equals("si") ) {
            System.out.println("Quanti solidi vuoi aggiungere?");
            Scanner scan2 = new Scanner(System.in);
            int piuSoldi = scan2.nextInt();
            conto.AggiungiSoldi(piuSoldi);

            System.out.println("Il tuo saldo è :" + conto.saldoConto() + "€");
        }


        //Preleva soldi

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Ciao " + nomeProprietario + " Vuoi prelevare soldi?");
        String vuoiPrelevareSoldi = scan3.nextLine();

        if (vuoiPrelevareSoldi.equals("si") ) {
            System.out.println("Quanti solidi vuoi prelevare?");
            Scanner scan4 = new Scanner(System.in);
            int menoSoldi = scan4.nextInt();
            conto.PrelevaSoldi(menoSoldi);

            System.out.println("Il tuo saldo è: " + conto.saldoConto() + "€");
        }

    }
}
