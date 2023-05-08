import fond.io.*;
import java.util.*;
import classi.*;

public class TestAnagramma
{
    public static void main(String[] args)
    {
        /*  inizializzazione e crazione dell'oggetto Anagramma */
        InputWindow in = new InputWindow();

        /*  chiedo all'utente di inserire una parola  */
        String s = in.readString("Inserisci una parola!");

        /*  creazione della lista dei anagrammi  */
        List<String> seq = AnagrammaV2.anagrammiInDizionario(s);

        /*  output tramite l'iteratore*/
        String anagramma = "--------------ANAGRAMMI-----------------\n";
        Iterator<String> it = seq.iterator();
        while(it.hasNext())
        {
            String e = it.next();
            anagramma += e + "\n";
        }
        System.out.println(anagramma);
    }
}
