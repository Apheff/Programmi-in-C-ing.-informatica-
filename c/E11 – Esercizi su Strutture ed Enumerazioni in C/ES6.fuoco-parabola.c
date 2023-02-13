/*

    Assumendo di aver definito la struttura di nome punto, definire una struttura parabola i cui
    campi sono a, b e c (tutti di tipo double) rappresentanti i coefficienti dell’equazione della parabola

    𝑦 = 𝑎𝑥 2 + 𝑏𝑥 + 𝑐.
    
    Scrivere una funzione che riceve come parametro una parabola p e restituisce un punto che è il fuoco
    della parabola. Scrivere poi un programma che utilizza la funzione scritta.

*/

#include <stdio.h>
#include <math.h>

typedef struct
{

    double a;
    double b;
    double c;

}parabola;

typedef struct
{

    double x;
    double y;

}punto;

punto Fuoco (parabola p);

int main ()
{
    parabola p;

    printf("- inserisci i valori del polinomio ax^2 + bx + c = 0 :\n");
    printf(" a ->");
    scanf("%lf", &p.a);

    printf(" b ->");
    scanf("%lf", &p.b);

    printf(" c ->");
    scanf("%lf", &p.c);


    punto f = Fuoco(p);         // la variabile f prende i valori x e y del punto di fuoco

    printf("-> Il fuoco e' il punto F(%g, %g)\n", f.x, f.y);
}

punto Fuoco (parabola p)
{
    punto f;

    double delta = pow(p.b, 2.0) - 4 * p.a *p.c;

    f.x = -p.b / (2 * p.a);                     // calcolo della ascissa del fuoco
    f.y = (1 - delta)/ (4 * p.a);               // calcolo della ordinata del fuoco

    return f;
}