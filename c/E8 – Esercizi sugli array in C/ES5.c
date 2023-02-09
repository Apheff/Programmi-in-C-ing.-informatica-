/*

    Scrivere una funzione C che riceve come parametro una matrice quadrata m e la sua dimensione
    e restituisce 1 se la matrice è triangolare superiore, 0 in caso contrario. Si ricorda che una matrice è
    triangolare superiore se tutti i suoi elementi al di sotto della diagonale principale sono uguali a 0. Scrivere poi
    un programma che fa inserire all’utente una matrice quadrata di interi e gli dice se la matrice è triangolare
    superiore o meno.

*/

#include <stdio.h>

int MatriceTriangolareSup (int size, int m[size][size]);

int main ()
{
    int size;
    printf("- Inserisci la dimensione della matrice: ");
    scanf("%d", &size);

    int m[size][size];

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("- Inserisci l'elemento della matrice (%d, %d)", i, j);
            scanf("%d", &m[i][j]);
        }
    }

    if(MatriceTriangolareSup(size, m))
    {
        printf("-> La matrice e' triangolare superiore! :)\n");
    }
    else
        printf("-> La matrice *NON* e' triangolare superiore... :(\n");
}

int MatriceTriangolareSup (int size, int m[size][size])
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if(i > j && m[i][j] != 0)
            {
                return 0;
            }
        }
    }
    return 1;
}