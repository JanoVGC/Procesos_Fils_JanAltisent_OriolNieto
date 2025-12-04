package CFil;


public class Cfil implements Runnable {

    String aNomFil;

    int aTemporitzacio;

    public Cfil(String aNomFil, int aTemporitzacio) {
        aTemporitzacio = 500;

        aNomFil = pNomFil;
    }

    public String gNomFil() {
        return aNomFil;
    }

    public void sTemporitzacio (int pTemporitzacio) {

        aTemporitzacio = pTemporitzacio;
    }

    public run() {
        System.out.println("Iniciant execució procés " + aNomFil);

        try {
            for (int vComptador = 0; vComptador < 10; vComptador ++) {

                Thread.sleep(aTemporitzacio);

                System.out.println("Despertant aturada " + vComptador + " procès " + aNomFil);

            }
        }

        catch (InterruptedException e) {
            System.out.println("Interrompent execució procès " + aNomFil);
        }

        System.out.println("Acabant execució procès " + aNomFil);
    }

}