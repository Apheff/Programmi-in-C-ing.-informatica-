package classi;

public class Riflessione implements Trasformazione
{
    public Immagine trasforma(Immagine img)
    {
        Immagine riflessioneImg = new Immagine(img.larghezza(), img.altezza());

		for(int i = 0;i < img.altezza(); i++)
		{
			for(int j = 0;j < img.larghezza()/2; j++)
			{
                int k = img.larghezza()-1-j;
                int r = img.getPixel(i, j).getRed();
                int g = img.getPixel(i, j).getGreen();
                int b = img.getPixel(i, j).getBlue();
                int ri = img.getPixel(i, k).getRed();
                int gi = img.getPixel(i, k).getGreen();
                int bi = img.getPixel(i, k).getBlue();
                Colore c = new Colore(r, g, b);
                Colore ci = new Colore(ri, gi, bi);
                riflessioneImg.setPixel(i, j, ci);
                riflessioneImg.setPixel(i, k, c);
			}
		}

        return riflessioneImg;
    }
}