import classi.*;
import fond.io.*;

public class ProvaTartaglia
{
    public static void main(String[] args)
    {
		/*  inizializzazione  */
		InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

		/*  faccio inserire la dimensione all'utente e creo un oggetto*/
		int n = in.readInt("Inserisci un testo");
		Tartaglia T1 = new Tartaglia(n);

        /*  visualizza Tartaglia  */
        System.out.println(T1.toString());		// per un risultato ottimale uso il terminale di vscode
        out.writeln(T1.toString());
    }
}
