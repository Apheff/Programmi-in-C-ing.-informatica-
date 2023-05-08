package Nazionalità;
  

public class Razza {
    protected String nome;
    protected int forza, intelligenza, destrezza, saggezza, fortuna;
    
    public Razza(){
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

    public String toString(){
        String s = "";
        s += "Descrizione: ";
        s += "null\n";
        return s;
    }


}
