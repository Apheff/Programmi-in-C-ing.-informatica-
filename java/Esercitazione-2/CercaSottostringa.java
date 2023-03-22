import fond.io.*;

/*
    ESERCIZIO 4
    Scrivere un programma Java che fa inserire all’utente una stringa s1 ed una
    seconda stringa s2 e dice all’utente se la stringa s2 compare come sottostringa nella stringa
    s1.
*/

public class CercaSottostringa
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow(); 
        
        String s1 = in.readString("Inserisci la prima stringa");
        String s2 = in.readString("Inserisci la seconda stringa");

        /* visualizza se la stringa s2 e' contentua su s1  */
        if(s1.indexOf(s2)>-1){
            out.writeln("- La stringa "+ s2 +" è contenuta nella stringa "+ s1 +".");
        }else{
            out.writeln("- La stringa "+ s2 +" *NON* è contenuta nella stringa "+ s1 +".");
        }
    }    
}