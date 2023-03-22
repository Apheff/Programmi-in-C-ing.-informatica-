import classi.*;
import fond.io.*;

public class ProvaCirconferenza
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        double a1, b1, c1;
        double a2, b2, c2;

        a1 = in.readDouble("a1");
        b1 = in.readDouble("b1");
        c1 = in.readDouble("c1");
        a2 = in.readDouble("a2");
        b2 = in.readDouble("b2");
        c2 = in.readDouble("c2");

        Circonferenza cir1 = new Circonferenza(a1, b1, c1);
        Circonferenza cir2 = new Circonferenza(a2, b2, c2);

        /*  output  */
        out.writeln("Centro 1 : (" + cir1.centro().coordX() + ", " + cir1.centro().coordY() + " )");
        out.writeln("Raggio 1 : " + cir1.raggio() + "\n\n");
        out.writeln("Centro 2 : (" + cir2.centro().coordX() + ", " + cir2.centro().coordY() + " )");
        out.writeln("Raggio 2 : " + cir2.raggio()+ "\n\n");

        if(cir2.contiene(cir1))
        {
            out.writeln("- il cerchio C1 e' contanuta nel cerchio C2");
        }
        else
        {
            out.writeln("- il cerchio C1 *NON* e' contanuta nel cerchio C2");
        }

    }
}
