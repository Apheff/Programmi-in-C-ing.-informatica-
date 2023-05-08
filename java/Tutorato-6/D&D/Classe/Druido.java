package Classe;
import Personaggio.*;
public class Druido extends Classe {
    public Druido(){
        this.nome = "Druido";
        this.forza -= 1;
        this.intelligenza += 2;
        this.saggezza += 2 ;
    }

    public String toString(){
        String s = "";
        s += "\tSpecializzazione: " + this.getSpecializzazione() + "\n";
        s += "\tDescrizione: ";
        s += "I druidi venerano soprattutto la natura, ottenendo i loro incantesimi e altri poteri magici dalla forza della natura.\n";
        return s;
    }

    public void aumentaLivello(Personaggio personaggio){
        personaggio.setDestrezza(personaggio.getDestrezza()+1);
    }

    public void aumentaLivello(Personaggio personaggio, int i){
        personaggio.setDestrezza(personaggio.getDestrezza()+1*i);
    }
}
