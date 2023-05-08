import fond.io.*;

public class PotenzaDiDue
{
    public static boolean potenzaDue(int n)
    {
        if(n == 0)
        {
            return false;
        }
        else if(n == 1)
        {
            return true;
        }
        else if(n % 2 != 0)
        {
            return false;
        }

        return potenzaDue(n/2);
    }    


    public static void main(String[] args)
    {
        /*  inizializzazione  */
        InputWindow in = new InputWindow();

        /*  input utente  */
        int n = in.readInt("Inserisci un numero");

        /*  output  */
        System.out.print("il numero " + n + " e' una potenza di 2? \n");
        System.out.println(potenzaDue(n));
    } 
}
