import fond.io.*;

/*
    ESERCIZIO 1
    Scrivere un programma Java che fa inserire all’utente una Stringa s e mostra
    all’utente quante sono le lettere maiuscole o minuscole presenti nella stringa s e quante di
    esse sono vocali.
    
    *Nota: la stringa può contenere caratteri che non sono lettere.*
*/

public class LettereVocali
{
    public static void main(String[] args)
    {
        /*  inizializzazione  */

        InputWindow in = new InputWindow();
        String s = in.readString("Inserisci una parola");

        /*  trsformo la stringa in una stringa di lettere minusole  */
        String parola = s.toLowerCase();


        /*  creo le variabili per contare le lettere e le vocali */
        int lettere = 0;
        int vocali = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(parola.charAt(i) >= 'a' && parola.charAt(i) <= 'z')      // controllo se il carattere e' una lettera (compresa tra a e z)
            {
                lettere++;
                if(parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u')
                {
                    vocali++;           // vedo quante vocali ha la stringa
                }
            }
        }

        /*  output  */
        OutputWindow out = new OutputWindow();
        out.writeln("- Nella parola " + parola + " ci sono " + lettere + " lettere.");
        out.writeln("- Le vocali sono: " + vocali);
    }
}
