package it.poliba.esameposte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Direttore {

    private ArrayList<Impiegato> impiegati = new ArrayList<>();

    public void stampaPerformanceImpiegati(String percorso) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(percorso)));

        ArrayList<Impiegato> impiegatiOrdinati = new ArrayList<>(impiegati);
        impiegatiOrdinati.sort((Impiegato i1, Impiegato i2) -> Integer.compare(i2.getPerformance(), i1.getPerformance()));
        impiegatiOrdinati.forEach(impiegato -> pw.println(impiegato.getNome() + " -> Performance " + impiegato.getPerformance()));

        pw.close();
    }

    public void aggiungiImpiegato(Impiegato impiegato) {
        this.impiegati.add(impiegato);
    }
    public void aggiungiImpiegati(ArrayList<Impiegato> impiegati) {
        this.impiegati.addAll(impiegati);
    }

    public ArrayList<Impiegato> getImpiegati() {
        return impiegati;
    }

}
