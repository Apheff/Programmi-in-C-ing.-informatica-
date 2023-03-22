package classi;

public class Formica
{
    private int posX, posY;
    private static int lunghezza;
    
    /* costruttore: permette di creare una formica specificando la sua 
    posizione */ 
    public Formica (int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    
    /* metodo statico: imposta la lunghezza del passo di una formica */ 
    public static void setPasso (int passo) 
    {
        lunghezza = passo;
    }
    /* muove la formica in una direzione: 1=NORD, 2=OVEST, 3=SUD, 4=EST 
    */ 
    public void muoviUnPasso (int direzione)
    {
        switch (direzione)
        {
            case 1:
                posY += lunghezza;
                break;
            case 2:
                posX -= lunghezza;
                break;
            case 3:
                posY -= lunghezza;
                break;
            case 4:
                posX += lunghezza;
                break;
            default:
                break;
        }
    }
    
    /* stampa lo spazio dove si muove la formica: una matrice quadrata 
    di  dimensione  dim,  con  una  ‘x’  in  corrispondenza  della  posizione 
    della formica ed una ‘o’ nelle caselle vuote */ 
    public String stampaSpazio (int dim)
    {
        String s = "";

        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                if(i == this.posY-1 && j == this.posX-1 )
                {
                    s += "x ";
                }
                else
                {
                    s += "o ";
                }
            }
            s += '\n';  
        }
        s+='\n';
        return s;
    }
}
