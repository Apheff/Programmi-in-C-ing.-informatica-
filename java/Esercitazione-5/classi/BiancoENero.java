package classi;

public class BiancoENero implements Trasformazione
{
    public Immagine trasforma(Immagine img)
    {
        Immagine neroImg = new Immagine(img.larghezza(), img.altezza());

		for(int i = 0;i < img.altezza(); i++)
		{
			for(int j = 0;j < img.larghezza(); j++)
			{
                int r = img.getPixel(i, j).getRed();
                int g = img.getPixel(i, j).getGreen();
                int b = img.getPixel(i, j).getBlue();
                int  l = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);
                Colore c = new Colore(l, l, l);
                neroImg.setPixel(i, j, c);
			}
		}

        return neroImg;
    }   
}
