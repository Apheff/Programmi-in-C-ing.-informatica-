import fond.io.*;
import classi.*;

public class ProvaSequenzaDiParole
{
	public static void main (String[] args)
	{
		/*  inizializzazione  */
		OutputWindow out = new OutputWindow();
		InputWindow in = new InputWindow();

		/*  faccio inserire un testo all'utente e creo un oggetto*/
		String testo = in.readString("Inserisci un testo");
		SequenzaDiParole sequenza = new SequenzaDiParole(testo);

		out.writeln("Sequenza letta:\n"+sequenza);

		String s = in.readString("Dimmi la stringa da cercare");
		SequenzaDiParole filtrata = sequenza.paroleCheContengono(s);

		out.writeln("\nParole che contengono "+s+":\n"+filtrata);
	}
}