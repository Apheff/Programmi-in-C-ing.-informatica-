public class ArrayAlternato
{
    /* riceve in input un array di interi e altri parametri se necessario e restituisce 
    true  se  gli  elementi  dell’array  sono  alternativamente  pari  e 
    dispari,  cioè  se  ogni  elemento  pari  è  seguito  da  un  dispari  e 
    viceversa. */
    public static boolean arrayAlternato(int[] a, int i)
    {
        boolean alternato = true;
        if (i == a.length-1)
            alternato = true;
        else
        {
            alternato = arrayAlternato(a,i+1);
            if ((a[i]%2!=0 && a[i+1]%2!=0) || (a[i]%2==0 && a[i+1]%2==0))
                alternato = false;
        }
        return alternato;
    }

    /*  main per provare la funzione */
    public static void main (String[] args)
    {
        int a[] = {1,4,5,11,15,6};
        boolean alternato = arrayAlternato(a,0);
        System.out.println(alternato);
    }
}
