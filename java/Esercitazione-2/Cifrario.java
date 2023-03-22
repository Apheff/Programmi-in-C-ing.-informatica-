import fond.io.*;

/*
    ESERICIZIO 5
    Il cifrario di Cesare è un algoritmo di cifratura del testo, in cui ogni lettera del
    testo originale è sostituita, nel testo cifrato, dalla lettera che si trova tre posizioni dopo
    nell'alfabeto. Scrivere un programma Java che legge ripetutamente dall’utente una stringa
    e mostra all’utente una versione cifrata della stringa. L’inserimento termina quando l’utente
    inserisce la stringa “FINE”. 
*/

public class Cifrario
{
    public static void main (String[] args)
    {
        /*  inizializzazione  */
        InputWindow in = new InputWindow();


        String s = "";

        s = in.readString("Inserisci una parola (FINE per chiudere il programma):");

        while(!s.equals("FINE"))
        {
            s.toLowerCase();

            String cifrato = "";            // creo una stringa cicr
            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);   //viene creato un carattere = al carattere della stringa nella posizione i-esima
                c += 3;
                if(c > 'z')             // se il carattere e' maggiore di 'z' allora l'alfabeto rinizia da 'a'
                {   
                    c -= 26;            
                }
                cifrato += c;           // il carattere viene inserito sulla nuova Stringa "cifrato"
            }

            /* output e rinizio ciclo while */

            System.out.println(cifrato);
            s = in.readString("Inserisci una parola (FINE per chiudere il programma):");
        }
    }
}
