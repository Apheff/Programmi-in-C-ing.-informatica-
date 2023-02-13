/*

    Definire una struttura di nome punto con i campi x e y di tipo double. Scrivere una funzione
    distanza che dati due parametri di tipo punto restituisce la distanza Euclidea tra i due punti. Scrivere poi una
    funzione lunghezzaComplessiva che riceve come parametro un array di punti che rappresentano una
    poligonale e calcola la lunghezza complessiva della poligonale.
    Scrivere un programma che fa inserire all’utente una sequenza di punti (la lunghezza della sequenza è scelta
    dall’utente) e stampa la lunghezza complessiva della poligonale rappresentata dai punti inseriti.

*/

#include <stdio.h>
#include <math.h>

typedef struct
{

    double x;
    double y;

}punto;

double Distanza (punto p1, punto p2);

double LunghezzaComplessiva (int dim, punto poligonale[dim]);

int main()
{
    int dim;
    printf("- Quanti punti vuoi insterire?\n");
    scanf("%d", &dim);

    punto poligonale[dim];

    for (int i = 0; i < dim; i++)
    {
        printf("- Inserisci il punto P%d = (x, y):", i);
        scanf("%lf %lf", &poligonale[i].x, &poligonale[i].y);
    }

    printf("- La lunghezza totale e' = %g\n", LunghezzaComplessiva(dim, poligonale));
}

double Distanza (punto p1, punto p2)
{
    return sqrt(pow(p1.y-p2.y, 2.0) + pow(p1.x-p2.x, 2.0));  
}

double LunghezzaComplessiva (int dim, punto poligonale[dim])
{
    double soluzione = 0;

    for (int i = 0; i < dim - 1; i++)
    {
        soluzione += Distanza(poligonale[i], poligonale[i+1]); 
    }
    return soluzione;
}