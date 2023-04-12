package classi;

public class PuntoV2
{

	private double x;
	private double y;

	public PuntoV2(double x,double y)
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

	public static PuntoV2 puntoMedio(PuntoV2 p1, PuntoV2 p2)
	{
		return new PuntoV2((p1.x+p2.x)/2,(p1.y+p2.y)/2);
	}

	public double Distanza(PuntoV2 p1, PuntoV2 p2)
	{
		return Math.sqrt(Math.pow(p2.x-p1.x, 2) + Math.pow(p2.y-p1.y, 2));
	}

}