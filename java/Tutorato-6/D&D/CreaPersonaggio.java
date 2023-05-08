import Classe.*;
import fond.io.*;
import Nazionalità.*;
import Personaggio.*;

public class CreaPersonaggio {
    public static void main(String[] args){
        OutputWindow out = new OutputWindow("Personaggio",50,75);
        //Razze
        Razza elfo = new Elfo(); 
        Razza nano = new Nano();
        Razza umano = new Umano();
        //Classi
        Classe barbaro = new Barbaro();
        Classe druido = new Druido();
        //personaggi
        Personaggio nanoDruido = new Personaggio("Gimli", nano, druido);
        Personaggio elfoDruido = new Personaggio("Legolas", elfo, druido);
        Personaggio umanoBarbaro = new Personaggio("Conan", umano, barbaro);
        
        //Stampe
        
        //out.writeln(nanoDruido);
        //out.writeln(elfoDruido);
        out.writeln(umanoBarbaro);

        nanoDruido.aumentaLivello(out);
        elfoDruido.aumentaLivello(out,29);
    }
}
