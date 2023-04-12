import classi.*;
import fond.io.*;


public class EsercizioParallelogramma
{
    public static void main(String[] args)
    {
        /*  creao le variabili per i punto p1, p2 e p3  */
        
        double x1, x2, x3;
        double y1, y2, y3;
    
        /*  inizializzo la finestra di entrata e di uscita  */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
    
        /*  insersco il valore delle coordinate dei punti  */

        x1 = in.readDouble("Inserisci la x1");
        y1 = in.readDouble("Inserisci la y1");
        x2 = in.readDouble("Inserisci la x2");
        y2 = in.readDouble("Inserisci la y2");
        x3 = in.readDouble("Inserisci la x3");
        y3 = in.readDouble("Inserisci la y3");

        /*  creo dei oggetti punto tramite le classi date  */

        PuntoV2 p1 = new PuntoV2(x1, y1);
        PuntoV2 p2 = new PuntoV2(x2, y2);
        PuntoV2 p3 = new PuntoV2(x3, y3);
        Retta r1 = new Retta(p1, p2);
        Retta r2 = new Retta(p1, p3);
        Retta r3 = r1.parallela(p3);
        Retta r4 = r2.parallela(p2);
        PuntoV2 p4 = r4.intersezione(r3);

        /*  le coordinate x e y del punto p4  */

        double x4 = p4.coordX();
        double y4 = p4.coordY();
        out.write("x4 = ");
        out.writeln(x4);
        out.write("y4 = ");
        out.writeln(y4);
    }
}
