import classi.*;
import fond.io.*;

public class ProvaManipolatoreImg 
{
    public static void main(String[] args)
    {
        /*  Inizializzazione  */
        InputWindow in = new InputWindow();

        String file = in.readString("inserisci nome del file");
        ManipolatoreDiImmagine m = new ManipolatoreDiImmagine(file);
        
        
        
        System.out.println("***********MENU**********");
        System.out.println("1- foto in negativo");
        System.out.println("2- cambio colore");
        System.out.println("3- riflessione");
        System.out.println("4- taglio");
        System.out.println("5- bianco e nero");
        
        int opzione = in.readInt("scegli un opzione:");
        
        switch(opzione)
        {
            case 1:         // caso inversione di colore
                Negativo n = new Negativo();
                m.aggiungiTrasformazione(n);
                break;
            case 2:         // caso cambio di colore
                int r1 = in.readInt("inserisci r1");
                int g1 = in.readInt("inserisci g1");
                int b1 = in.readInt("inserisci b1");
                int r2 = in.readInt("inserisci r1");
                int g2 = in.readInt("inserisci g1");
                int b2 = in.readInt("inserisci b1");
                Colore c1 = new Colore(r1, g1, b1);
                Colore c2 = new Colore(r2, g2, b2);
                CambioColore cc = new CambioColore(c1, c2);
                m.aggiungiTrasformazione(cc);
                break;
            case 3:         // caso riflessione
                Riflessione ri = new Riflessione();
                m.aggiungiTrasformazione(ri);
                break;
            case 4:         // taglio
                int i1 = in.readInt("inserisci i1");
                int j1 = in.readInt("inserisci j1");
                int i2 = in.readInt("inserisci i2");
                int j2 = in.readInt("inserisci j2");
                Taglio t = new Taglio(i1, j1, i2, j2);
                m.aggiungiTrasformazione(t);
                break;
            case 5:         // bianco e nero
                BiancoENero bn = new BiancoENero();
                m.aggiungiTrasformazione(bn);
                break;
        }

        /*  applazione delle trasformazioni e scrivere sul file  */
        m.trasforma();
        m.scriviSuFile("./Esercitazione-5/"+in.readString("inserisci nuovo nome file"));
        System.out.println("file completato!");
    }
    
}