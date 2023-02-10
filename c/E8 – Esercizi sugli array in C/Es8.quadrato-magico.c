/*

    Un quadrato magico è uno schieramento di numeri interi distinti in una tabella quadrata tale
    che la somma dei numeri presenti in ogni riga, in ogni colonna e in entrambe le diagonali dia sempre lo stesso
    numero.Un esempio di quadrato magico è mostrato qui sotto:

    int m[3][3] =
    {
        {2, 7, 6},
        {9, 5, 1},
        {4, 3, 8}
    };

    Scrivere una funzione C che riceve come parametro una matrice quadrata m e la sua dimensione e restituisce
    1 se la matrice è un quadrato magico, 0 in caso contrario. Scrivere poi un programma che fa inserire all’utente
    una matrice quadrata di interi e gli dice se la matrice è un quadrato magico o meno.

*/

#include <stdio.h>

int QuadratoMagico (int size, int m[][size]);

int main ()
{
    int m[3][3] =
    {
        {2, 7, 6},
        {9, 5, 1},
        {4, 3, 8}
    };
    printf("%d\n\n", QuadratoMagico(3, m));           //stampa 1 se l'array e' un Quadrato Magico, 0 altrimenti. 
}


int QuadratoMagico (int size, int m[][size])
{
    int magico = 1;
    int valore = 0;

    for (int i = 0; i < size; i++)          //Diagonale principale uguale al valore che voglio ottenere su tutte le colonne e diagonali
    {
        valore += m[i][i];
    }

    int somma = 0;


    for (int i = 0; i < size; i++)          //Somma elementi dell'antidiagonale
    {
        somma += m[i][size-1-i];
    }
    if(somma != valore)
    {
        magico = 0;
    }


    for (int i = 0; i < size; i++)          //Calcolare per le righe il valore della somma e confrontarlo con la variabile valore iniziale
    {
        somma = 0;
        for (int j = 0; j < size; j++)
        {
            somma += m[i][j];
        }
        if (somma != valore)
        {
            magico = 0;
        }
        
    }



    for (int i = 0; i < size; i++)          //Calcolare per le colonne il valore della somma e confrontarlo con la variabile valore iniziale
    {
        somma = 0;
        for (int j = 0; j < size; j++)
        {
            somma += m[j][i];
        }
        if (somma != valore)
        {
            magico = 0;
        }
        
    }


    return magico;
}