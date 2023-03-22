import classi.*;
import fond.io.*;

public class ProvaDistributore
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        /*  fisso il prezzo del carburante a 1.369 $  */
        double prezzo = 1.369;
        Distributore.setPrezzo(prezzo);

        String nomeGestore = in.readString("- Nome del gestore");
        String cognomeGestore = in.readString("- Cognome del gestore");
        String indirizzo = in.readString("- Indirizzo del gestore");
        double scorta = in.readDouble("- Inserisci la scorta");

        /*  creazione di un ditributore con tutte i valori richiesti sopra  */
        Distributore distributore = new Distributore(nomeGestore, cognomeGestore, indirizzo, scorta);


        /*  Visualizza all’utente una descrizione completa del distributore creato  */
        out.writeln(distributore.toString() + "\n\n\n");
        
        /*  Visualizza all’utente la somma da pagare per il rifornimento effettuato. */
        double litri = in.readDouble("Quanti litri vuoi rifornire?");
        out.writeln("- La somma da pagare e' di " + distributore.rifornisci(litri) + " $ !!\n\n\n");

        /*  visualizza distributore  */
        out.writeln(distributore.toString() + "\n");

        /*  ricarica scorta  */
        litri = in.readDouble("Quanti litri vuoi aggiungere alla scorta?");
        distributore.ricaricaScorta(litri);

        /* Visualizza all’utente una descrizione completa del distributore modificato  */
        out.writeln(distributore.toString() + "\n\n\n");
    }    
}
