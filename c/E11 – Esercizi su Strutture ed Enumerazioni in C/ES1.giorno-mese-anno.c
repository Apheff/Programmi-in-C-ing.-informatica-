/*

    Definire una struttura di nome data con i campi giorno mese ed anno tutti di tipo int. Scrivere
    poi una funzione che riceve un parametro di tipo data e stampa la data passata come parametro nella forma
    estesa in cui il giorno è rappresentato con un numero da 1 a 31, il nome del mese è riportato per esteso e
    l’anno è riportato come numero di quattro cifre. Qualora la data passata come parametro contenga un anno
    di sole due cifre, esso va considerato un anno del XX secolo se superiore a 16 e un anno del XXI secolo se
    minore o uguale a 16.

*/

#include <stdio.h>

typedef struct 
{

    int giorno;
    int mese;
    int anno;

}data;

int StampaEstesa(data d);

int main()
{
    data d;
    printf("- Inserisci la data in cifre (giorno, mese, anno):");
    scanf("%d %d %d", &d.giorno, &d.mese, &d.anno);

    StampaEstesa(d);
}

int StampaEstesa(data d)
{
    printf("%d\t", d.giorno);

    char * mesi[12] =
    {
        "gennaio", "febbraio", "marzo", "aprile",
        "maggio", "giugno", "luglio", "agosto",
        "settembre", "ottobre", "novembre", "dicembre"
    };

    printf("%s\t", mesi[d.mese-1]);

    int anno = d.anno;

    if (anno < 1000)
    {
        if (anno <= 23)
        {
            anno = 2000 + anno;
        }
        else
        {
            anno = 1900 + anno;
        }
    }
    printf("%d\n", anno);
    
    
}