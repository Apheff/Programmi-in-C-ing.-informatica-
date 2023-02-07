/*  Scrivere un programma C che fa inserire all’utente un numero intero che rappresenta
un anno e visualizza all’utente 1 se l’anno è bisestile e 0 se non lo è. Si ricorda che un anno è bisestile
se è multiplo di 4. Fanno eccezione gli anni secolari (quelli multipli di 100) che sono bisestili solo se
multipli di 400.    */

#include <stdio.h>

int main()
{
    int anno;
    printf("-Inserisci un anno (1 bisestile, 0 non bisestile): ");
    scanf("%d", &anno);

    if(anno % 4 == 0 && !(anno % 100 == 0 && anno % 400 != 0))            // sono divisibili per 4 e se sono divisibili per 100 devono essere anche divisibili per 400
    {
        printf("1\n");
    }
    else
    {
        printf("0\n");
    }
}