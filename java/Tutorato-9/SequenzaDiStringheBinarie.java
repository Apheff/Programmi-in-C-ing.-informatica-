import fond.io.InputWindow;

public class SequenzaDiStringheBinarie
{
    private String[] seq;

    /* crea un oggetto SequenzaDiStringheBinarie il cui contenuto è
    rappresentato dall’array seq. Si assuma che tutte le stringhe di seq,
    siano effettivamente stringhe binarie. */
    public SequenzaDiStringheBinarie (String[] seq)
    {
        this.seq = new String[seq.length];

        for(int i = 0; i < seq.length; i++)
        {
            this.seq[i] = seq[i];
        }
    }

    /* Dato un indice i restituisce il valore numerico rappresentato dalla
    stringa binaria in posizione i se interpretata come un numero binario. Si
    assuma che i sia un indice valido. */
    public int valoreStringa(int i)
    {
        int decimale = 0;
        String binario = this.seq[i];

        for(int k = 0; k < binario.length(); k++)
        {
            if(binario.charAt(k) == '1')
            {
                decimale += Math.pow(2, binario.length() - k - 1);
            }
            else if(binario.charAt(k) != '0')
            {
                return -1;
            }
        }

        return decimale;
    }

    /* Dato un intero k restituisce gli indici delle stringhe di seq il cui
    valore (se interpretate come numeri binari) è superiore a k */
    public int[] elementiSopraSoglia(int k)
    {
        int[] sopraK = new int[this.seq.length]; 

        for(int i = 0; i < this.seq.length; i++)
        {
            if(k < valoreStringa(i))
            {
                sopraK[i] = valoreStringa(i);
            }
        }
    
        return sopraK;
    }

    /* Restituisce una rappresentazione testuale della sequenza di stringhe.
    Per ogni elemento della sequenza va mostrata la stringa binaria e, tra
    parentesi, il valore numerico della stringa (se interpretata come numero
    binario) */
    public String toString()
    {
        String s = "+-------------------------------+\n";
        s += String.format("|%-31s|\n","Sequenza di stringhe binarie");
        s += "+-------------------------------+\n";

        for(int i = 0; i < this.seq.length; i++)
        {
            if(valoreStringa(i) > 0)
            {
                s += String.format("|%-31s|\n", this.seq[i]+" ("+valoreStringa(i)+")");
                s += "+-------------------------------+\n";
            }
            else
            {
                s += String.format("|%-31s|\n",this.seq[i] + " (*ERRORE 404*)");
                s += "+-------------------------------+\n";
            }
        }
        return s;
    }


    // prova della classe
    public static void main(String[] args)
    {
        InputWindow in = new InputWindow();

        int n = in.readInt("inserisci la dimensione della sequenza");

        String[] seq = new String[n]; 

        for(int i = 0; i < seq.length; i++)
        {
            seq[i] = in.readString("inserisci il "+i+"-esimo numero");
        }

        SequenzaDiStringheBinarie binario = new SequenzaDiStringheBinarie(seq);

        System.out.println(binario.toString());
    }
}
