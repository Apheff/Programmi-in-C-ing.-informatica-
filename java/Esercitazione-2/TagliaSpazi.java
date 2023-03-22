import fond.io.*;

/*
    ESERCIZIO 8
    Scrivere un programma Java che fa inserire all’utente una stringa s e crea una 
    nuova stringa s1 ottenuta da s eliminando gli spazi all’inizio e alla fine. Gli spazi intermedi 
    non vengono invece eliminati.     
*/

public class TagliaSpazi {
    public static void main(String[] args) {
        /* inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        String s = in.readString("Inserisci una stringa");

        /* conta spazi a sinistra */
        int i = 0;
        while (s.charAt(i) == ' ') {
            i++;
        }
        /* conta spazi a destra */
        int j = s.length() - 1;
        while (s.charAt(j) == ' ') {
            j--;
        }

        /* creazione della stringa TagliaSpazi */
        String senzaSpazi = s.substring(i, j + 1);

        /* output */
        out.writeln("s:|" + s + "|");
        out.writeln("s1:|" + senzaSpazi + "|");

    }
}
