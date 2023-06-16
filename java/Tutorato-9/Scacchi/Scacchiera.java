public class Scacchiera
{

    private Pezzo[][] scacchiera;

    /* crea una scacchiera vuota, cioè senza pezzi. */
    public Scacchiera()
    {
        this.scacchiera = new Pezzo[8][8];
    }

    /* Posiziona il pezzo p in posizione (i,j). Se i e j non sono indici
    validi la scacchiera non viene modificata. Se la posizione (i,j) è già
    occupata da un altro pezzo la scacchiera non viene modificata. Se p è
    nullo la scacchiera non viene modificata. Il metodo restituisce true se il
    posizionamento è avvenuto con successo, false altrimenti */
    public boolean posizionaPezzo(int i, int j, Pezzo p)
    {
        boolean posiziona = false;

        if((0 <= i && i < this.scacchiera.length) && (0 <= j && j < this.scacchiera[0].length))
        {
            if(this.scacchiera[i][j] == null)
            {
                if(p != null)
                {

                    this.scacchiera[i][j] = p;
                    posiziona = true;
                }
            }
        }

        return posiziona;
    }

    /* Restituisce true se il pezzo in posizione (i,j) è minacciato da un
    cavallo di colore c, false altrimenti. Un pezzo è minacciato da un cavallo
    se è di colore opposto a quello del cavallo e si trova in una delle celle
    su cui il cavallo può portarsi con una mossa. Se in posizione (i,j) non
    c'è un pezzo viene restituito false */
    public boolean minacciatoDaCavallo(int i, int j, char c)
    {
        boolean minacciato = false;

		int rigaCavallo = -1;
		int colonnaCavallo = -1;


		for (int k=0; k<scacchiera.length; k++)
        {
			for (int l=0; l<scacchiera[k].length; l++)
            {
				if (scacchiera[k][l]!=null && scacchiera[k][l].getTipo()=='C' && scacchiera[k][l].getColore()==c)
                {
					rigaCavallo = k;
					colonnaCavallo = l;
				}
				if (rigaCavallo != -1 && colonnaCavallo != -1)
                {
					if ((rigaCavallo==i-1 && colonnaCavallo==j-2) ||
                        (rigaCavallo==i-2 && colonnaCavallo==j-1) ||
                        (rigaCavallo==i-1 && colonnaCavallo==j+2) || 
                        (rigaCavallo==i-2 && colonnaCavallo==j+1) || 
                        (rigaCavallo==i+1 && colonnaCavallo==j+2) ||
                        (rigaCavallo==i+2 && colonnaCavallo==j+1) ||
                        (rigaCavallo==i+2 && colonnaCavallo==j-1) || 
                        (rigaCavallo==i+1 && colonnaCavallo==j-2))
						minacciato = true;
				}
			}
		}
		return minacciato;

    }

    /* Restituisce un array di pezzi che sono minacciati da almeno un cavallo
    di colore c. Se nessun pezzo è minacciato da un cavallo di colore c viene
    restituito un array di dimensione 0. */
    public Pezzo[] minacciatiDaCavalli(char c)
    {
        int dim = 0;
        for(int i = 0; i < this.scacchiera.length; i++)
        {
            for(int j = 0; j < this.scacchiera[0].length; j++)
            {
                if(scacchiera[i][j] != null && this.minacciatoDaCavallo(i, j, c))
                {
                    dim++;
                }
            }
        }

        Pezzo[] minacciati = new Pezzo[dim];
        int index = 0;
        for(int i = 0; i < this.scacchiera.length; i++)
        {
            for(int j = 0; j < this.scacchiera[0].length; j++)
            {
                if(this.scacchiera[i][j] != null && minacciatoDaCavallo(i, j, c))
                {
                    minacciati[index] = this.scacchiera[i][j];
                    index++;
                }
            }
        }
        
        return minacciati;
    }

    /* Restituisce una rappresentazione testuale della scacchiera. Per ogni
    cella occupata va indicato il tipo e il colore del pezzo che la occupa. */
    public String toString()
    {
		String s = "";
		for (int i=0; i<scacchiera.length; i++)
        {
			for (int j=0; j<scacchiera[i].length; j++)
            {
				if (scacchiera[i][j]!=null)
					s+=String.valueOf(scacchiera[i][j].getTipo())+String.valueOf(scacchiera[i][j].getColore())+" ";
				else s+="00 ";
			}
			s+="\n";
		}
		return s;
    }

}