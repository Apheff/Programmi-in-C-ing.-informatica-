package Nazionalità;


public class Elfo extends Razza{
    private String[] tratti = {"Visione Oscura", "Sensi Acuti\n"};

    public Elfo(){
        this.nome = "Elfo";
        this.intelligenza += 4;
        this.destrezza += 3;
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
        s += "Gli elfi sono un popolo magico\n";
        s += "\tTratti: " + this.getTratti();
        return s;
    }
}
