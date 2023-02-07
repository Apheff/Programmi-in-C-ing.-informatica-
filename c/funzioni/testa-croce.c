/*  Scrivere una funzione che simuli il lancio di una moneta. La funzione non riceve alcun
parametro e restituisce 0 (testa) o 1 (croce). Si scriva poi un programma che simuli il lancio della
moneta per 100 volte e visualizzi il numero di teste e il numero di croci ottenute. */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int lanciomoneta ();

int main ()
{
    srand(time(0));

    int teste = 0;
    int croci = 0;
    
    printf("Adesso lancero' 100 volte la moneta!...\n");

    for (int i = 0; i < 100; i++)
    {
        int risultato = lanciomoneta();
        if(risultato == 1)
            croci++;
        else
            teste++;
    }
    
    printf("Ho lanciato %d volte testa e %d volte croce\n", teste, croci);
}

int lanciomoneta ()
{
    int risultato = rand() % 2;
    return risultato;
}