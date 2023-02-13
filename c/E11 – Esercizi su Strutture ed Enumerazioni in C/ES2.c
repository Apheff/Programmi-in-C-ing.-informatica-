/*

    Definire una struttura di nome complesso dotata dei campi re e im per rappresentare numeri
    complessi. Scrivere una funzione per la risoluzione di equazioni di secondo grado (v. anche l’Esercizio 5 di E7
    e gli esercizi 1 e 2 di E9) della forma 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0. La funzione riceve tre parametri (di tipo double)
    passati per valore che rappresentano i tre coefficienti a, b e c e due parametri (di tipo complesso) passati per
    riferimento in cui scrivere le soluzioni dell’equazione.
    Scrivere poi un programma che fa inserire all'utente i coefficienti di un'equazione di secondo grado e stampa
    le sue soluzioni.

*/

#include <stdio.h>
#include <math.h>

typedef struct
{
    double re;
    double im;
}complesso;

double SoluzioneComplessa (double a, double b, double c, complesso * sol1, complesso * sol2);

int main()
{
    complesso sol1, sol2;

    double a, b, c;

    printf("- inserisci i valori del polinomio ax^2 + bx + c = 0 :\n");
    printf(" a ->");
    scanf("%lf", &a);

    printf(" b ->");
    scanf("%lf", &b);

    printf(" c ->");
    scanf("%lf", &c);

    SoluzioneComplessa(a, b, c, &sol1, &sol2);

    printf(" - La soluzione dell' equazione e'\n");
    printf("-> x1 = %g + i %g\n-> x2 = %g + i %g\n", sol1.re, sol1.im, sol2.re, sol2.im);
}

double SoluzioneComplessa (double a, double b, double c, complesso * sol1, complesso * sol2)
{

    double delta = pow(b, (double)2 ) - (4 * a * c);

    if(delta > 0)
    {
        (*sol1).re = (- b + sqrt(delta))/ (2 * a);
        (*sol1).im = 0;
        (*sol2).re = (- b - sqrt(delta))/ (2 * a);
        (*sol2).im = 0;
    }
    else
    {
        (*sol1).re = - b/ (2 * a);
        (*sol1).im = sqrt(-delta)/ (2 * a);
        (*sol2).re = (*sol1).re;
        (*sol2).im = -sqrt(-delta)/ (2 * a);        
    }
}