package classi;

public class CambioColore implements Trasformazione
{
    private Colore c1, c2;

    public CambioColore(Colore c1, Colore c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Immagine trasforma(Immagine img)
    {
        Immagine cambiocolore = new Immagine(img.larghezza(), img.altezza());

		for(int i = 0;i < img.altezza(); i++)
		{
			for(int j = 0;j < img.larghezza(); j++)
			{
                int r = img.getPixel(i, j).getRed();
                int g = img.getPixel(i, j).getGreen();
                int b = img.getPixel(i, j).getBlue();
                Colore c = new Colore(r, g, b);
                if(c.getBlue() == this.c1.getBlue() && c.getRed() == this.c1.getRed() && c.getGreen() == this.c1.getGreen())
                {
                    cambiocolore.setPixel(i, j, this.c2);
                }
                else
                {
                    cambiocolore.setPixel(i, j, c);
                }
			}
		}

        return cambiocolore;
    }
}
