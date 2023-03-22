package classi;

public class Punto
{

	private double x;
	private double y;

	public Punto(double x,double y)
	{
		this.x=x;
		this.y=y;
	}

	public double coordX()
	{
		return x;
	}

	public double coordY()
	{
		return y;
	}

	public static Punto puntoMedio(Punto p1, Punto p2)
	{
		return new Punto((p1.x+p2.x)/2,(p1.y+p2.y)/2);
	}

	public double Distanza(Punto p1, Punto p2)
	{
		return Math.sqrt(Math.pow(p2.x-p1.x, 2) + Math.pow(p2.y-p1.y, 2));
	}

}