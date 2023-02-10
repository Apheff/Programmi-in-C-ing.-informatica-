/*

    Scrivere una funzione C che riceve come parametro una matrice m, le sue dimensioni e due
    indici i e j e restituisce il numero di celle adiacenti alla cella (i,j) che contengono un numero positivo. Le celle
    adiacenti alla cella (i,j) sono le celle (h,k) con i-1 <= h <= i+1 e j-1 <= k <= j+1.
    Si noti che una cella che non si trova sul bordo della matrice ha 8 celle adiacenti mentre le celle del bordo ne
    hanno di meno.

    Scrivere poi un programma che fa inserire all’utente una matrice di interi e due indici i e j e visualizza a
    schermo il numero di celle adiacenti alla cella (i,j).

*/

#include <stdio.h>


int MatriceASchermo(int size, int m[][size]);

int CelleAdiacenti(int i, int j, int size, int m[][size]);

int main()
{
    int size;
    printf("- Inserisci la dimensione della matrice: ");
    scanf("%d", &size);

    int m[size][size];

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("- Inserisci l'elemento della matrice (%d, %d): ", i, j);
            scanf("%d", &m[i][j]);
        }
    }
    int i, j;
    printf("- Inserisci le due variabili i e j (i, j): ");
    scanf("%d %d", &i, &j);

    MatriceASchermo(size, m);

    printf("-> La soluzione e' :\n");
    CelleAdiacenti(i, j, size, m);
}

int MatriceASchermo(int size, int m[][size])                        //Serve per visualizzare meglio l'array e vedere se il risultato e' giusto
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("\t%d\t|", m[i][j]);
        }
        printf("\n");
    }
}


int CelleAdiacenti(int i, int j, int size, int m[][size])           //La funzione che serve per vedere se le celle adiacenti sono positive o meno
{
    for (int h = 0; h < size; h++)
    {
        for (int k = 0; k < size; k++)
        {
            if((h <= i+1 && h >= i-1) && (k <= j+1 && k >= j-1) && m[h][k] > 0 && m[i][j] != m[h][k])
            {
                printf("(%d, %d) = %d, ", h, k, m[h][k]);
            }
        }    
    }
    printf("\n");
}