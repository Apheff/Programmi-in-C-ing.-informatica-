import classi.*;
import fond.io.*;

public class ProvaSistema
{
    public static void main(String[] args)
    {
        /*  inizializzazione  */
		OutputWindow out = new OutputWindow();
		InputWindow in = new InputWindow();

        /*  creazione della matrice A  */
        int m = in.readInt("Insersici numero equazioni");
        int n = in.readInt("Inserisci numero incognite");
        double[][] A = new double [m][n];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                A[i][j] = in.readDouble("Insersici l'elemento A"+ (i+1) +"-"+ (j+1));
            }
        }

        /*  creazione dell'array b */
        double[] b = new double [m];
        for(int i = 0; i < b.length; i++)
        {
            b[i] = in.readDouble("Insersici l'elemento b"+ (i+1));            
        }

        /*  
            crea un oggetto Sistema s che rappresenta il sistema lineare inserito dall'utente
        */
        Sistema S1 = new Sistema(A, b);

        /*  visualizza il sistema creato  */
        out.writeln(S1.toString());

        /*
            fa inserire all'utente un vettore x che rappresenta una possibile soluzione del 
            sistema (è necessario garantire che la dimensione del vettore inserito sia corretta)
        */
        double[] X = new double [n];
        for(int i = 0; i < A[0].length; i++)
        {
            X[i] = in.readDouble("Insersici l'elemento X"+ (i+1));
        }
        
        /* Dice all'utente se x è effettivamente una soluzione del sistema, oppure no */
        if(S1.verificaSistema(X))
            out.writeln("- La soluzione e' verificata con successo!");
        else
            out.writeln("- La soluzione e' *NON* verificata ... :(");
        
    }
}
