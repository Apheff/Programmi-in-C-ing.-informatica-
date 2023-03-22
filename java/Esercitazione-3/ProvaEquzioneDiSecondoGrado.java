import classi.*;
import fond.io.*;

public class ProvaEquzioneDiSecondoGrado
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        double a = in.readDouble("Inserisci il valore a");
        double b = in.readDouble("Inserisci il valore b");
        double c = in.readDouble("Inserisci il valore c");

        /*  creazione di un equazione di secondo grado con coefficienti a, b e c  */
        EquazioneDiSecondoGrado equa = new EquazioneDiSecondoGrado(a, b, c);

        /*  creazione delle due radici  */
        Complesso rad1 = equa.primaRadice();
        Complesso rad2 = equa.secondaRadice();

        /*  visualizza le due radici dell'equazione di secondo grado */
        out.writeln("- La prima radice: " + rad1.toString());
        out.writeln("- La seconda radice: " + rad2.toString());   
    }    
}
