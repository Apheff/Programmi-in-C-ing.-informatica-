package classi;

public class Circonferenza
{
    private double a,b,c;
    private double raggio;

    /* crea un oggetto Circonferenza con la cui equazione ha coefficienti a, b, e c */
    public Circonferenza (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.raggio = Math.sqrt(Math.pow(this.a, 2.0) / 4 + Math.pow(this.b, 2.0) / 4 - this.c);
    }

    /* restituisce il centro della circonferenza rappresentata dall’oggetto ricevente (cioè
    quello su cui è invocato il metodo) */
    public Punto centro ()
    {
        double xc = - this.a / 2;
        double yc = - this.b / 2;
        return new Punto(xc, yc);
    }

    /* restituisce il raggio della circonferenza rappresentata dall’oggetto ricevente (cioè
    quello su cui è invocato il metodo) */
    public double raggio ()
    {
        return this.raggio;
    }

    
    /* restituisce true se la circonferenza rappresentata dall’oggetto ricevente (cioè
    quello su cui è invocato il metodo) contiene completamente la circonferenza c
    passata come parametro */
    public boolean contiene (Circonferenza c)
    {       
 
        if((this.centro()).Distanza(this.centro(), c.centro()) + c.raggio() <= this.raggio())
        {
            return true;
        }else
        {
            return false;
        }
    }
}
