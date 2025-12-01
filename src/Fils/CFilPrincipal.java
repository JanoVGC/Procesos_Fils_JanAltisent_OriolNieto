package cFilPrincipal;

import Cfil;


public class CFilPrincipal {

    public static void main(String[] pArguments) {
        System.out.println("Fil principal iniciat.");
        System.out.println("Fil secundari iniciat.");

        Cfil = vObjecteFil = new Cfil ("#1");

        vFil = start();

        System.out.println("Iniciant execució procès principal");

        try {
            for (int vComptador = 0; vComptador < 10; vComptador ++) {

                Thread.sleep(500);

                System.out.println("Despertant aturada " + vComptador + " procès principal");
            }
        }

        catch (InterruptedException ex) {
            System.out.println("Interrompent execució procès principal");
        }

        System.out.println("Acabant execució principal");

    }


}

