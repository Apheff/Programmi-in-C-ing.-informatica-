import fond.io.*;

/*
   ESERCIZIO 3 
   (guarda "tutorato-2-TP.pdf")
*/

public class romanToInt
{
    public static void main (String[] args)
    {
        /*  inizializzazione  */

        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        String romano = in.readString("Inserisci un numero romano: ");
        
        int num = 0;
        int sum = 0;

        for(int i = romano.length() - 1; i >= 0; i--)
        { 
            switch (romano.charAt(i))
            {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    break;
            }
            if(num * 4 < sum)
            {
                sum -= num;
            }
            else
            {
                sum += num;
            }
        }
        out.writeln(" - Numero romano: " + romano);
        out.writeln(" - Numero in intero: " + sum);    

    } 
}
