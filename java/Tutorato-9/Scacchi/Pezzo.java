public class Pezzo
{
    // indica il tipo di pezzo secondo quanto indicato in tabella
    private char tipo;

    private char colore; // B=bianco, N=nero

    public Pezzo(char tipo, char colore)
    {
        this.tipo = tipo;
        this.colore = colore;
    }
    // restituisce il tipo
    public char getTipo(){ return tipo; }
    // restituisce il colore
    public char getColore(){ return colore; }
}
