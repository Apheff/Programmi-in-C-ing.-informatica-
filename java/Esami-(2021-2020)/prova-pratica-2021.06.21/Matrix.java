public class Matrix
{
    private int[][] mat; 
  
    /* crea un oggetto Matrix il cui contenuto è rappresentato dall’array passato come parametro. */ 
    public Matrix (int[][] m)
    {
        this.mat = new int[m.length][m[0].length];

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[0].length; j++)
            {
                this.mat[i][j] = m[i][j];
            }
        }
    } 
    
    /* riceve come parametro due indici i e j e restituisce il valore del quadrante inferiore dell'elemento 
    (i,j). Si può assumere che 0  i n-1 e 0  j n-1 */ 
    public int sommaQuadranteInferiore(int i, int j)
    {
        int somma = 0;

        if(0 <= i && i <= this.mat.length-1 || 0 <= j && j <= this.mat[0].length)
        {
            for(int k = i + 1; k < this.mat.length; k++)
            {
                for(int h = j + 1; h < this.mat[0].length; h++)
                {
                    somma += this.mat[k][h];
                }
            }    
        }
        else
        {
            somma = -1;
        }

        return somma;

    } 
    
    /* riceve come parametro due indici i e j e restituisce il valore del quadrante superiore dell'elemento 
    (i,j). Si può assumere che 0  i n-1 e 0  j n-1 */ 
    public int sommaQuadranteSuperiore(int i, int j)
    {
        int somma = 0;

        if(0 <= i && i <= this.mat.length-1 || 0 <= j && j <= this.mat[0].length)
        {
            for(int k = 0; k < i; k++)
            {
                for(int h = 0; h < j; h++)
                {
                    somma += this.mat[k][h];
                }
            }    
        }
        else
        {
            somma = -1;
        }

        return somma;        
    } 
    
    /* restituisce un array bidimensionale a il cui elemento a[i][0] (0  i n-1) è pari al valore del 
    quadrante superiore dell'elemento (i,i) e il cui elemento a[i][1] è pari al valore del quadrante 
    inferiore dell'elemento (i,i).  */ 
    public int[][] sommaQuadrantiSuperiori()
    {
        int[][] somma = new int[this.mat.length][2];

        for(int i = 0; i < this.mat.length; i++)
        {
                somma[i][0] += sommaQuadranteInferiore(i, i);
                somma[i][1] += sommaQuadranteSuperiore(i, i);
        }

        return somma;
    } 
    
    /* restituisce una descrizione della matrice sotto forma di stringa */ 
    public String  toString()
    {
        String s = "";

        for(int i = 0; i < this.mat.length; i++)
        {
            for(int j = 0; j < this.mat[0].length; j++)
            {
                s += this.mat[i][j] + " ";
            }
            s += "\n";
        }

        return s;
    }
}
