package it.poliba.esameposte;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Impiegato {

    private String nome;

    private Stack<Lettera> lettere = new Stack<>();
    private Queue<Scatola> scatole = new LinkedList<>();

    private ArrayList<Lettera> lettereInviate = new ArrayList<>();
    private ArrayList<Scatola> scatoleInviate = new ArrayList<>();

    private int performance = 0;

    public Impiegato(String nome) {
        this.nome = nome;
    }

    public void daFile(String percorso) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(percorso));

        String s = reader.readLine();
        while (s != null) {
            String[] infoPacco = s.split("\\t+");

            if (infoPacco.length == 5) {
                scatole.add(new Scatola(infoPacco[0], infoPacco[1], infoPacco[3], Float.parseFloat(infoPacco[2]), Float.parseFloat(infoPacco[4])));
            } else if (infoPacco.length == 4) {
                lettere.add(new Lettera(infoPacco[0], infoPacco[1], infoPacco[3], Float.parseFloat(infoPacco[2])));
            }

            s = reader.readLine();
        }

        reader.close();
    }

    public void stampaSequenzaInvio(String percorsoLettere, String percorsoScatole) throws IOException {
        PrintWriter pwl = new PrintWriter(new BufferedWriter(new FileWriter(percorsoLettere)));

        pwl.println("{IMPIEGATO '" + nome + "'}");
        pwl.println("[LETTERE INVIATE]");
        lettereInviate.forEach(lettera ->
            pwl.println(lettera.getMittente() + "\t" + lettera.getDestinatario() + "\t" + lettera.getCostoSpedizione() + "\t" + lettera.getStatoDestinazione())
        );

        pwl.close();
        PrintWriter pws = new PrintWriter(new BufferedWriter(new FileWriter(percorsoScatole)));

        pws.println("{IMPIEGATO '" + nome + "'}");
        pws.println("[SCATOLE INVIATE]");
        scatoleInviate.forEach(scatola ->
            pws.println(scatola.getMittente() + "\t" + scatola.getDestinatario() + "\t" + scatola.getCostoSpedizione() + "\t" + scatola.getStatoDestinazione() + "\t" + scatola.getPeso())
        );

        pws.close();
    }

    public void inviaScatole(Queue<Scatola> scatole) {
        scatole.forEach(this::inviaScatola);
    }
    public void inviaLettere(Stack<Lettera> lettere) {
        lettere.forEach(this::inviaLettera);
    }

    public void inviaScatola(Scatola scatola) {
        scatoleInviate.add(scatola);
        performance += scatola.getPeso();
    }
    public void inviaLettera(Lettera lettera) {
        lettereInviate.add(lettera);
        performance++;
    }

    public Stack<Lettera> getLettere() {
        return lettere;
    }

    public Queue<Scatola> getScatole() {
        return scatole;
    }

    public int getPerformance() {
        return performance;
    }

    public ArrayList<Lettera> getLettereInviate() {
        return lettereInviate;
    }

    public ArrayList<Scatola> getScatoleInviate() {
        return scatoleInviate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
