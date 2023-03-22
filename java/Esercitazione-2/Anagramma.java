import fond.io.*;


/*
    ESERCIZIO 6
    Scrivere un programma Java che fa inserire all’utente due stringhe s1 e s2 e 
    dice all’utente se s2 è un anagramma di s1. Si ricorda che s2 è l’anagramma di s1 se può 
    essere ottenuta permutando i caratteri di s1.
*/

public class Anagramma
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow(); 
        
        String s1 = in.readString("Inserisci la stringa s1:");
        String s2 = in.readString("Inserisci la stringa s2:");
        
        /*  controllare se due stringhe sono anagrammi  */

        boolean anagramma = true;

        for(int i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);
            int count1 = 0;       // conto i caratteri uguali della prima stringa 

            for(int j = 0; j < s1.length(); j++)
            {
                if(s1.charAt(j) == c)
                {
                    count1++;
                }
            }

            int count2 = 0;        // conto i caratteri uguali della seconda stringa 
            for(int j = 0; j < s2.length(); j++)
            {
                if(s2.charAt(j) == c)
                {
                    count2++;
                }
            }
            /* 
                vedo se il numero di caratteri c nella stringa s1 coincide con il numero dei
                caratteri c della stringa s2 
            */
            if(count1 != count2)
            {
                anagramma = false;
            }
        }

        /*  un semplice output per visualizzare la risposta  */
        if(anagramma)
        {
            out.writeln("- Le stringhe "+s1+" e "+s2+" sono anagrammi! :)");
        }
        else
        {
            out.writeln("- Le stringhe "+s1+" e "+s2+" *NON* sono anagrammi ... :(");
        }
    }    
}
