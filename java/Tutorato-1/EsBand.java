import classi.*;            // tutte le classi inserite si trovano sulla cartella ./tutorato-1/classi
import fond.io.*;           

public class EsBand
{
    public static void main(String[] args)
    {
        /*  inizializzazione    */

        InputWindow in = new InputWindow();
        
        String nome1 = in.readString("Inserisci il nome del musicista");
        String strumento1 = in.readString("Inserisci il nomde dello strumento");
        String nome2 = in.readString("Inserisci il nome del musicista");
        String strumento2 = in.readString("Inserisci il nomde dello strumento");
        String nome3 = in.readString("Inserisci il nome del musicista");
        String strumento3 = in.readString("Inserisci il nomde dello strumento");
        String nome4 = in.readString("Inserisci il nome del musicista");
        String strumento4 = in.readString("Inserisci il nomde dello strumento");
        String nome5 = in.readString("Inserisci il nome del musicista");
        String strumento5 = in.readString("Inserisci il nomde dello strumento");    
        
        
        /*  costruttori */
        Musicista musicista1 = new Musicista(nome1, strumento1);
        Musicista musicista2 = new Musicista(nome2, strumento2);
        Musicista musicista3 = new Musicista(nome3, strumento3);
        Musicista musicista4 = new Musicista(nome4, strumento4);
        Musicista musicista5 = new Musicista(nome5, strumento5);
        Band band = new Band("Led Zeppelin", musicista1, musicista2, musicista3, musicista4, musicista5);

        String nome = in.readString("Insersici il nome della band");
        band.setNome(nome);
        
        String nomeMusicista = in.readString("Inserisci il nome nuovo musicista");
        String nomeStrumento = in.readString("Inserisci il nome del nuovo strumento");
        Musicista nuovo = new Musicista(nomeMusicista, nomeStrumento);
        band.setMusicista(nuovo);
        
        /*  output  */
        
        OutputWindow out = new OutputWindow();
        out.writeln(band.stampaDescrizione());


    }
}
