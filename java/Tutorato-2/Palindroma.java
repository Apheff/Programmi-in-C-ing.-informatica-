import fond.io.*;

/*
    ESERCIZIO 2 
    Scrivere un programma Java chiamato Palindroma che fa inserire 
    all’utente una stringa priva di spazi e stampa true se la stringa 
    inserita è palindroma, false altrimenti. Esempi di alcune 
    stringahe palindrome sono "anna", “ottetto”, 
    "itopinonavevanonipoti".
*/

public class Palindroma
{
    public static void main(String[] args)
    {
        /*  inizializzazione  */
        InputWindow in = new InputWindow();
        String s = in.readString("Inserisci una stringa");

        boolean palindroma = true;

        for(int i = 0, j = s.length()-1 ; i < j && palindroma ; i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                palindroma = false;
            }
        }

        /*  output  */

        OutputWindow out = new OutputWindow();
        
        if(palindroma)
        {
            out.writeln("- La stringa inserita e' palindroma! :)");
        }
        else
        {
            out.writeln("- La stringa inserita *NON* e' palindroma! :(");
        }
    }
}
