package it.poliba.esameposte;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            Direttore direttore = new Direttore();

            Impiegato eligio = new Impiegato("Eligio");
            eligio.daFile("impiegati/eligio.txt");

            Impiegato emanuele = new Impiegato("Emanuele");
            emanuele.daFile("impiegati/emanuele.txt");

            Impiegato gianfranco = new Impiegato("Gianfranco");
            gianfranco.daFile("impiegati/gianfranco.txt");

            Impiegato mauro = new Impiegato("Mauro");
            mauro.daFile("impiegati/mauro.txt");

            direttore.aggiungiImpiegato(eligio);
            direttore.aggiungiImpiegato(emanuele);
            direttore.aggiungiImpiegato(gianfranco);
            direttore.aggiungiImpiegato(mauro);

            eligio.inviaLettere(eligio.getLettere());
            eligio.inviaScatole(eligio.getScatole());
            eligio.stampaSequenzaInvio("invii_eligio_lettere.txt", "invii_eligio_scatole.txt");

            emanuele.inviaLettere(emanuele.getLettere());
            emanuele.inviaScatole(emanuele.getScatole());
            emanuele.stampaSequenzaInvio("invii_emanuele_lettere.txt", "invii_emanuele_scatole.txt");

            gianfranco.inviaLettere(gianfranco.getLettere());
            gianfranco.inviaScatole(gianfranco.getScatole());
            gianfranco.stampaSequenzaInvio("invii_gianfranco_lettere.txt", "invii_gianfranco_scatole.txt");

            mauro.inviaLettere(mauro.getLettere());
            mauro.inviaScatole(mauro.getScatole());
            mauro.stampaSequenzaInvio("invii_mauro_lettere.txt", "invii_mauro_scatole.txt");

            direttore.stampaPerformanceImpiegati("performance.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
