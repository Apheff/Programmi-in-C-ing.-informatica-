package classi;

public class Taglio implements Trasformazione
{
    private int i1, j1;
    private int i2, j2;

    public Taglio(int i1, int j1, int i2, int j2)
    {
        this.i1 = i1;
        this.j1 = j1;
        this.i2 = i2;
        this.j2 = j2;
    }

    public Immagine trasforma(Immagine img)
    {
        Immagine taglioImg = new Immagine((this.j1+this.j2), (this.i1+this.i2));

		for(int i = this.i1; i < this.i2; i++)
		{
			for(int j = this.j1; j < this.j2; j++)
			{
                int r = img.getPixel(i, j).getRed();
                int g = img.getPixel(i, j).getGreen();
                int b = img.getPixel(i, j).getBlue();
                Colore c = new Colore(r, g, b);
                taglioImg.setPixel(i, j, c);
			}
		}

        return taglioImg;
    }
  
}
