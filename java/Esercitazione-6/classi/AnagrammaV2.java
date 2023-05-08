package classi;
import java.util.*;


public class AnagrammaV2
{

	/* rimuove il carattere i-esimo dalla stringa s */
	private static String rimuovi(String s, int i)
	{
		String rimosso = s.substring(0, i);
		rimosso += s.substring(i+1);

		return rimosso;
	}

	/* restituisce una lista contenente tutti gli anagrammi della
	stringa s */
	public static List<String> anagrammi(String s)
	{
		List<String> seq = new ArrayList<String>();
		if(s.length() == 0)
		{
			seq.add(s);
		}
		else
		{
			for(int i = 0; i< s.length(); i++)
			{

				String s1 = rimuovi(s, i);
				List<String> seq1 = anagrammi(s1);
				char c = s.charAt(i);

				/*  creazione dell'iteratore per scorrere la lista  */
				Iterator<String> it = seq1.iterator();
				while(it.hasNext())
				{
					seq.add(c + it.next());
				}
			}

		}

		return seq;
	}
	/*  restituisce  soltanto  gli  anagrammi  di  s  che  sono
	parole  di  senso  compiuto  */
	public static List<String> anagrammiInDizionario(String s)
	{
		List<String> anagrammi = anagrammi(s);
		Dizionario d = new Dizionario();

		List<String> filtrati = new LinkedList<>();
		Iterator<String> it = anagrammi.iterator();

		while(it.hasNext())
		{
			String s1 = it.next();
			if(d.contains(s1))
			{
				filtrati.add(s1);
			}	
		}

		return filtrati;
	}
}