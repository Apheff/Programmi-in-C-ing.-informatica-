package classi;

public class EquazioneDiSecondoGrado
{
    private double a, b, c;

    /* crea un oggetto EquazioneDiSecondoGrado con coefficienti a, b e c */
    public EquazioneDiSecondoGrado (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* restituisce la prima radice dell’equazione */
    public Complesso primaRadice ()
    {
        double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);

        double re1, im1;

        if(delta >= 0)
        {
            re1 = (- this.b + Math.sqrt(delta)) / ( 2 * this.a );
            im1 =  0.0;
        }
        else
        {
            re1 = -this.b / (2 * this.a);
            im1 =  Math.sqrt(-delta) / (2 * this.a);
        }
        return new Complesso(re1, im1);
    }

    /* restituisce la seconda radice dell’equazione */
    public Complesso secondaRadice ()
    {
        double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);

        double re2, im2;

        if(delta >= 0)
        {
            re2 = (- this.b - Math.sqrt(delta)) / ( 2* this.a );
            im2 =  0.0;
        }
        else
        {
            re2 = - this.b / (2 * this.a);
            im2 = - Math.sqrt(-delta) / (2 * this.a);
        }
        return new Complesso(re2, im2);        
    }

}