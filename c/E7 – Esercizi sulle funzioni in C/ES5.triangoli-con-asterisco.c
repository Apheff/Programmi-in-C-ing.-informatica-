/*
    Scrivere una funzione che riceve un parametro intero n e stampa un triangolo di
    asterischi con base e altezza pari a n. Ad esempio se n fosse 4, la funzione dovrebbe stampare:
        *
       **
      ***
     ****
    Scrivere poi un programma che usa la funzione scritta.
*/

#include <stdio.h>

/*
    questa funzione serve per stampare gli * n modo tale che scelta una h
    viene passato il valore di h nel ciclo for e il ciclo si ferma quando gli indici
    raggiungono il valore di h
*/
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

/*
    l'utente inserisce nel main un valore per h e poi viene eseguita la funzione precendente "triangolo"
*/
int main ()
{
    int h;
    printf("- Inserisci l' altezza del triangolo: ");
    scanf("%d", &h);

    triangolo(h);   
}