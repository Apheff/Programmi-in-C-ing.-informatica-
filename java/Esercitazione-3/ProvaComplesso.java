import classi.*;
import fond.io.*;


public class ProvaComplesso
{
    public static void main(String[] args)
    {
        /*  inizializzazione */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();


        double re1 = in.readDouble("inserisci la parte reale di C1");
        double im1 = in.readDouble("inserisci la parte immaginaria di C1");
        double re2 = in.readDouble("inserisci la parte reale di C2");
        double im2 = in.readDouble("inserisci la parte immaginaria di C2");

        /*  creazione dei due numeri complessi */
        Complesso C1 = new Complesso(re1, im1);
        Complesso C2 = new Complesso(re2, im2);

        /*  visualizza C1  */
        out.writeln("***** C1 *****");
        out.writeln("- C1 : " + C1.toString());
        out.writeln("- Coniugato : " + C1.coniugato().toString());
        out.writeln("- Modulo : " + C1.modulo() + "\n");
        
        /*  visualizza C2  */
        out.writeln("***** C2 *****");
        out.writeln("- C2 : " + C2.toString());
        out.writeln("- Coniugato : " + C2.coniugato().toString());
        out.writeln("- Modulo : " + C2.modulo() + "\n");

        /*  visualizza somma e prodotto tra C1 e C2  */
        out.writeln("- Somma C1+C2 : "+C1.somma(C2));
        out.writeln("- Prodotto C1*C2 : "+C1.prodotto(C2));        
    }
}