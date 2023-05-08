import classi.*;
import fond.io.*;

public class ProvaTartaglia
{
    public static void main(String[] args)
    {
		/*  inizializzazione  */
		InputWindow in = new InputWindow();

		/*  faccio inserire la dimensione all'utente e creo un oggetto*/
		int n = in.readInt("Inserisci un numero");
		Tartaglia T1 = new Tartaglia(n);

        /*  visualizza Tartaglia  */
        System.out.println(T1.toString());		// per un risultato ottimale uso il terminale di vscode
    }
}
