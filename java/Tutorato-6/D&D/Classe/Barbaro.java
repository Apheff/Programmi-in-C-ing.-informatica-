package Classe;
import Personaggio.*;

public class Barbaro extends Classe{
    public Barbaro(){
        this.nome = "Barbaro";
        this.forza += 5;
        this.intelligenza -= 5;
    }

    public String toString(){
        String s = "";
        s += "\tSpecializzazione: " + this.getSpecializzazione();
        s += "\n\tDescrizione: i barbari no";
        return s;
    }

    public void aumentaLivello(Personaggio personaggio){
        personaggio.setDestrezza(personaggio.getDestrezza()+1);
    }

    public void aumentaLivello(Personaggio personaggio, int i){
        personaggio.setDestrezza(personaggio.getDestrezza()+1*i);
    }
}
