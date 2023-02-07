/*  Scrivere una funzione che riceve due parametri x e b entrambi di tipo double e calcola il
logaritmo in base b di x. Scrivere poi un programma che usa la funzione scritta.
Suggerimento: usare la funzione log della libreria math.h e la formula per il cambio di base dei
logaritmi:
log𝑏 𝑥 = log𝑐 𝑥 /log𝑐 b  */

#include <stdio.h>
#include <math.h>

int main ()
{
    double x, b;
    printf("- Insersci un numero per il parametro per la base:");
    scanf("%lf", &b);

    printf("- Insersci un numero per il parametro x:");
    scanf("%lf", &x);

    double logbX = log(x) / log(b);
    printf("il risultato di LOGb(x) = %g\n", logbX);
}