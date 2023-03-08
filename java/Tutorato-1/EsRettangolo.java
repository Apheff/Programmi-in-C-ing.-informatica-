import fond.io.*;
import classi.*;

public class EsRettangolo
{
    public static void main (String[] args)
    {
        /* inizializzazione */

        InputWindow in = new InputWindow();

        int B = in.readInt("Inserisci la base del rattangolo: ");
        int H = in.readInt("Inserisci l'altezza del rattangolo: ");
        
        int X = in.readInt("Inserisci l'ascissa (x) del vertice: ");
        int Y = in.readInt("Inserisci l'ordinata (y) del vertice: ");

        Rettangolo r = new Rettangolo(B, H, X, Y);

        /*  primo output  */
        System.out.println(r.toString());
        System.out.println("- L'area del rettangolo e' : " + r.getArea() + ".");
        System.out.println("- Il perimetro del rettangolo e' : " + r.getPerimetro() + ".");

        /*  traslazione  */

        int trX = in.readInt("Inserisci quanto vuoi traslare il rettangolo per x: ");
        int trY = in.readInt("Inserisci quanto vuoi traslare il rettangolo per y: ");
        r.traslazione(trX, trY);

        /*  secondo output  */

        System.out.println(r.toString());
    }
}