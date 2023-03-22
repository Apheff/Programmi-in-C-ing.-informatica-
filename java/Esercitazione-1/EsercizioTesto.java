import classi.*;
import fond.io.*;

public class EsercizioTesto
{
	public static void main(String[] args)
    {
        /*  inizializzazione  */
		OutputWindow out=new OutputWindow();

        /*  lettura del file testo1.txt  */
        ScrittoreFile file = new ScrittoreFile("testo1.txt");
        Testo Hello = new Testo("Hello World!!");
        file.scriviFile(Hello);

        /*  lettura del file testo1.txt  */
		LettoreFile file1 = new LettoreFile("testo1.txt");
		Testo testo1 = file1.leggiFile();

		out.writeln("-----------Contenuto testo1.txt-------------");
		out.writeln(testo1.contenuto());
		String inverso = testo1.inverso();
		out.writeln("-----------Testo invertito-------------");
		out.writeln(inverso);
		out.writeln("-----------------------------------");
		out.writeln("- file testo2.txt creato!");        

		Testo testo2 =new Testo(inverso);

		ScrittoreFile file2 = new ScrittoreFile("testo2.txt");
		file2.scriviFile(testo2);
	}   
}
