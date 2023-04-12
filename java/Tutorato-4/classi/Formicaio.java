package classi;

public class Formicaio
{
    private int[][]formicaio;

    /*
        Costruttore: crea un formicaio il cui spazio è una matrice 
        quadrata di dimensione dim. Ogni cella dello spazio viene
        inizializzata con uno 0.
    */
    public Formicaio (int dim)
    {
        this.formicaio = new int[dim][dim]; 
       
        for(int i = 0; i < dim; i++)
        {            
            for(int j = 0; j < dim; j++)
            {                
                this.formicaio[i][j] = 0;
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

        if(!(this.occupata(i, j)) && i < this.formicaio.length && j < this.formicaio[0].length)
        {
            FormicaV2 F = new FormicaV2(i, j);
            this.formicaio[i][j]= F.getId();
            return true;
        }
        else
            return false;
    }

    /* Verifica se una cella (i,j) del formicaio è occupata da qualche formica */
    public boolean occupata (int i, int j)
    {
        if(this.formicaio[i][j] != 0)
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
        for(int i = 0; i < this.formicaio.length; i++)
        {
            for(int j = 0; j < this.formicaio[0].length; j++)
            {
                if(this.formicaio[i][j] == id)
                {
                    if(direzione == 1 && i-1 >= 0 && !(this.occupata(i-1, j)))
                    {
                        this.formicaio[i][j] = 0;
                        this.formicaio[i-1][j] = id;
                        System.out.println("- Formica mossa correttamente!");
                        return true;
                    }
                    else if(direzione == 2 && j-1 >= 0 && !(this.occupata(i, j-1)))
                    {
                        this.formicaio[i][j] = 0;
                        this.formicaio[i][j-1] = id;
                        System.out.println("- Formica mossa correttamente!");
                        return true;
                    }
                    else if(direzione == 3 && i+1 <= this.formicaio.length && !(this.occupata(i+1, j)))
                    {
                        this.formicaio[i][j] = 0;
                        this.formicaio[i+1][j] = id;
                        System.out.println("- Formica mossa correttamente!");
                        return true;
                    }
                    else if(direzione == 4 && j+1 <= this.formicaio[0].length && !(this.occupata(i, j+1)))
                    {
                        this.formicaio[i][j] = 0;
                        this.formicaio[i][j+1] = id;
                        System.out.println("- Formica mossa correttamente!");
                        return true;
                    }
                }
            }
        }
        System.out.println("- Formica *NON* mossa correttamente...");
        return false;
    }

    /*
        Restituisce una rappresentazione testuale dello spazio del formicaio:
        per ogni formica è riportato il suo id in corrispondenza della sua posizione
    */
    public String toString ()
    {
        String s = "-------FORMICAIO-------\n";
        for(int i = 0; i < this.formicaio.length; i++)
        {
            for(int j = 0; j < this.formicaio[0].length; j++)
            {
                if(this.formicaio[i][j] != 0)
                {
                    s += this.formicaio[i][j] + "  ";
                }
                else
                    s += "*  ";
            }
            s += "\n";
        }
        return s;
    }

}
