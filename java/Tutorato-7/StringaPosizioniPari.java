public class StringaPosizioniPari
{
    public static String stringaPosizionePari(String s, int i)
    {
        String str;
        if (i == s.length())
        {
            str = "";
        }
        else
        {
            str = "";
            if(i % 2 == 0)
            {
                str += s.charAt(i);
            }
            str += stringaPosizionePari(s, i+1);
        }

        return str;
    }

    public static void main (String[] args)
    {
        String s = "programmazione";
        String str = stringaPosizionePari(s,0);
        System.out.println(str);
    }
}
