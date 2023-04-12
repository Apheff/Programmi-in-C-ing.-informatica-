import fond.io.*;
import classi.*;

public class ProvaMatStringhe
{
    public static void main (String[] args)
    {
        
        /*  dimensione dell'array  */
        int dim = 5;
        
        String[][] tabella = new String[dim][dim];
        
        
        /*  prova matrice con tutte "OO"  */
        for(int i = 0; i < tabella.length; i++)
        {
            for(int j = 0; j < tabella[0].length; j++)
            {
                tabella[i][j] = "OO";
            }
        }
        
        /*  per testare stringaCorta  */
        tabella[1][1] = "X";
        tabella[1][2] = "QQQ";
        tabella[3][3] = "TTT";

        MatStringhe matrice = new MatStringhe(tabella);
        
        /*  output  */
        OutputWindow out = new OutputWindow();
        out.writeln(matrice.toString());
        out.writeln("\n- stronga corta:" + matrice.stringaCorta(1)+ "\n");

        String[] lunghe = matrice.stringheLunghe(2);
        out.writeln("- stronghe lunghe ("+ lunghe.length +"):");      

        for(int i = 0; i < lunghe.length; i++)
        {
            out.writeln(lunghe[i] + " ");
        }

        char[][] vocali = matrice.letteraIniziale();

        out.writeln("Stringhe con le vocali: ");
        for(int i = 0; i < vocali.length; i++)
        {
            for(int j = 0; j < vocali[0].length; j++)
            {
                out.write(vocali[i][j]+ " ");
            }
            out.write("\n");
        }

        out.writeln("numero caratteri su ogni riga : ");

        int[] sommaRighe = matrice.sommaLunghezzeRighe();

        for(int i = 0; i < vocali.length; i++)
        {
            out.writeln("1) "+ sommaRighe[i]);
        }
        

    }    
}
