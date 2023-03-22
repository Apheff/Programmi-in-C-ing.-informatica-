package classi;

public class Distributore
{
    private String Nome, Cognome, Indirizzo;
    private double Scorta;
    private static double prezzoCarburante;


    /* crea un oggetto Distributore con gestore e indirizzo specificati; la scorta è fissata a
    0 dal costruttore */
    public Distributore (String nomeGestore, String cognomeGestore, String indirizzo)
    {
        this.Nome = nomeGestore;
        this.Cognome = cognomeGestore;
        this.Indirizzo = indirizzo;
        this.Scorta = 0;
    }



    /* crea un oggetto Distributore con gestore, indirizzo e scorta specificati */
    public Distributore (String nomeGestore, String cognomeGestore, String indirizzo, double scorta)
    {
        this.Nome = nomeGestore;
        this.Cognome = cognomeGestore;
        this.Indirizzo = indirizzo;
        this.Scorta = scorta;
    }

    /* effettua un rifornimento di carburante. Il parametro litri indica i litri prelevati che
    vanno quindi sottratti alla scorta. Il metodo restituisce la somma da pagare per il
    rifornimento effettuato */
    public double rifornisci (double litri)
    {
        this.Scorta -= litri;
        return litri*prezzoCarburante;
    }

    /* aggiunge alla scorta la quantità di litri passata come parametro */
    public void ricaricaScorta ( double litri )
    {
        this.Scorta += litri;
    }

    /* modifica il valore del prezzo al litro del carburante con la nuova cifra indicata */
    public static void setPrezzo ( double prezzo )
    {
        Distributore.prezzoCarburante = prezzo;
    }

    /* restituisce una descrizione completa del distributore */
    public String toString ()
    {
        String s = "";
        s += "- Nome :" + this.Nome + "\n";
        s += "- Cognome :" + this.Cognome + "\n"; 
        s += "- Indirizzo :" + this.Indirizzo + "\n"; 
        s += "- Scorta :" + this.Scorta + "\n";
        s += "- Prezzo Carburante :" + prezzoCarburante + " $\n";
        return s;
    }
}