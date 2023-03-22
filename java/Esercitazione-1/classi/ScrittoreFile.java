package classi;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScrittoreFile {
	
	private String nomefile;
	
	public ScrittoreFile(String nomefile) {
		this.nomefile=nomefile;
	}
	
	public void scriviFile(Testo t) {
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(new FileWriter("./Esercitazione-1/" + nomefile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.println(t.contenuto());
		pw.close();
	}


}
