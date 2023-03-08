import fond.io.*;

public class EsNome
{
    public static void main (String[] args)
    {
        /*  Inizializzazione */

        InputWindow in = new InputWindow();
        
        /*  l'utente inserisci il suo nome  */
        
        
        String nome = in.readString("Inserisci il tuo nome");
        OutputWindow out = new OutputWindow();
        out.writeln("===========");
        out.writeln(nome);
        out.writeln("===========");
    }
}
