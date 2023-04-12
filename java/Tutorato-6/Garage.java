import fond.io.*;
import classi.*;

public class Garage
{
    public static void main(String[] args)
    {
        /*  Inizializzazione  */
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        /*  creazione di un array "garage" di 50 veicoli  */
        Veicolo[] garage = new Veicolo[50];
        String garaString = "GARAGE:\n";


        /*  creazione dell'interfaccia per l'utente  */
        int opzione = 0;
        for(int i = 0;opzione != 4 && i <= 50; i++)
        {
            /*  menu  */
            out.writeln("---Sono rimasti "+(50-i)+" posti---\n");
            out.writeln("******Menu********");
            out.writeln("1- veicolo");
            out.writeln("2- automobile");
            out.writeln("3- furgone");
            out.writeln("4- esci\n");

            /* viene scelta un'opzione */
            opzione = in.readInt("scegli un'opzione");
            switch(opzione)
            {
                /*  1- VEICOLO  */
                case 1:
                    String targa = in.readString("Inserisci la targa");
                    String modello = in.readString("Inserisci il modello");
                    int numeroPosti = in.readInt("Inserisci il numero dei posti");
                    garage[i] = new Veicolo(targa, modello, numeroPosti);
                    garaString += ((i+1) +") Veicolo. "+ garage[i].toString() + "\n");
                    break;
                /*  2- AUTOMOBILE  */
                case 2:
                    targa = in.readString("Inserisci la targa");
                    modello = in.readString("Inserisci il modello");
                    numeroPosti = in.readInt("Inserisci il numero dei posti");
                    int numeroPorte = in.readInt("Inserisci numero porte");
                    garage[i] = new Automobile(targa, modello, numeroPosti, numeroPorte);
                    garaString += ((i+1) +") Automobile. "+ garage[i].toString() + "\n");
                    break;
                /*  3- FURGONE  */
                case 3:
                    targa = in.readString("Inserisci la targa");
                    modello = in.readString("Inserisci il modello");
                    numeroPosti = in.readInt("Inserisci il numero dei posti");
                    double capacitaMassima = in.readDouble("Inserisci la capacita' massima");
                    garage[i] = new Furgone(targa, modello, numeroPosti, capacitaMassima);
                    garaString += ((i+1) +") Furgone. "+ garage[i].toString() + "\n");
                    break;
                /*  4- ESCI  */
                case 4:
                    break;
                /*  scelta diversa da quelle suggerite  */
                default:
                    System.out.println("**********************ERRORE 404***********************");
                    break;
            }
        }
        /*  resituisce il garage sottoforma di stringa  */
        out.writeln(garaString);
    }    
}
