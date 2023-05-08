public class Resto
{
    /*un metodo di classe ricorsivo che riceve in input 
    due interi 𝑛 ed 𝑚 e calcola la funzione 𝑛%𝑚.*/
    public static int resto(int n, int m)
    {
        int risultato = 0;
        if(n < m)
        {
            risultato = n;
        }
        else
        {
            risultato = resto(n - m, m);
        }

        return risultato;
    }
    /*  main che serve per provare la funzione creata */
    public static void main(String[] args)
    {
        int n = 11;
        int m = 2;
        int risultato = resto(n,m);
        System.out.println("il risultato e' " + risultato);
    }
}
