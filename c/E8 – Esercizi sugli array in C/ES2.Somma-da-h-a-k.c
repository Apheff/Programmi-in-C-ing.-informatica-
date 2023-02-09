/*

    Scrivere una funzione C che riceve come parametro un array di interi, la sua dimensione e due
    indici h e k e restituisce la somma degli elementi dell’array memorizzati nelle posizioni da h a k. Scrivere poi
    un programma che fa inserire all’utente una sequenza di interi e due indici h e k e visualizza a schermo la
    somma degli elementi nelle posizioni da h a k. Nello scrivere la funzione si assuma che h e k sono due indici
    validi.
    
*/

#include <stdio.h>

/*
    Sulla funzione ho un semplice ciclo for da h a k che mi aggiunge alla variabile 'risultato' tutti gli elementi da h a k.
    Il risutato poi viene restituito alla fine del ciclo.
*/
int SommaTotale(int h, int k, int size, int m[size])
{
    int risultato = 0;

    for (int i = h; i <= k; i++)
    {
        risultato += m[i];
    }

    return risultato;
}

/*
    La funzione main serve per Creare l'array e scegliere i valori h e k e poi restituire il risultato
    della funzione precedente.
*/
int main()
{
    int size;
    printf("- Scegli la dimensione dell'array: ");
    scanf("%d", &size);

    int m[size];
    
    for (int i = 0; i < size; i++)
    {
        printf("- Inserisci l'elemento %d-esimo: ", i);
        scanf("%d", &m[i]);
    }

    int h,k;

    printf("- Ora scegli due posizioni dell'array (h, k): ");
    scanf("%d %d", &h, &k);

    printf("-> La Somma di h e k e' %d\n", SommaTotale(h, k, size, m));
}