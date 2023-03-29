package classi;

public class Formicaio
{
    private int[][]A;

    /*
        Costruttore: crea un formicaio il cui spazio è una matrice 
        quadrata di dimensione dim. Ogni cella dello spazio viene
        inizializzata con uno 0.
    */
    public Formicaio (int dim)
    {
        this.A = new int[dim][dim]; 
       
        for(int i = 0; i < dim; i++)
        {            
            for(int j = 0; j < dim; j++)
            {                
                this.A[i][j] = 0;
            }
        }
    }

    /*
        Aggiunge una formica nella cella (i,j) del formicaio riportando il suo id. Il metodo restituisce true se la formica
        è stata aggiunta correttamente, false se non è possibile aggiungerla. I motivi perché l’aggiunta potrebbe non
        essere possibile sono: la cella (i,j) è già occupata da un’altra formica; la cella (i,j) non è valida.
    */
    public boolean aggiungiFormica (int i, int j)
    {

        if(A[i][j] == 0 && i < this.A.length && j < this.A[0].length)
        {
            Formica F = new Formica(i, j);
            this.A[i][j]= F.getId();
            return true;
        }
        else
            return false;
    }

    /* Verifica se una cella (i,j) del formicaio è occupata da qualche formica */
    public boolean occupata (int i, int j)
    {
        if(this.A[i][j] != 0)
            return true;
        else
            return false;
    }

    /*
        Muove la formica avente l'id specificato in una direzione: 1=NORD, 2=OVEST, 3=SUD, 4=EST.
        Il metodo restituisce true se la formica è stata spostata correttamente, false se non è possibile spostarla.
        I motivi perché lo spostamento potrebbe non essere possibile sono: la cella di destinazione è già occupata da
        un’altra formica; la cella di destinazione non è valida; l’id specificato non è valido
    */
    public boolean muoviFormica (int direzione, int id)
    {
        for(int i = 0; i < this.A.length; i++)
        {
            for(int j = 0; j < this.A[0].length; j++)
            {
                if(this.A[i][j] == id)
                {
                    if(direzione == 1 && i-1 >= 0 && this.A[i-1][j] == 0)
                    {
                        this.A[i][j] = 0;
                        this.A[i-1][j] = id;
                        return true;
                    }
                    else if(direzione == 2 && j-1 >= 0 && this.A[i][j-1] == 0)
                    {
                        this.A[i][j] = 0;
                        this.A[i][j-1] = id;
                        return true;
                    }
                    else if(direzione == 3 && i+1 <= this.A.length && this.A[i+1][j] == 0)
                    {
                        this.A[i][j] = 0;
                        this.A[i+1][j] = id;
                        return true;
                    }
                    else if(direzione == 4 && j+1 <= this.A[0].length && this.A[i][j+1] == 0)
                    {
                        this.A[i][j] = 0;
                        this.A[i][j+1] = id;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
        Restituisce una rappresentazione testuale dello spazio del formicaio:
        per ogni formica è riportato il suo id in corrispondenza della sua posizione
    */
    public String toString ()
    {
        String s = "-------FORMICAIO-------\n";
        for(int i = 0; i < this.A.length; i++)
        {
            for(int j = 0; j < this.A[0].length; j++)
            {
                if(this.A[i][j] != 0)
                {
                    s += this.A[i][j] + "  ";
                }
                else
                    s += "*  ";
            }
            s += "\n";
        }
        return s;
    }

}
