package classi;

public class Tartaglia
{
    private int[][] triangolo; 

    /* costruttore. Costruisce un triangolo di Tartaglia con n righe */ 
    public Tartaglia(int n)
    {
        this.triangolo = new int[n][n];

        for(int i = 0; i < this.triangolo.length; i++)
        {
            for(int j = 0; j < this.triangolo[0].length; j++)
            {
                if(0 <= j && j <= i)
                {
                    if (j == 0 || j == i)
                    {
                        this.triangolo[i][j] = 1;
                    }
                    else
                    {
                        this.triangolo[i][j] = this.triangolo[i-1][j-1] + this.triangolo[i-1][j];
                    }
                }
            }
        }
    } 
     
    /* restituisce la riga i-esima del triangolo rappresentato */ 
    public int[] getRiga(int i)
    {
        int[] riga = new int[i];

        for(int j = 0; j < this.triangolo.length; j++)
        {
            riga[j] = this.triangolo[i][j];
        }

        return riga;
    } 

    /* restituisce una descrizione del triangolo rappresentato  
     sotto forma di stringa */ 
    public String toString()
    {
        String s = "";
        for(int i = 0; i < this.triangolo.length; i++)
        {
            for (int spazi = 1; spazi < this.triangolo.length - i; spazi++)
            {
                s += "      ";
            }

            for(int j = 0; j < this.triangolo[0].length; j++)
            {
                if(this.triangolo[i][j] != 0)
                {
                    s += this.triangolo[i][j];
                    int count;
                    for(count = 12; this.triangolo[i][j] > 0;count--)
                    {
                        this.triangolo[i][j] /= 10;
                    }
                    while(count > 0)
                    {
                        s += " ";
                        count--;
                    }

                }
            }
            s += "\n";

        }

        return s;
    } 
}