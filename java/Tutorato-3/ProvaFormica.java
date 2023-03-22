import fond.io.*;
import classi.*;

public class ProvaFormica
{
    public static void main(String[] args)
    {
        /*  Inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        /*
            Chiede all’utente la dimensione dello spazio in cui si muove 
            la formica.
        */

        int dim = in.readInt("Inserisci la dimensione dello spazio");

        /*
            Chiede all’utente le coordinate della posizione della formica.
        */
        int posX = in.readInt("Inserisci la posizione x della formica");
        int posY = in.readInt("Inserisci la posizione x della formica");

        /*
            Creazione una formica con le coordinate specificate.
        */
        Formica F1 = new Formica(posX, posY);

        /*
            Stampa lo spazio in cui si trova la formica.
        */
        out.writeln(F1.stampaSpazio(dim));

        /*
            Chiede di inserire la lunghezza del passo e imposta la lunghezza.
        */
        int passo = in.readInt("Inserisci lunghezza del passo");
        Formica.setPasso(passo);
        

        /*
            Chiede ripetutamente all’utente se vuole far muovere la formica 
            (s=sì,  n=no),  finché  l’utente  non  risponde  no.  Se  l’utente 
            inserisce  un  valore  non  valido,  il  programma  deve  di  nuovo 
            mostrare il messaggio.
        */
        char opzione = 's';
        while(opzione != 'n')  // il ciclo si stoppa con opzione = 'n'
        {

            opzione = in.readChar("inserisci (s=sì, n=no) per scegliere di muovere la formica");
            
            if(opzione == 's')
            {

                int direzione = -1;         // inizializzo direzione uguale a -1 per entrare dentro al while almeno una volta 

                while(!(direzione<= 4 && direzione >= 1))
                {
                    direzione = in.readInt("Scegli direzione (1=NORD, 2=OVEST, 3=SUD, 4=EST)");
                    if(direzione<= 4 && direzione >= 1)
                    {
                        F1.muoviUnPasso(direzione);
                    }
                }

                out.writeln(F1.stampaSpazio(dim));  // stampo la matrice di stringhe creata
            }
        }
    }    
}
