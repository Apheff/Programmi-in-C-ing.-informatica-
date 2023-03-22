import fond.io.*;
import classi.*;

public class ProvaPoligonoRegolare
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        int numeroLati = in.readInt("Inserisci numero lati");
        double lunghezza = in.readDouble("Inserisci la lunghezza di ogni lato");

        /*  creazione un PoligonoRegolare con n lati di lunghezza l*/
        PoligonoRegolare poligono = new PoligonoRegolare(numeroLati, lunghezza);        

        /*  visualizza dati poligono creato  */
        out.writeln("****Dati poligono creato****\n");
        out.writeln("- Apotema :" + poligono.apotema());
        out.writeln("- Perimetro :" + poligono.perimetro());
        out.writeln("- area :" + poligono.area() + "\n\n");

        /*  cambio della lunghezza del poligono */
        lunghezza = in.readDouble("Cambia lunghezza lati");
        poligono.cambiaDimensione(lunghezza);

        /*  visualizza dati poligono modificato */
        out.writeln("****Dati poligono modificato****\n");
        out.writeln("- Apotema :" + poligono.apotema());
        out.writeln("- Perimetro :" + poligono.perimetro());
        out.writeln("- area :" + poligono.area());
    }
}
