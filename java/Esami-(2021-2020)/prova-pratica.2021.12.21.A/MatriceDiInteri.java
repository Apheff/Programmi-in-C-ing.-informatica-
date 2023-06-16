import fond.io.*;

public class MatriceDiInteri
{
    private int[][] mat;  
 
    /* Crea un oggetto matriceDiInteri il cui contenuto è rappresentato dall’array m (che si può assumere 
    essere quadrato) */ 
    public MatriceDiInteri (int[][] m)
    {
        this.mat = new int[m.length][m[0].length];

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                this.mat[i][j] = m[i][j];
            }
        }
    } 
    
    /* Restituisce true se la riga i-esima della matrice rappresentata dall’oggetto ricevente (this) ha 
    tutti elementi distinti. Si può assumere che l’indice i sia un indice valido. */ 
    public boolean rigaDistinti(int i)
    {
        int distinti;

        for(int j = 0; j < this.mat.length; j++)
        {
            distinti = this.mat[i][j];
            for(int k = j + 1; k < this.mat.length; k++)
            {
                if(distinti == this.mat[i][k])
                {
                    return false;
                }
            }
        }

        return true;
    } 
    
    /* Restituisce un oggetto di tipo MatriceDiInteri che rappresenta la sottomatrice dell’oggetto 
    ricevente (this) che inizia nell’elemento (0,0) e finisce nell’elemento (i,i). Si può assumere che l’indice 
    i sia un indice valido.  */ 
    public MatriceDiInteri estraiSottomatrice(int i)
    {
        int sottomatrice[][] = new int[i+1][i+1];

        for(int j = 0; j < sottomatrice.length; j++)
        {
            for(int k = 0; k < sottomatrice[j].length; k++)
            {
                sottomatrice[j][k] = this.mat[j][k];
            }
        }

        MatriceDiInteri mdi = new MatriceDiInteri(sottomatrice);

        return mdi;
    }
    
    /* Restituisce una descrizione testuale dell’oggetto ricevente (this). */ 
    public String toString ()
    {
        String s = "---------Matrice---------\n";

        for(int i = 0; i < this.mat.length; i++)
        {
            for(int j = 0; j < this.mat[i].length; j++)
            {
                s += this.mat[i][j] + " ";
            }
            s += "\n";
        }

        return s;
    }
    

    public static void main (String[] args)
    {
        /*
            int matriceEsercizio[][] = 
            {
                {1,2,9,7},
                {2,5,2,6},
                {1,3,7,3},
                {9,9,7,6}
            };
        */

        /*  inizializzazione  */
        InputWindow in = new InputWindow();

        /*
            Fa inserire all’utente una  matrice  di  interi  (dimensione
            della  matrice  e  valore  degli  elementi  sono 
            scelti dall’utente)
        */
        int dim = in.readInt("Inserisci la dimensione dell'array");
        int m[][] = new int[dim][dim];

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                m[i][j] = in.readInt("inserisci la posizione ("+i+", "+j+") dell'array creato" );
            }
        }
        /*
            Crea  un  oggetto  mdi  di  tipo  MatriceDiInteri  che  
            rappresenta  la  matrice  inserita dall’utente e la visualizza.
        */
        MatriceDiInteri mdi = new MatriceDiInteri(m);
        System.out.println(mdi.toString());

        /*
            Fa inserire ripetutamente all’utente un indice i e dice all’utente se la riga di indice i ha tutti elementi 
            distinti.  Se  i  non  è  un  indice  valido  visualizza  un  opportuno  messaggio  di  errore.  L’inserimento di 
            valori continua finché l’utente non decide di smettere.
        */
        char opzione = 's';
        while(opzione != 'n')
        {
            int index = in.readInt("inserisci una i per verificare se la riga ha elementi distinti");
            System.out.println(mdi.rigaDistinti(index));
            opzione = in.readChar("inserisci 's' (si) oppure 'n' (no) se vuoi continuare o meno");
        }

        int i = in.readInt("inserisci una i per estrarre una sottomatrice");
        if(i < dim && i > 0)
            System.out.println(mdi.estraiSottomatrice(i).toString());
        else
            System.out.println("**ERRORE 404**");
    }
}
