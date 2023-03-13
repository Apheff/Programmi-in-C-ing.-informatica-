import fond.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


/*
    Scrivere un programma Java che fa inserire all’utente una stringa che
    rappresenta la sua data di nascita nel formato gg/mm/aaaa (ad. es 02/09/1997), una
    seconda stringa che rappresenta la data odierna nello stesso formato, e calcola l’età
    dell’utente. Si può assumere che il formato delle stringhe sia corretto.


    *Nota: per estrarre l’anno si consiglia di utilizzare il metodo substring della classe String e
    per convertire a int il metodo parseInt della classe Integer.*
*/


public class Esercizio2
{
    public static void main(String[] args)
    {
        /*  inizializzazione  */

        InputWindow in = new InputWindow();
        String Nascita = in.readString("Inserisci la data di nascita in questo formato (gg/MM/aaaa)");

        String DataOggi = ZonedDateTime.now(ZoneId.of("Europe/Rome")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        /*  split il fomato gg/MM/aaaa dell'anno di nascita  */

        String[] DataNascita = Nascita.split("/");
        String AnnoNascita = DataNascita[2];

        /*  split il fomato gg/MM/aaaa della data di oggi */

        String[] Oggi = DataOggi.split("/");
        String AnnoOggi = Oggi[2];

        int anno1 = Integer.parseInt(AnnoNascita);
        int anno2 = Integer.parseInt(AnnoOggi);

        System.out.println("- Hai "+(anno2-anno1)+" anni!");
    }
}
