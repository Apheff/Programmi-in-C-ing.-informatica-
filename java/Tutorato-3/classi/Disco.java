package classi;

public class Disco
{
    private String autore, titolo, proprietario;    
    
    /* crea un Disco con autore, titolo e proprietario specificati */ 
    public Disco (String autore, String titolo, String proprietario)
    {
        this.autore = autore;
        this.titolo = titolo;
        this.proprietario = proprietario;
    }
    
    /*  crea  un  Disco  con  autore  e  titolo  specificati;  al  campo 
    proprietario è associata la stringa vuota */ 
    public Disco (String autore, String titolo)
    {
        this.autore = autore;
        this.titolo = titolo;
        this.proprietario = "";
    }
    
    /* imposta il proprietario */ 
    public void setProprietario (String proprietario)
    {
        this.proprietario = proprietario;
    } 
    
    /* restituisce l’autore */ 
    public String getAutore ()
    {
        return this.autore;
    }
    
    /* restituisce una descrizione completa del disco */ 
    public String toString ()
    {
        String s = "************************\n";
        s += "- Autore: " + this.autore + "\n";
        s += "- Titolo: " + this.titolo + "\n";
        s += "- Propritario: " + this.proprietario + "\n";
        s += "*************************\n\n";
        return s;        
    }
}
