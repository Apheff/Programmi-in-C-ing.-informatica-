/*

    Scrivere una funzione C che riceve come parametro un array di double e la sua dimensione e
    restituisce la media degli elementi presenti nell'array. Scrivere poi un programma che fa inserire all’utente
    una sequenza di double e visualizza a schermo la media dei valori nella sequenza.

*/

#include <stdio.h>

/*
    Creo una funzione per la media
*/
double MediaArray (int size, double m[size]);

/*
    Nel main faccio decidere all'utente la dimensione dell'array e inserire gli elementi dell'array; poi
    stampa la funzione media.
*/
int main ()
{
    int size;
    printf("- Scegli la dimensione dell'array: ");
    scanf("%d", &size);

    double m[size];
    
    for (int i = 0; i < size; i++)
    {
        printf("- Inserisci l'elemento %d-esimo: ", i);
        scanf("%lf", &m[i]);
    }
    
    
    printf("- La media di tutti i numeri e' %g\n", MediaArray(size, m));
}

/*
    La MediaArray e' una funziona che tramite un ciclo for fa la somma di tutti gli elementi,
    poi calcoli la media dividendo per la dimensione dell'array.
*/
double MediaArray (int size, double m[size])
{
    double somma = 0;

    for (int i = 0; i < size; i++)
    {
        somma += m[i];
    }
    double media = somma / size;
    return media; 
}