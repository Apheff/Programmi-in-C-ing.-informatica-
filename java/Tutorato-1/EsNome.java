import fond.io.*;

/* 
    ESERCIZIO 1
    Scrivere  una  classe  di  nome  Nome,  avente  soltanto  il metodo  speciale  main,
    che  deve  svolgere  le  seguenti azioni: 
    •Fa inserire all’utente il proprio nome 
    •Visualizza all’utente il suo nome come nell’esempio 
    seguente: 
    ========== 
    Mario 
    ==========
*/
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
