import fond.io.*;

/*
    Il cifrario di Cesare è un algoritmo di cifratura del testo, in cui ogni lettera del
    testo originale è sostituita, nel testo cifrato, dalla lettera che si trova tre posizioni dopo
    nell'alfabeto. Scrivere un programma Java che legge ripetutamente dall’utente una stringa
    e mostra all’utente una versione cifrata della stringa. L’inserimento termina quando l’utente
    inserisce la stringa “FINE”. 
*/

public class Esercizio5
{
    public static void main (String[] args)
    {
        /*  inizializzazione  */
        InputWindow in = new InputWindow();


        String s = "";

        s = in.readString("Inserisci una parola (FINE per chiudere il programma):");

        while(!s.equals("FINE"))
        {
            String cifrato = "";
            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                c += 3;
                if(c > 'z')
                    c -= 26; 
                cifrato += c;
            }
            System.out.println(cifrato);
            s = in.readString("Inserisci una parola (FINE per chiudere il programma):");
        }
    }
}
