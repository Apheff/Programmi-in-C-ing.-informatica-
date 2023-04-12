package classi;

public class Veicolo
{
    private String modello, targa;
    private int numeroPosti;
    
    /*  
        costruttore: permette di creare un oggetto Veicolo con modello,
        targa e numeroPosti.
    */
    public Veicolo(String targa, String modello, int numeroPosti)
    {
        this.targa = targa;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }

    /* Restituisce una rappresentazione testuale del veicolo */
    public String toString()
    {

        String s = "Targa: " + this.targa + ", ";
        s += "modello: " + this.modello + ", ";
        s += "posti: " + this.numeroPosti;

        return s;
    }
}
