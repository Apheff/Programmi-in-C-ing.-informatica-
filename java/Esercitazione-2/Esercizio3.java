import fond.io.*;

/*
    Scrivere un programma Java che fa inserire all’utente una stringa di cifre binarie
    e che visualizza il numero naturale corrispondente, in base alla rappresentazione
    posizionale. Ad esempio, se l’utente inserisse la stringa “0101”, il programma dovrebbe
    restituire il numero 5, come risultato della somma: 
    
     **   0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0   **
.
*/

public class Esercizio3
{
    public static void main (String[] args)
    {
        /*  inizializzazione  */

        InputWindow in = new InputWindow();

        String binario = in.readString("Inserisci un numero binario");

        /* creazione di variabili essenziali */
        double decimale = 0;
        int n = binario.length();

        for(int i = 0; i < n ; i++)
        {
            if(binario.charAt(i) == '1')    // effettua il calcolo solo se il carattere '1', '0' sara' ignorato
            {
                decimale += Math.pow(2, n-i-1); // calcolo del valore decimale del codice binario
            }
        }

        /*  output  */

        System.out.println("Il numero in decimale e': " + (int)decimale);

    }
}   
