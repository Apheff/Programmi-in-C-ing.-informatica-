package classi;

public class Automobile extends Veicolo
{
    private int numeroPorte;
    
    /*  
        costruttore: permette di creare un oggetto Automobile con modello,
        targa, numeroPosti e numeroPorte.
    */
    public Automobile(String targa, String modello, int numeroPosti, int numeroPorte)
    {
        super(targa, modello, numeroPosti);
        this.numeroPorte = numeroPorte;
    }
    /* Restituisce una rappresentazione testuale dell'automobile  */
    public String toString()
    {
        String s = super.toString();
        s += ", porte: " + this.numeroPorte;

        return s;
    }
}
