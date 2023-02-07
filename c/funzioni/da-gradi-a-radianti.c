/*  Scrivere una funzione C per la conversione di misure di angoli da gradi a radianti. Si
ricorda che, data una misura in gradi g, la corrispondente misura in radianti r è data da:
𝑟 = 𝑔 𝜋/180
Una volta scritta la funzione, scrivere un programma che visualizzi a schermo gli equivalenti in
radianti degli angoli da 0 a 360 gradi con intervalli di 10 gradi. */

#include <stdio.h>
#include <math.h>

double conversione(int gradi)
{
    double radianti = gradi * 3.14159 / 180;
    return radianti;
}

int main()
{
    printf("Gradi   Radianti\n");

    for (double gradi = 0; gradi <= 360; gradi+=10)
    {
        printf("%g\t%g\n", gradi, conversione(gradi));
    }
    
}
