/*

    Scrivere una funzione che riceve in ingresso tre numeri interi h, m e s che rappresentano ore
    minuti e secondi e restituisce il numero di secondi trascorsi dalla mezzanotte. Scrivere poi un programma
    che usa questa funzione per calcolare i secondi trascorsi tra due orari entrambi contenuti entro il ciclo di una
    giornata. Ad esempio, se i due orari inseriti fossero 12:30:00 e 13:40:30 il programma dovrebbe stampare:

    I secondi trascorsi tra i due orari sono: 4230
    
*/

#include <stdio.h>

/*
    Creo una funzione "SecondiTrascorsi"
*/
int SecondiTrascorsi (int h, int m, int s);

/*
    Nel main faccio inserire all'utente tre variabili h, m, s iniziali e finali e poi li
    inserisci nella funzione SecondiTrascorsi. creando cosi' le due soluzioni!
*/
int main ()
{
    int h1, m1, s1;
    printf("- Inserisci un orario iniziale (HH mm ss): ");
    scanf("%d %d %d", &h1, &m1, &s1);

    int h2, m2, s2;
    printf("- Inserisci un orario finale (HH mm ss): ");
    scanf("%d %d %d", &h2, &m2, &s2);

    int soluzione1 = SecondiTrascorsi(h1, m1, s1);
    int soluzione2 = SecondiTrascorsi(h2, m2, s2);

    printf("- I secondi trascorsi tra i due orari sono: %d\n", (soluzione2-soluzione1));
}

/*
    La soluzione e' uguale a (h * 3600) + (m * 60) + s
    e poi la funzione restituisce la soluzione finale.
*/
int SecondiTrascorsi (int h, int m, int s)
{
    int soluzione = (h * 3600) + (m * 60) + s;
    return soluzione;
}