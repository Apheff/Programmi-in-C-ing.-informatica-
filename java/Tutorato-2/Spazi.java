import fond.io.*;

/*
    Esercizio 1.

    Scrivere un programma Java chiamato Spazi che chiede all’utente di
    inserire una stringa e stampa il numero di spazi che sono seguiti
    da una vocale. Per esempio, se si immette “Ciao, imparo a
    programmare in Java!” il programma deve stampa 3.

*/

public class Spazi
{
    public static void main (String[] args)
    {
        /*  inizializzazione  */
        
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        String s = in.readString("Scrivi una frase");

        int count = 0;

        s.toLowerCase();

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) == ' ') && 
            ((s.charAt(i+1) == 'a') ||
             (s.charAt(i+1) == 'e') ||
             (s.charAt(i+1) == 'i') ||
             (s.charAt(i+1) == 'o') || 
             (s.charAt(i+1) == 'u') ))
            {
                count++;
            }
        }

        /*  output  */

        out.writeln("- Il numero di spazi che sono seguiti da una vocale sono " + count +".");
    }
}   
