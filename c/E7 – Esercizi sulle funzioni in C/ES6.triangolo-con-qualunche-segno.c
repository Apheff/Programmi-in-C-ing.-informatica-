/*

    Modificare la funzione dell’esercizio precedente aggiungendo un parametro c di tipo
    char e facendo sì che venga stampato un triangolo di caratteri uguali a c. Ad esempio, se n fosse 4 e
    c fosse ‘#’, la funzione dovrebbe stampare:
       #
      ##
     ###
    ####
    Scrivere poi un programma che usa la funzione scritta
    
*/

#include <stdio.h>

/*
    Creo una funzione "triangolospeciale"
*/
void triangolospeciale (int h, char c);

/*
    Nel main l'utente deve inserire due valori, un intero h e un carattere c
    per poi far inizializzare.
*/
int main ()
{
    int h;
    printf("- Inserisci l' altezza del triangolo: ");
    scanf("%d", &h);

    char c;
    printf("- Scegli un carattere per fare il triangolo: ");
    scanf(" %c", &c);

    triangolospeciale(h, c);
}

/*
    Creo una fuzione "triangolospeciale" e dentro la fuzione disegno il triangolo dell'esercizio
    precedente! solo che invece di stampare * uso il carattere c printf(" %c", c);
*/
void triangolospeciale (int h, char c)
{
    for (int i = 0; i <= h; i++)
    {
        for (int j = h; j > 0; j--)
        {
            if (j > i)
            {
                printf("  ");
            }
            else
                printf(" %c", c);
        }
        printf("\n");        
    }
}