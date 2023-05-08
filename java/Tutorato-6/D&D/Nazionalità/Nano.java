package Nazionalità;


public class Nano extends Razza {
    private String[] tratti = {"Resistenza, Forza Oscusa\n"};

    public Nano(){
        this.nome = "Nano";
        this.intelligenza += 2;
        this.destrezza += 2;
        this.fortuna += 1;
    }

    public String getTratti(){
        String s = "";
        for(int i=0; i<this.tratti.length-1; i++){
            s += this.tratti[i] + ", ";
        }
        s += this.tratti[this.tratti.length-1];
        return s;
    }

    public String toString(){
        String s = "";
        s += "Descrizione: ";
        s += "I nani no\n";
        s += "\tTratti: " + this.getTratti();
        return s;
    }
}
