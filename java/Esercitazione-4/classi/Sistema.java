package classi;

public class Sistema
{ 
 
    private double[][]  A;  // matrice dei coefficienti 
    private double[] b;     // vettore dei termini noti 
    
    /* crea un sistema lineare la cui matrice dei coefficienti è A e il cui vettore dei termini 
    noti è b. Si può assumere che A e b abbiano dimensioni coerenti (cioè il numero di 
    elementi di b sia pari al numero di righe di A) */ 
    public Sistema(double[][] A, double[] b)
    {
        /*  creazione della matrice A */
        this.A = new double[A.length][A[0].length];

        for(int i = 0; i < this.A.length; i++)
        {
            for(int j = 0; j < this.A[0].length ; j++)
            {
                this.A[i][j] = A[i][j];
            }
        }

        /*  creazione dell'array b */
        this.b = new double[b.length];

        for(int i = 0; i < this.A.length ; i++)
        {
            this.b[i] = b[i];
        }

    } 
    
    /* Restituisce true se il vettore x passato come parametro è una soluzione della 
    equazione i-esima del sistema. Si può assumere che la dimensione di x sia corretta 
    (cioè sia pari al numero di colonne della matrice dei coefficienti)  */ 
    public boolean verificaEquazione(int i, double[] x)
    {
        double sum = 0;

        for(int j = 0; j < this.A[0].length; j++)
        {
            sum += x[j] * this.A[i][j];
        }

        if(sum == this.b[i])
            return true;
        else
            return false;
    }
    
    /* Restituisce true se il vettore x passato come parametro è una soluzione del 
    sistema. Si può assumere che la dimensione di x sia corretta (cioè sia pari al 
    numero di colonne della matrice dei coefficienti)*/ 
    public boolean verificaSistema(double[] x)
    {

        for(int i = 0; i < this.A.length; i++)
        {
            if(!(verificaEquazione(i, x))) // sfrutto l'equazione creata precedentemente
                return false;
        }
        return true;
    }
     
    /* Restituisce sotto forma di stringa l'equazione i-esima del sistema */ 
    public String stampaEquazione(int i)
    {
        String s = "";
        for(int j = 0; j < (this.A[0].length-1); j++)
        {
            if(j > 0 && this.A[i][j] > 0)
                s += " + ";
            if(A[i][j] != 0)
                s += this.A[i][j] + "x" + (j+1);
        }
        s += " = " + this.b[i];
        return s; 
    }
    
    /* Restituisce sotto forma di stringa il sistema */ 
    public String toString()
    {
        String s = "************Sistema*************\n";
        for(int i = 0; i < this.A.length; i++)
        {
            s += stampaEquazione(i) + "\n";
        }
        return s;         
    }
   }