/*  Scrivere un programma C che fa inserire all’utente un numero intero compreso tra 1 e
12 che rappresenta un mese (1=Gennaio, 2=Febbraio, ecc.) e visualizza all’utente 1 se il mese ha
trenta giorni, 0 altrimenti.    */

#include <stdio.h>

int main()
{
    int mese;
    printf("-inserisci un numero tra 1 e 12 : ");
    scanf("%d", &mese);

    if(mese == 4 || mese == 6 || mese == 9 || mese == 11)
        printf("1\n");
    else
        printf("0\n");
}