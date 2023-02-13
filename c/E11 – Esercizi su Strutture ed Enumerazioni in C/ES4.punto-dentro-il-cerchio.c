/*

    Assumendo di aver definito la struttura di nome punto, definire una struttura cerchio i cui campi
    sono centro (di tipo punto) e raggio (di tipo double). Utilizzando la funzione distanza dell’esercizio
    precedente scrivere una funzione che riceve un parametro c di tipo cerchio e un parametro p di tipo punto e
    restituisce 1 se il punto p è all’interno del cerchio c, 0 altrimenti. Scrivere poi un programma che utilizza la
    funzione scritta.

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
    double raggio;
    punto centro;
}cerchio;

double Distanza (punto p1, punto p2);           // definisco le due funzioni

double DentroIlCerchio(cerchio c, punto p);

int main()
{
    cerchio c;
    punto p;

    printf("- Inserisci le coordinate del centro del cerchio (x, y): ");
    scanf("%lf %lf", &c.centro.x, &c.centro.y);

    printf("- Inserisci il raggio del cerchio:");
    scanf("%lf", &c.raggio);

    printf("- ora inserisci le coordinate di un punto P (x, y):");
    scanf("%lf", &p.x, &p.y);

    DentroIlCerchio(c, p);
}

double Distanza (punto p1, punto p2)
{
    return sqrt(pow(p1.y-p2.y, 2.0) + pow(p1.x-p2.x, 2.0));             // il calcolo del distanza Euclidea
}

/*
    per sapere se il punto e' interno la funzione confronta la distanza punto-centro
    con la lunghezza del raggio e restituisce la soluzione 
*/
double DentroIlCerchio(cerchio c, punto p)
{
    if(Distanza(c.centro, p) <= c.raggio)                               
    {
        printf("- Il punto P si trova all'interno del cerchio! :)\n");
    }
    else
    {
        printf("- Il punto P *NON* si trova all'interno del cerchio.. :(\n");        
    }
}