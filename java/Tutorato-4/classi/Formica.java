package classi;

public class Formica
{

  private int i,j;
  private int id;
  private static int count = 1;

  /* Costruttore: crea una formica con la posizione specificataassegnandole un id */
  public Formica (int i, int j)
  {
    this.i = i;
    this.j = j;
    this.id = Formica.count;
    count++;
  }

  /* Restituisce l’id della formica */
  public int getId ()
  {
    return this.id;
  }

  /* Restituisce l’indice i della posizione della formica */
  public int getI ()
  {
    return this.i;
  }

  /* Restituisce l’indice j della posizione della formica */
  public int getJ ()
  {
    return this.j;
  }

  /* Modifica l’indice i della posizione della formica */
  public void setI (int i)
  {
    this.i = i;
  }
  
  /* Modifica l’indice j della posizione della formica */
  public void setJ (int j)
  {
    this.j = j;
  }

  /* Restituisce l’ultimo id assegnato ad una formica */
  public static int getLastId () 
  {
    return Formica.count;
  } 
}