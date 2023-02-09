/*

    Scrivere una funzione C che riceve come parametro una matrice quadrata m e la sua dimensione
    e restituisce 1 se la matrice è diagonale. Si ricorda che una matrice è diagonale se tutti i suoi elementi esclusi
    quelli della diagonale principale sono uguali a 0. Scrivere poi un programma che fa inserire all’utente una
    matrice quadrata di interi e gli dice se la matrice è diagonale o meno.

*/

#include <stdio.h>

int MatriceDiagonale(int size, int m[size][size]);

/*
    Il main serve per Creare la matrice e poi stampare se la matrice e' diagonale o meno.
*/
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
    
    if (MatriceDiagonale(size, m))
    {
        printf("-> La matrice e' Diagonale! :)\n");
    }
    else
        printf("-> La matrice *NON* e' diagonale. :(\n");
    
}

/*
    La funzione controlla se la matrice e' diagonale o meno e restituisce o 1 o 0 a seconda se lo e' o meno.
*/
int MatriceDiagonale(int size, int m[size][size])
{

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if(j != i && m[i][j] != 0)
            {
                return 0;
            }
        }
    }
    return 1;

}