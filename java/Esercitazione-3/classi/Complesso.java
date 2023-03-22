package classi;

public class Complesso
{
    private double reale, immaginario;

    /* crea un oggetto Complesso con parte reale re e parte immaginaria im */

    public Complesso(double re , double im)
    {
        this.reale = re;
        this.immaginario = im;
    }

    /* restituisce il modulo del numero complesso rappresentato dall’oggetto ricevente
    (cioè quello su cui è invocato il metodo) */
    public double modulo ()
    {
        return Math.sqrt( Math.pow(reale, 2.0) + Math.pow(immaginario, 2.0));
    }

    /* restituisce un oggetto Complesso che è il coniugato del numero complesso
    rappresentato dall’oggetto ricevente (cioè quello su cui è invocato il metodo)*/
    public Complesso coniugato ()
    {
        return new Complesso(this.reale, -this.immaginario);
    }

    /* restituisce un oggetto Complesso che è pari alla somma tra il numero complesso
    rappresentato dall’oggetto ricevente (cioè quello su cui è invocato il metodo) e il
    numero complesso c passato per parametro */
    public Complesso somma (Complesso c)
    {
        return new Complesso(this.reale + c.reale, this.immaginario + c.immaginario);
    }

    /* restituisce un oggetto Complesso che è pari al prodotto tra il numero complesso
    rappresentato dall’oggetto ricevente (cioè quello su cui è invocato il metodo) e il
    numero complesso c passato per parametro */
    public Complesso prodotto (Complesso c)
    {
        double rep = (this.reale * c.reale) - (this.immaginario * c.immaginario);
        double imp = (this.immaginario * c.reale) + (this.reale * c.immaginario);
        return new Complesso(rep, imp);
    }
    
    /* restituisce una descrizione testuale del numero complesso rappresentato
    dall’oggetto ricevente (cioè quello su cui è invocato il metodo) */
    public String toString()
    {
        if(this.immaginario > 0)
        {
            return this.reale + " + i" + this.immaginario;
        }
        else if(this.immaginario == 0)
        {

            return "" + this.reale;
        }
        else
        {
            return this.reale + " - i" + (-this.immaginario);
        }
    }
}
