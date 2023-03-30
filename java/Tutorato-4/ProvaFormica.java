import classi.*;
import fond.io.*;

public class ProvaFormica 
{
    public static void main(String[] args)
    {
        /*  Inizializzazione */
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        /*
            Chiede  all’utente  la  dimensione  dello  spazio  occupato  dal 
            formicaio.
        */
        int dim = in.readInt("Inserisci la dimensione dello spazio");

        /* Crea il formicaio e lo stampa. */
        Formicaio F1 = new Formicaio(dim);
        out.write(F1.toString());

        /*
            Chiede ripetutamente all’utente se vuole aggiungere una formica 
            al formicaio. Finché l’utente risponde sì, il programma chiede 
            all’utente  gli  indici  della  posizione  in  cui  inserire  la 
            formica  e  aggiunge  una  formica.  Il  programma  comunica  se 
            l’aggiunta è andata a buon fine oppure no e stampa il formicaio. 
            Si possono aggiungere al più 9 formiche. 
        */
        int opzione = 1;
        do
        {
            System.out.println("-------Menu------");
            System.out.println("1- crea formica");
            System.out.println("2- muovi formica");
            System.out.println("3- esci");

            opzione = in.readInt("Scegli un'opzione del menu");
            switch (opzione) {
                case 1:
                    String creaFormica = "Y";

                    while(!(creaFormica.equals("n")))
                    {
                        int i = in.readInt("inserisci la coordinata i");
                        int j = in.readInt("inserisci la coordinata j");

                        if(F1.aggiungiFormica(i, j))
                            System.out.println("- Formica "+Formica.getLastId()+" e' stata creata correttamente!");
                        else
                            System.out.println("- Formica *NON* creata correttamente...");

                        out.writeln(F1.toString());
                        creaFormica = in.readString("Vuoi inserire una nuova formica? (Y/n)");
                    }
                    out.writeln(F1.toString());
                    break;
                case 2:
                    String muoviFormica = "Y";

                    while(!(muoviFormica.equals("n")))
                    {
                        int direzione = in.readInt("Inserisci la direzione: (1=NORD, 2=OVEST, 3=SUD, 4=EST)");
                        int id = in.readInt("Inserisci l'id della formica");

                        if(F1.muoviFormica(direzione, id))
                            System.out.println("- Formica mossa correttamente!");
                        else
                            System.out.println("- Formica *NON* mossa correttamente...");

                        out.writeln(F1.toString());
                        muoviFormica = in.readString("Vuoi muovere una formica? (Y/n)");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("*******ERRORE 404*******");
                    break;
            }
        }while(opzione != 3 && Formica.getLastId() < 10);
    }
}
