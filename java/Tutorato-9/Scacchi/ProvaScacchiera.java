import fond.io.*;


public class ProvaScacchiera
{
	public static void main(String[] args)
	{

		// Step 1: Creazione e inserimento dei pezzi
		Scacchiera s = new Scacchiera();
		int pezziInseriti = 0;
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		char scelta = in.readChar("Vuoi inserire un pezzo nella scacchiera? (s=si')");
		while (scelta == 's' && pezziInseriti<65){
			
			// Check tipo del pezzo
			char tipo = in.readChar("Che tipo di pezzo vuoi inserire? (R, D, A, C, T, P)");
			while (tipo!='R' && tipo!='D' && tipo!='A' && tipo!='C' && tipo!='T' && tipo!='P')
				tipo = in.readChar("Valore non valido. Che tipo di pezzo vuoi inserire? (R, D, A, C, T, P)");
			
			// Check colore del pezzo
			char colore = in.readChar("Di che colore e' il pezzo? (B/N)");
			while (colore!='B' && colore!='N')
				colore = in.readChar("Colore non valido. Di che colore e' il pezzo? (B/N)");

			// Creazione del pezzo
			Pezzo p = new Pezzo(tipo,colore);
			int riga = in.readInt("Inserisci l'indice di riga dove posizionare il pezzo");
			int colonna = in.readInt("Inserisci l'indice di colonna dove posizionare il pezzo");

			// Posizionamento del pezzo
			if (s.posizionaPezzo(riga,colonna,p)){
				out.writeln("Pezzo inserito");
				pezziInseriti++;
			} else 	out.writeln("Pezzo NON inserito");
			scelta = in.readChar("Vuoi inserire un pezzo nella scacchiera? (s=si')");
		}
		out.writeln("\n"+s);

		// Step 2: Verifica del pezzo minacciato
		scelta = in.readChar("Vuoi verificare se un pezzo e' minacciato da un cavallo? (s=si')");
		while (scelta == 's')
        {
			int riga = in.readInt("Inserisci l'indice di riga del pezzo");
			int colonna = in.readInt("Inserisci l'indice di colonna del pezzo");
			if (s.posizionaPezzo(riga,colonna,null))
				out.writeln("Non c'e' nessun pezzo nella cella inserita");
			else 
            {
				char coloreCavallo = in.readChar("Di che colore e' il cavallo? (B/N)");
				while (coloreCavallo!='B' && coloreCavallo!='N')
					coloreCavallo = in.readChar("Colore non valido. Di che colore e' il cavallo? (B/N)");
				if (s.minacciatoDaCavallo(riga,colonna,coloreCavallo))
					out.writeln("Il pezzo e' minacciato dal cavallo");
				else out.writeln("Il pezzo NON e' minacciato dal cavallo");
			}
			scelta = in.readChar("Vuoi verificare se un pezzo e' minacciato da un cavallo? (s=si')");
		}
		char colore = in.readChar("Inserisci il colore di un cavallo (B/N)");
		while (colore!='B' && colore!='N')
			colore = in.readChar("Colore non valido. Inserisci un colore (B/N)");
		Pezzo[] minacciati = s.minacciatiDaCavalli(colore);
		out.writeln("\nPezzi minacciati da un cavallo "+String.valueOf(colore)+":");
		for (int i = 0; i < minacciati.length; i++)
        {
			System.out.println(minacciati.length+"");
			out.writeln(String.valueOf(minacciati[i].getTipo())+String.valueOf(minacciati[i].getColore()));
		}
	}
}