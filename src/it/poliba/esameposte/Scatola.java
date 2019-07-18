package it.poliba.esameposte;

public class Scatola extends Pacco {

    private float peso;

    public Scatola(String mittente, String destinatario, String statoDestinazione, float costoSpedizione, float peso) {
        super(mittente, destinatario, statoDestinazione, costoSpedizione);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
