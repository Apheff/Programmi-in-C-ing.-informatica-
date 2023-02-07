/*  Scrivere una funzione che riceve un parametro intero n e stampa un triangolo di
asterischi con base e altezza pari a n. Ad esempio se n fosse 4, la funzione dovrebbe stampare:
    *
   **
  ***
 ****
Scrivere poi un programma che usa la funzione scritta.  */

#include <stdio.h>

void triangolo (int h)
{
    for (int i = 0; i <= h; i++)
    {
        for (int j = h; j > 0 ; j--)
        {
            if (j > i)
            {
                printf("  ");
            }
            else
                printf(" *");
        }
        printf("\n");        
    }
}

int main ()
{
    int h;
    printf("- Inserisci l' altezza del triangolo: ");
    scanf("%d", &h);

    triangolo(h);   
}