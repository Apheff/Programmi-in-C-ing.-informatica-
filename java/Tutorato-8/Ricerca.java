public class Ricerca 
{
    public static boolean ricercaSequenziale (int[] a, int k)
    {
        boolean trovato = false;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == k)
                trovato = true;
        }

        return trovato;
    }    

    public static boolean ricercaBinaria(int[] a, int k)
    {
        boolean trovato = false;

        int left = 0;
        int right = a.length - 1;

        while(!trovato && (left <= right))
        {
            int m = (left + right) / 2;
            if(a[m] == k)
            {
            trovato = true;
            }
            else if (k > a[m])
            {
            left = m + 1;
            }
            else if (k < a[m])
            {
            right = m - 1;
            }
        }
        return trovato;
    }


    public static void main(String[] args)
    {
        int a[] = {1, 7, 9, 10, 14, 15, 12, 5, 2};
        int k = 12;
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(ricercaSequenziale(a, k));
        System.out.println(ricercaBinaria(b, k));
    }
}
