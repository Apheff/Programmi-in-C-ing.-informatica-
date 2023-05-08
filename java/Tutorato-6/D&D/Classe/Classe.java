package Classe;
import Personaggio.*;
import fond.io.*;

public class Classe {
    protected String nome;
    protected String specializzazione;
    protected int forza, intelligenza, destrezza, saggezza, fortuna;
    
    public Classe(){
        this.specializzazione = "null";
        this.nome = "null";
        this.forza = 0;
        this.intelligenza = 0;
        this.destrezza = 0;
        this.saggezza = 0;
        this.fortuna = 0;
    }

    public String getNome(){
        return nome;
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

    public String getSpecializzazione(){
        return specializzazione;
    }

    public String toString(){
        String s = "";
        s += "\tDescrizione: ";
        s += "null\n";
        return s;
    }

    public void aumentaLivello(Personaggio personaggio, OutputWindow out){
        out.writeln("non fa niente: (\n)");
    }

    public void aumentaLivello(Personaggio personaggio, int i, OutputWindow out){
        out.writeln("non fa niente: (\n)");
    }

}

