import fond.io.*;
import classi.Punto;
import classi.Retta;

public class EsercizioTriangolo
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

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Punto p3 = new Punto(x3, y3);   
        
        /*  calcolo dell'ortocentro  */

        Retta R12 = new Retta(p1, p2);
        Retta R23 = new Retta(p2, p3);
        Retta Altezza12 = R12.perpendicolare(p3);
        Retta Altezza23 = R23.perpendicolare(p1);
        Punto intersezione = Altezza12.intersezione(Altezza23);
        out.writeln("- ortocentro: ( "+intersezione.coordX()+", "+intersezione.coordY()+" )");

        /*  calcolo del baricentro  */

        Punto medio12 = Punto.puntoMedio(p1, p2);
        Punto medio23 = Punto.puntoMedio(p2, p3);        
        Retta Mediana12 = new Retta(p3, medio12);
        Retta Mediana23 = new Retta(p1, medio23);
        intersezione = Mediana12.intersezione(Mediana23);
        out.writeln("- baricentro : ( "+intersezione.coordX()+", "+intersezione.coordY()+" )");

        /*  calcolo del circocentro */

        Retta perpendicolare12 = R12.perpendicolare(medio12);
        Retta perpendicolare23 = R23.perpendicolare(medio23);
        intersezione = perpendicolare12.intersezione(perpendicolare23);
        out.writeln("- circocentro : ( "+intersezione.coordX()+", "+intersezione.coordY()+" )");    
    }       
}
