import fond.io.*;
import classi.*;            // tutte le classi inserite si trovano sulla cartella ./tutorato-1/classi


public class EsContoCorrente
{
    public static void main (String[] args)
    {
        /*  inizializzazione   */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        String password = in.readString("- Inserisci password:");
        ContoCorrente mioConto = new ContoCorrente(password);
        
        out.writeln("Conto corrente creato con successo!");
        
        /*  deposito  */
        
        double importo = in.readDouble("Importo da depositare: ");
        String p = in.readString("-Inserisci password");
        mioConto.deposita(importo, p);
        out.writeln("Deposito effettuato con successo!");
        double saldo = mioConto.leggiSaldo();
        out.writeln("Il saldo attuale e': ");
        out.writeln(saldo);

        /*  prelievo  */

        importo = in.readDouble("Importo da prelevare: ");
        p = in.readString("-Inserisci password");
        mioConto.preleva(importo, p);
        out.writeln("Prelievo effetuato con successo!");
        saldo = mioConto.leggiSaldo();
        out.writeln("Il saldo attuale e': ");
        out.writeln(saldo);

        /*  tasso di interesse  */

        double interesse = in.readDouble("Tasso di interesse: ");
        mioConto.aggiungiInteresse(interesse);
        saldo = mioConto.leggiSaldo();
        out.writeln("Il saldo attuale e': ");
        out.write(saldo);

    }    
}
