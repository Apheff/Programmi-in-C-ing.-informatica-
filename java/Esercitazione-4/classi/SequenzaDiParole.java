package classi;

public class SequenzaDiParole
{
  
    private String[] seq; // memorizza le parole della sequenza 
         
    /* Crea un oggetto SequenzaDiParole. La sequenza è composta dalle stringhe che  
    compaiono nell'array seq. */ 
    public SequenzaDiParole (String[] seq)
    {
        this.seq = new String[seq.length];

        for(int i = 0; i < seq.length; i++)
        {
            this.seq[i] = seq[i];
        }
    } 
         
    /*  Crea  un  oggetto  SequenzaDiParole.  La  sequenza  è  composta  dalle  parole  che 
    comapiono  nella  stringa  testo  (le  parole  sono  separate  da  uno  o  più  spazi).  Per 
    ottenere le diverse parole che compongono il testo si consiglia di utilizzare il metodo 
    String[] split(String sep) della classe String che consente si spezzare una stringa 
    in sottostringhe separate  dal separatore  sep e le restituisce sotto forma  di  array di 
    stringhe. */ 
    public SequenzaDiParole (String testo)
    {
        this.seq = testo.split(" ");
    }
         
    /* Restituisce un oggetto di tipo SequenzaDiParole la cui sequenza contiene le 
    parole della sequenza rappresentata dall’oggetto ricevente che contengono la 
    stringa s come sottostringa */ 
    public SequenzaDiParole paroleCheContengono(String s)
    {
        String sequenzaParole = "";

        for(int i = 0; i < this.seq.length ; i++)
        {   
            if(this.seq[i].indexOf(s) != -1)
            {
                sequenzaParole += " " + this.seq[i];
            }
        }
        return new SequenzaDiParole(sequenzaParole);
    } 
         
    /* Restituisce una stringa in cui vengono mostrate (una per riga) tutte le parole della 
    sequenza. */ 
    public String toString()
    {
        String s = "";
        
        s += "**********Sequenza di parole****************\n";
        for(int i = 0; i < this.seq.length; i++)
        {
            s += (i+1) + "-  " + this.seq[i] + "\n";
        }
        return s;
    }
}
