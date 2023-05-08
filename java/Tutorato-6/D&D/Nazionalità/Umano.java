package Nazionalità;

public class Umano extends Razza{
    private String[] tratti = {"Distruzione planetaria","Elon Musk buff\n"};
    public Umano(){
        this.nome = "Umano";
        this.forza += 1;
        this.intelligenza += 1;
        this.destrezza += 1;
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
        s += "Gli umani sono umani\n";
        s += "\tTratti: " + this.getTratti();
        return s;
    }
}
