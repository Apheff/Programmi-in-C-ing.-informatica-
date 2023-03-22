import fond.io.*;

/*
    ESERCIZIO 7
    Scrivere  un  programma  Java  che  fa  inserire all’utente una stringa s  e  dice 
    all’utente il numero di parole da cui è costituita la stringa s. Per semplicità si assume che 
    l’unico separatore di parole sia il carattere spazio. Pertanto, due parole sono separate da 
    uno o più spazi. 
*/

public class ContaParole
{
    public static void main(String[] args)
    {
        /*  inizializzazione  */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        String s = in.readString("- Inserisci una stringa");

        /*  conto delle parole  */
        int count = 0;
        for(int i = 0; i < s.length()-1; i++)
        {
            if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
            {
                count++;
            }            
        }
        if(s.charAt(s.length()-1) != ' ')
        {
            count++;
        }
        out.writeln("- numero parole: " + count);
    }    
}
