/*  Scrivere una funzione C che riceve come parametro una matrice m, le sue dimensioni e un indice
di colonna j e restituisce l’elemento di valore massimo della colonna j. Scrivere poi un programma che fa
inserire all’utente una matrice e un indice di colonna e visualizza il valore massimo presente nella colonna di
indice dato.    */ 


#include "stdio.h"

int MassimoPerColonna (int j, int row, int column, int m[row][column])
{
    int massimo = m[0][j];                                                      // creao una variabile massimo uguale al primo elemento della colonna
    for (int i = 1; i < row; i++)
    {
        if (m[i][j] > massimo)                                                  // sostituisce massimo con il valore piu' grande
        {
            massimo = m[i][j];
        }
    }
    return massimo;                                                              // return massimo
}


int main()
{
    int row, column;                                                            // definisco le righe e le colonne 
    printf("- Inserisci le dimensioni dell'array m (righe, colonne):");         // interazione con l'utente 
    scanf("%d %d", &row, &column);
    
    int m[row][column];                                                         // creo una matrice m

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            printf("-> Inserisci l'elemento (%d, %d): ", i, j);
            
            scanf("%d", &m[i][j]);
        }
    }
    int j;                                                                       // inizializzo la j

    printf("scegli una colonna da 0 ad %d :", column-1);                             // faccio scegliere all'utente la colonna j
    scanf("%d", &j);

    int max = MassimoPerColonna(j, row, column, m);                              // inizializzo max come il risultato della funzione
    printf("Il valore massimo della colonna scelta e' %d\n", max);                    // printo il risultato
}