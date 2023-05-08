import fond.io.*;

public class PotenzaDiX
{
    public static boolean potenzaDue(int n, int x)
    {
        if(n == 0)
        {
            return false;
        }
        else if(n == 1)
        {
            return true;
        }
        else if(n % x != 0)
        {
            return false;
        }

        return potenzaDue(n/x, x);
    }  

    public static void main(String[] args)
    {
        /*  inizializzazione  */
        InputWindow in = new InputWindow();

        /*  input utente  */
        int x = in.readInt("Inserisci la potenza");
        int n = in.readInt("Inserisci il numero da testare");

        /*  output  */
        System.out.print("il numero " + n + " e' una potenza di " + x + "? \n");
        System.out.println(potenzaDue(n, x));
    } 
    
}
