import fond.io.*;
import classi.*;

public class ProvaDisco
{
    public static void main(String[] args)
    {
        /*  Inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        /*
            Crea un oggetto Disco facendo impostare all’utente l’autore, 
            il titolo e il proprietario.
        */

        String autore = in.readString("Inserisci autore");
        String titolo = in.readString("Inserisci titolo");
        String proprietario = in.readString("Inserisci proprietario");

        Disco D1 = new Disco(autore, titolo, proprietario);

        /*
            Visualizza  all’utente  una  descrizione  completa  del  disco 
            creato. 
        */
        out.write(D1.toString());

        autore = in.readString("Inserisci un altro autore");
        titolo = in.readString("Inserisci un altro titolo");

        /*
            Crea  un  altro  oggetto  Disco  facendo  impostare  all’utente 
            soltanto l’autore e il titolo.
        */
        Disco D2 = new Disco(autore, titolo);

        /* Chiede  all’utente  il  proprietario  del  secondo  disco  e  lo imposta.*/
        proprietario = in.readString("Inserisci un altro proprietario");
        D2.setProprietario(proprietario);

        /* Visualizza  all’utente  una  descrizione  completa  del  secondo disco. */
        out.write(D2.toString());


        /*  Visualizza un messaggio che dice se i due dischi sono dello 
        stesso autore oppure no.*/
        if(D1.getAutore().equals(D2.getAutore()))
        {
            out.writeln("- I due dischi hanno lo stesso autore!!");
        }
        else
        {
            out.writeln("- I due dischi *NON* hanno lo stesso autore!!");
        }
    }
}
