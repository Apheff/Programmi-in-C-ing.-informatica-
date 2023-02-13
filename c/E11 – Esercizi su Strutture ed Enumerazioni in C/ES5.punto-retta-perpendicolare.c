/*

    Assumendo di aver definito la struttura di nome punto, definire una struttura retta i cui campi
    sono m (di tipo double) e q (di tipo double), rappresentanti il coefficiente angolare e il termine noto
    dell’equazione della retta 𝑦 = 𝑚𝑥 + 𝑞. Scrivere una funzione che riceve come parametri una retta r ed un
    punto p e restituisce la retta perpendicolare a r passante per p. Scrivere poi un programma che utilizza la
    funzione scritta.
    Nota: Qualora la retta sia verticale (cioè avente equazione y=c) il valore di m deve essere impostato a INFINITY
    (tale costante è definita nella libreria math.h) e q deve essere uguale a c.

*/

#include <stdio.h>
#include <math.h>

typedef struct
{

    double x;
    double y;

}punto;

typedef struct
{

    double m;
    double q;

}retta;

retta FunzionePerperndicolare (retta r, punto p);

int main ()
{

    retta r;
    punto p;

    printf("- Inserisci le variabili m e q della retta r, (m, q): ");
    scanf("%lf %lf", &r.m, &r.q);

    printf("- Ora inserisci le coordinate del punto P, (x, y):");
    scanf("%lf %lf", &p.x, &p.y);


    retta s = FunzionePerperndicolare(r, p);

    if(s.m == INFINITY)
    {
        printf("l'equazione della retta perpendicolare passante per P e':\n");
        printf("-> x = %g\n", s.q);       
    }
    if(s.m == 0)
    {
        printf("l'equazione della retta perpendicolare passante per P e':\n");
        printf("-> y = %g\n", s.q);              
    }
    else
    {
        printf("l'equazione della retta perpendicolare passante per P e':\n");
        printf("-> y = %gx + %g\n", s.m, s.q);
    }

}

retta FunzionePerperndicolare (retta r, punto p)
{
    retta s;

    if (r.m == 0)
    {
        s.m = INFINITY;
        s.q = p.x;
    }
    else if (r.m == INFINITY)
    {
        s.m = 0;
        s.q = p.y;
    }
    else
    {
        s.m = -1 / r.m;
        s.q = 1 /r.m * p.x + p.y;
    }

    return s;
}