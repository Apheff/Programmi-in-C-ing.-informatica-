/*   Scrivere un programma C che:
1. assegna ad una variabile a il più grande valore rappresentabile con il tipo double e ad una
variabile b il più piccolo valore (positivo) rappresentabile con il tipo double;
2. assegna ad una variabile c il doppio di a e ad una variabile d la metà di b;
3. stampa c e d.
Che cosa viene stampato?    */

#include <stdio.h>
#include <float.h>

int main()
{
    double a = DBL_MAX;
    double b = DBL_TRUE_MIN;
    double c = a * 2;
    double d = b / 2;

    printf("c: %g\nd: %g\n", c, d);
}