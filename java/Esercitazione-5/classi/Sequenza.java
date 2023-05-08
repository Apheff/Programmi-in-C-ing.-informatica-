package classi;

public class Sequenza
{
    private Object[] sequenza;
    private static int numeroElementi = 0;
    /*  
        cotruttore: costruisce  una  sequenza  in  grado  di  contenere  al più dimMax elementi.
    */    
    public Sequenza(int dimMax)
    {
        this.sequenza = new Object[dimMax];
    }
    /*
        restituisce  la  lunghezza  della  sequenza,  cioè  il  numero  di elementi in essa memeorizzati. 
    */
    public int lunghezza()
    {
        return this.sequenza.length;
    }
    /*
        inserisce  l’oggetto  o  nella  sequenza come ultimo  elemento.
        Se la sequenza contiene già il numero massimo di elementi, l’oggetto non viene inserito.
        Restituisce true se l’oggetto è stato inserito, false in caso contrario.
    */
    public  boolean  inserisci(Object  o)
    {
        if(Sequenza.numeroElementi < this.lunghezza())
        {
            this.sequenza[numeroElementi] = o;
            numeroElementi++;
            return true;
        }
        else
            return false;
    }
    /*
        restituisce la posizione dell’oggetto o nella sequenza (la posizione è un indice tra  0 e lunghezza()-1).
        Se l’oggetto non è presente nella sequenza restituisce -1.
    */
    public int contiene(Object o)
    {
        for(int i = 0; i < Sequenza.numeroElementi; i++)
        {
            if(this.sequenza[i] == o)
                return i;
        }
        return -1;
    }
    /*
        rimuove l’oggetto o dalla sequenza. Se l’oggetto non è presente nella sequenza
        la sequenza rimane inalterata. Restituisce  true  se l’oggetto è stato rimosso, false in caso contrario.
    */
    public boolean rimuovi(Object o)
    {
        for(int i = 0; i < Sequenza.numeroElementi; i++)
        {
            if(this.sequenza[i] == o)
            {
                this.sequenza[i] = null;
                return true;
            }
        }
        return false;
    }
}
