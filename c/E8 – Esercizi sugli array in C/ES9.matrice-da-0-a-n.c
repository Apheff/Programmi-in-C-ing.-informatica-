/*

    Scrivere una funzione C che riceve come parametro una matrice m, le sue dimensioni e un intero
    positivo n e restituisce 1 se nelle celle della matrice compaiono tutti gli interi da 0 a n. Scrivere poi un
    programma che fa inserire all’utente una matrice, e un intero n e gli dice se la matrice contiene tutti i numeri
    da 0 a n.

*/

#include <stdio.h>

int matrice_da_zero_a_n (int n, int r, int c, int m[r][c]);


int main () 
{

    int r, c;

    printf("- Inserisci le dimensione della matrice (righe, colonne): ");
    scanf("%d %d", &r, &c);

    int m[r][c];

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("- Inserisci l'elemento della matrice (%d, %d): ", i, j);
            scanf("%d", &m[i][j]);
        }
    }

    int n;

    printf("- Ora scegli un valore n: ");
    scanf("%d", &n);

    printf("%d\n", matrice_da_zero_a_n(n, r, c, m));
    
}


int matrice_da_zero_a_n (int n, int r, int c, int m[r][c])
{

    int numeri[n+1];

    for (int i = 0; i <= n; i++)
    {
        numeri[i] = 0;
    }
    

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            int l = m[i][j];

            if (l <= n && l >= 0)
            {
                numeri[l]++;
            }
        }
    }
    

    int tutti = 1;

    for (int i = 0; i <= n; i++)
    {
        if (numeri[i] == 0)
        {
            tutti = 0;
        }
    }

    return tutti;
}