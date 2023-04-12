package classi;

public class Furgone extends Veicolo
{
    private double capacitaMassima;

    /*  
        costruttore: permette di creare un oggetto Furgone con modello,
        targa, numeroPosti e numeroPorte.
    */
    public Furgone(String targa, String modello, int numeroPosti, double capacitaMassima)
    {
        super(targa, modello, numeroPosti);
        this.capacitaMassima = capacitaMassima;
    }

    /* Restituisce una rappresentazione testuale del furgone  */
    public String toString()
    {
        String s = super.toString();
        s += ", capacita' massima: " + this.capacitaMassima + " Kg";
        
        return s;
    }

}
