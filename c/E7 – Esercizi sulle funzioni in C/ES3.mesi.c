/*
    Scrivere una funzione che riceve un parametro intero m che assume un valore tra 1 e 12
    e stampa il mese corrispondente al numero m. Ad esempio, se m fosse 2 la funzione dovrebbe
    stampare febbraio. Se m è un valore minore di 1 o maggiore di 12 la funzione non deve stampare
    nulla. Scrivere poi un programma che usa la funzione scritta.
*/

#include <stdio.h>

int mese (int m)
{
    switch (m)                      //creo uno switch per ogni numero e stampo il corrispettivo mese dell'anno
    {
    case 1:
        printf("Gennaio\n");
        break;    
    case 2:
        printf("Febbraio\n");
        break;    
    case 3:
        printf("Marzo\n");
        break;    
    case 4:
        printf("Aprile\n");
        break;    
    case 5:
        printf("Maggio\n");
        break;    
    case 6:
        printf("Giugno\n");
        break;    
    case 7:
        printf("Luglio\n");
        break;    
    case 8:
        printf("Agosto\n");
        break;    
    case 9:
        printf("Settembre\n");
        break;    
    case 10:
        printf("Ottobre\n");
        break;    
    case 11:
        printf("Novembre\n");
        break;
    case 12:
        printf("Dicembre\n");
        break;    
    default:
        break;
    }
}

int main ()
{
    int m;
    printf("-Scegli un numero tra 1 e 12: ");       //creo un interazione con l'utente
    scanf("%d", &m);
    mese(m);
}