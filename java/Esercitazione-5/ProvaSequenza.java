import fond.io.*;
import classi.*;

public class ProvaSequenza 
{
    public static void main(String[] args)
    {
        /* inizializzazione */
        OutputWindow out = new OutputWindow();


        Sequenza S1 = new Sequenza(1);

        /* prova veloce */
        String s = "Hello world!";
        String k = "Helloworld!";

        if(S1.inserisci(s))
            out.writeln("oggetto inserito!");
        else
            out.writeln("oggetto *NON* inserito...");

        if(S1.contiene(k) != -1)
            out.writeln("contiene!");
        else
            out.writeln("NON contiene!");
    }    
}
