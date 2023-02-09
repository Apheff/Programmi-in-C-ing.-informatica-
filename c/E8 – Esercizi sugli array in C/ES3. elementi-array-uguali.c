/*

    Scrivere una funzione C che riceve come parametro un array di interi e la sua dimensione e
    restituisce 1 se tutti gli elementi dell'array sono distinti.
    
*/

#include <stdio.h>

int ElementiUguali (int size, int m[size]);

/*
    
*/
int main ()
{
    int size;
    printf("- Inserisci la dimensione dell'array: ");
    scanf("%d", &size);

    int m[size];
    
    for (int i = 0; i < size; i++)
    {
        printf("- Inserisci l'elemento %d-esimo: ", i);
        scanf("%d", &m[i]);
    }
    
    if(ElementiUguali(size, m))
        printf("-> Gli elementi sono tutti uguali. :)\n");
    else
        printf("-> Gli elementi *NON* sono tutti uguali. :(\n");
}

/*
    Dentro al ciclo for controllo se tutti gli elementi sono uguali al primo m[0],
    se cosi' non fosse allora gli elementi sono distinti e non piu' uguali.
*/
int ElementiUguali (int size, int m[size])
{
    int uguali = 1;

    for (int i = 1; i < size; i++)
    {
        if(m[0] != m[i])
        {
            uguali = 0;
        }
    }
    
    return uguali;
}