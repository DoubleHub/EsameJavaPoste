package it.poliba.esameposte;

public abstract class Pacco {

    protected String mittente;
    protected String destinatario;
    protected String statoDestinazione;
    protected float costoSpedizione;

    public Pacco(String mittente, String destinatario, String statoDestinazione, float costoSpedizione) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.statoDestinazione = statoDestinazione;
        this.costoSpedizione = costoSpedizione;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getStatoDestinazione() {
        return statoDestinazione;
    }

    public void setStatoDestinazione(String statoDestinazione) {
        this.statoDestinazione = statoDestinazione;
    }

    public float getCostoSpedizione() {
        return costoSpedizione;
    }

    public void setCostoSpedizione(float costoSpedizione) {
        this.costoSpedizione = costoSpedizione;
    }

}
