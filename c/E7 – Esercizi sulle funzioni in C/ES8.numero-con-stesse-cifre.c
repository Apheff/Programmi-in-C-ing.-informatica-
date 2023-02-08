/*
    Scrivere una funzione che dato un intero n restituisce 1 (vero) se n ha tutte le cifre uguali,
    0 (falso) in caso contrario. Si scriva poi un programma che fa inserire un intero all’utente e mostra
    se tale intero ha tutte le cifre uguali o meno.
*/

#include <stdio.h>

/*
    Creo una funzione denominata "cifreuguali"
*/
int cifreuguali(int n);                     

/*
    Dentro al main faccio inserire all'utente un numero qualunque
    e poi faccio stampare il risultato del main.
*/
int main ()
{
    int n;
    printf("- Inserisci un numero: ");
    scanf("%d", &n);

    printf("%d\n", cifreuguali(n));
}

/*
    Dentro al ciclo for confronto la prima cifra (n % 10) ed n viene diviso per 10
    per guardare la cifra successiva. alla fine del ciclo for viene stampato il risultato
    della variabile uguali!
*/
int cifreuguali (int n)
{
    int uguali = 1;
    int primacifra = n % 10;

    for (int cifra; n > 0; n /= 10)
    {
        cifra = n % 10;

        if(primacifra != cifra)
            uguali = 0;
    }
    return uguali;
}