/*  Scrivere un programma C che chiede all’utente di inserire un numero intero e visualizza
all’utente 1 se il numero è pari e 0 se non lo è.   */


#include <stdio.h>

int NumeroPari(int n)              //funzione per capire se un numero e' pari
{
    if(n%2 == 0)                   // se il resto %2==0 vuol dire che e' divisibile per due e quindi pari
        return 1;
    else
        return 0;                  // se il resto e' diverso da 0 allora non e' pari
}

int main ()
{
    int n;
    printf("-Inserisci un numero (1 e' pari, 0 e' dispari): ");
    scanf("%d", &n);
    
    printf("%d\n", NumeroPari(n));
}