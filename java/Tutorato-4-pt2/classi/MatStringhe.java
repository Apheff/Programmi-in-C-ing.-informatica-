package classi;

public class MatStringhe 
{
    private String[][] nuts; // memorizza le stringhe della tabella  
    
    /* Costruttore: permette di creare un oggetto MatStringhe, la 
    cui tabella è rappresentata dall’array di array m */  
    public MatStringhe (String[][] mat)
    {
        this.nuts = new String[mat.length][mat[0].length];

        for(int i = 0; i < this.nuts.length; i++)
        {
            for(int j = 0; j < this.nuts[0].length; j++)
            {
                this.nuts[i][j] = mat[i][j];
            }
        }

    } 
    
    /* Restituisce una rappresentazione testuale della tabella di 
    stringhe */  
    public String toString ()
    {
        String s = "***********Matrice di Stringhe**************\n\n";

        for(int i = 0; i < this.nuts.length; i++)
        {
            for(int j = 0; j < this.nuts[0].length; j++)
            {
                s += this.nuts[i][j] + " ";
            }
            s += "\n";
        }

        return s; 
    }
    
    /* Restituisce la stringa più corta tra quelle della colonna 
    j specificata */  
    public String stringaCorta (int j)
    {
        String corta = this.nuts[0][j];
        for(int i= 0; i < this.nuts.length; i++)
        {
            if(this.nuts[i][j].length() < corta.length())
            {
                corta = this.nuts[i][j];
            }
        }

        return corta;
    }  
    
    /* Restituisce, sotto forma di array, le sole stringhe della 
    tabella che hanno una lunghezza maggiore di k */ 
    public String[] stringheLunghe (int k)
    {
        int count = 0;
        for(int i = 0; i < this.nuts.length; i++)
        {
            for(int j = 0; j < this.nuts[0].length; j++)
            {
                if(this.nuts[i][j].length() > k)
                    count++;
            }
        }

        String[] lunghe = new String[count];
        int index = 0;
        for(int i = 0; i < this.nuts.length; i++)
        {
            for(int j = 0; j < this.nuts[0].length; j++)
            {
                if(this.nuts[i][j].length() > k)
                {
                    lunghe[index] = this.nuts[i][j];
                    index++;
                }

            }
        }

        return lunghe;
    } 
    
    /* Restituisce un array di interi di dimensione pari al 
    numero di righe della tabella e tale che nella cella di 
    indice i è scritta la somma delle lunghezze delle stringhe 
    sulla riga i della tabella */         
    public int[] sommaLunghezzeRighe ()
    {
        int[] sommaLunghezza = new int[this.nuts[0].length];

        for(int i = 0; i < this.nuts.length; i++)
        {
            int sum = 0;

            for(int j = 0; j < this.nuts[0].length; j++)
            {
                sum += this.nuts[i][j].length();
            }
            sommaLunghezza[i] = sum;
        }

        return sommaLunghezza;
    }
    
    /* Restituisce un array bidimensionale di caratteri che 
    riporta un carattere in ogni cella. Il carattere nella cella 
    (i,j) è ‘v’ (vocale) o ‘-’ (altro), in base alla lettera 
    iniziale della stringa nella cella (i,j) della tabella mat */         
    public char[][] letteraIniziale ()
    {
        char[][] vocali = new char[this.nuts.length][this.nuts[0].length];

        for(int i = 0; i < this.nuts.length; i++)
        {
            for(int j = 0; j < this.nuts[0].length; j++)
            {
                if( this.nuts[i][j].charAt(0) == 'a' ||
                    this.nuts[i][j].charAt(0) == 'A' ||
                    this.nuts[i][j].charAt(0) == 'e' ||
                    this.nuts[i][j].charAt(0) == 'E' ||
                    this.nuts[i][j].charAt(0) == 'i' ||
                    this.nuts[i][j].charAt(0) == 'I' ||
                    this.nuts[i][j].charAt(0) == 'o' ||
                    this.nuts[i][j].charAt(0) == 'O' ||
                    this.nuts[i][j].charAt(0) == 'u' ||
                    this.nuts[i][j].charAt(0) == 'U')
                {
                    vocali[i][j] = 'v';
                }
                else
                {
                    vocali[i][j] = '-';
                }
            }
        }

        return vocali;
    }
    
}
