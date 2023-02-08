/*
    Scrivere una funzione che riceve come parametro un intero compreso tra 1 e 12 che
    rappresenta un mese dell’anno e restituisce il numero di giorni di quel mese. Se il valore passato
    come parametro è fuori dall’intervallo [1,12] la funzione restituisce -1;
    Scrivere poi un programma che chiede ripetutamente all’utente di inserire un numero che
    rappresenta un mese e gli mostra il numero di giorni di quel mese. L’inserimento termina quando
    l’utente inserisce un valore fuori dall’intervallo [1,12].
*/

#include <stdio.h>

/*
    Creo una fuzione "GiornoDelMese"
*/
int GiornoDelMese (int m);

/*
    Dentro al main creo un do while, che mi serve per far scegliere all'utente
    un giorno del mese ripetutamente e se il ciclo while viene interrotto il programma
    stampera' "Arrivederci"
*/
int main()
{
    int m;
    do
    {
        printf("- Inserisci un numero tra 1 e 12: ");
        scanf("%d", &m);

        GiornoDelMese(m);

    } while (1 <= m && m<=12);
    printf("Arrivederci!\n\n");
}

/*
    In base al numero del mese scelto viene resituito il numero di giorni del mese,
    tramite dei if creati
*/
int GiornoDelMese (int m)
{

    if (m == 4 || m == 6 || m == 9 || m == 11)
    {
        printf("- Questo mese ha 30 giorni!\n");
    }
    if (m == 1 || m == 3 || m== 5 || m == 7 || m == 8 || m == 10 || m == 12)
    {
        printf("- Questo mese ha 31 giorni!\n");       
    }
    if (m == 2)
    {
        printf("- Questo mese ha 28 giorni!\n");  
    }
    if(!(m <= 12 && m>= 1))
        printf("- Non e' nell'intervallo dato :( ... \n");
}