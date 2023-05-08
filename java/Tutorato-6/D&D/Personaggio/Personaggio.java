package Personaggio;
import Nazionalità.*;
import Classe.*;
import fond.io.*;

public class Personaggio {
    //OutputWindow out = new OutputWindow();
    private String nome;
    private Razza razza;
    private Classe classe;
    private int livello, forza, intelligenza, destrezza, saggezza, fortuna;

    public Personaggio(String nome, Razza razza, Classe classe){
        this.nome = nome;
        this.razza = razza;
        this.classe = classe;
        this.livello = 1;
        this.forza = classe.getForza() + razza.getForza();
        this.intelligenza = classe.getIntelligenza() + razza.getIntelligenza();
        this.destrezza = classe.getDestrezza() + razza.getDestrezza();
        this.saggezza = classe.getSaggezza() + razza.getSaggezza();
        this.fortuna = classe.getFortuna() + razza.getFortuna();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setLivello(int livello){
        this.livello = livello;
    }

    public int getLivello(){
        return livello;
    }

    public int setForza(int forza){
        return forza;
    }

    public int setIntelligenza(int intelligenza) {
        return intelligenza;
    }

    public int setDestrezza(int destrezza){
        return destrezza;
    }

    public int setSaggezza(int saggezza){
        return saggezza;
    }

    public int setFortuna(int fortuna){
        return fortuna;
    }

    public int getForza(){
        return forza;
    }

    public int getIntelligenza() {
        return intelligenza;
    }

    public int getDestrezza(){
        return destrezza;
    }

    public int getSaggezza(){
        return saggezza;
    }

    public int getFortuna(){
        return fortuna;
    }

    public void aumentaLivello(OutputWindow out){
        this.setLivello(this.getLivello() + 1 );
        this.classe.aumentaLivello(this,out);
        out.writeln("\n@@@ Aumento di livello! @@@\n\tLiello " + this.getLivello());
        out.writeln(this);
    }

    public void aumentaLivello(OutputWindow out,int i){
        this.setLivello(this.getLivello() + 1*i);
        this.classe.aumentaLivello(this,i,out);
        out.writeln("\n@@@ Aumento di livello! @@@\n\tLiello " + this.getLivello());
        out.writeln(this);
    }

    public String toString(){
        String s = "";
        s += "--- Descrizione Generale ---\n\t";
        s += "Nome: " + this.getNome() + "\n\t";
        s += "Livello: " + this.getLivello() + "\n\t";
        s += "Razza: " + this.razza.getNome() + "\n\t" + this.razza.toString() + "\t";
        s += "Classe: " + this.classe.getNome() + "\n" + this.classe.toString();
        s += "\n┌---------------------------- Statistiche -----------------------------┐\n";
        s += "| Forza: " + this.getForza() + " | Inteligenza: " + this.getIntelligenza() + " | Destrezza: " + this.getDestrezza() + " | Saggezza: " + this.getSaggezza() + " | Fortuna: " + this.getFortuna() + " |\n└----------------------------------------------------------------------┘\n";
        return s;
    }
}
