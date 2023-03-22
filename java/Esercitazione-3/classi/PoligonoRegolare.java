package classi;

public class PoligonoRegolare
{
    private double l;
    private int n;

    /* crea un oggetto PoligonoRegolare con n lati di lunghezza l */
    public PoligonoRegolare (int n, double l)
    {
        this.n = n;
        this.l = l;
    }

    /* cambia la misura del lato del poligono */
    public void cambiaDimensione (double l)
    {
        this.l = l;
    }

    /* restituisce l’apotema del Poligono */
    public double apotema ()
    {
        return (this.l / 2 * Math.tan(Math.PI / n));
    }

    /* restituisce il perimetro del Poligono */
    public double perimetro ()
    {
        return (this.n * this.l);
    }

    /* restituisce l’area del poligono */
    public double area ()
    {
        return ((this.apotema() * this.perimetro()) / 2);
    }
}
