package classi;

public class Negativo implements Trasformazione
{
    public Immagine trasforma(Immagine img)
    {
        Immagine negativa = new Immagine(img.larghezza(), img.altezza());

		for(int i = 0;i < img.altezza(); i++)
		{
			for(int j = 0;j < img.larghezza(); j++)
			{
                int r = img.getPixel(i, j).getRed();
                int g = img.getPixel(i, j).getGreen();
                int b = img.getPixel(i, j).getBlue();
                Colore c = new Colore(255-r, 255-g, 255-b);
                negativa.setPixel(i, j, c);
			}
		}

        return negativa;
    }
}
