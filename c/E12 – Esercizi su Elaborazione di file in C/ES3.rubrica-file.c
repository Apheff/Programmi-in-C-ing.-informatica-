/*

    Si supponga di avere a disposizione un file di testo che contiene dati relativi a contatti telefonici
    (cioè una rubrica) organizzato nel modo seguente: la prima riga contiene un numero che indica il numero di
    contatti presenti nel file. Ogni contatto occupa tre righe successive consecutive: la prima riga contiene il
    nome del contatto, la seconda il cognome, la terza il numero di telefono.
    Si scriva un programma che:
    • legge i dati dal file e crea un array i cui elementi sono di tipo contatto, dove contatto è una struttura
    così definita

    typedef struct{
    char nome[20];
    char cognome[20];
    char numero[11];
    } contatto;

    • presenta agli utenti un menu con le seguenti opzioni:

    1- cerca per nome. Viene chiesto all’utente di inserire il nome di una persona e mostra
    tutti i dettagli (nome, cognome e numero di telefono) di tutti i contatti (eventualmente
    nessuno) che hanno quel nome;

    2- cerca per cognome. Viene chiesto all’utente di inserire il cognome di una persona e
    mostra tutti i dettagli (nome, cognome e numero di telefono) di tutti i contatti
    (eventualmente nessuno) che hanno quel cognome;

    3- cerca per nome e cognome. Viene chiesto all’utente di inserire il nome e cognome di
    una persona e mostra tutti i dettagli (nome, cognome e numero di telefono) di tutti i
    contatti (eventualmente nessuno) che hanno quel nome e cognome;

    4- cerca per numero. Viene chiesto all’utente di inserire un numero di telefono e mostra
    tutti i dettagli (nome, cognome e numero di telefono) del contatto (se presente) con quel
    numero di telefono.

    5- esci. Il programma termina.

*/

#include <stdio.h>
#include <string.h>

typedef struct
{
    char nome[20];
    char cognome[20];
    char numero[11];

} contatto;

int main()
{
    FILE* rubrica = fopen("rubrica.txt", "r");

    if (rubrica == NULL)
    {
        printf("- Impossibile aprire il file...");
    }
    else
    {
        int n;
        fscanf(rubrica,"%d",&n);

        contatto c[n];

        for (int i = 0; i < n; i++)
        {
            fscanf(rubrica, "%19s %19s %10s", c[i].nome, c[i].cognome, c[i].numero);
        }
        printf("- il numero di persone sono %d\n", n);

        int opzione = 0;
        do
        {
            printf("-> Menu'\n");                       // inserimento del menu'
            printf("1-cerca per nome.\n");
            printf("2-cerca per cognome.\n");
            printf("3-cerca per nome e cognome.\n");
            printf("4-cerca per numero.\n");
            printf("5-esci.\n");
            printf("Scegli un'opzione:");
            scanf("%d", &opzione);

            switch (opzione)                            //  uso uno switch per l'interazione del menu' 
            {
            case 1:
                char nome[20];
                printf("- Inserisci il nome :");        // faccio inserire il nome all'utente
                scanf("%19s", &nome);

                for (int i = 0; i < n; i++)
                {
                    if(strcmp(c[i].nome, nome) == 0)    // confronto la stringa con il file di testo
                    {
                        printf("\n->nome:%s\n->congnome:%s\n->numero:%s\n\n\n",
                         c[i].nome, c[i].cognome, c[i].numero);
                    }
                }
                
                break;
            case 2:
                char cognome[20];                                    // faccio inserire il cognome all'utente
                printf("- Inserisci il cognome :");
                scanf("%19s", &cognome);

                for (int i = 0; i < n; i++)
                {
                    if(strcmp(c[i].cognome, cognome) == 0)          // confronto la stringa con il file di testo
                    {
                        printf("\n->nome:%s\n->congnome:%s\n->numero:%s\n\n\n",
                         c[i].nome, c[i].cognome, c[i].numero);     // vengono stampati i dati della rubrica
                    }
                }
                break;
            case 3:
                nome[20];
                cognome[20];
                printf("- Inserisci il nome e cognome :");           // faccio inserire nome e cognome
                scanf("%19s%19s", &nome, &cognome);

                for (int i = 0; i < n; i++)
                {
                    if(strcmp(c[i].cognome, cognome) == 0 && strcmp(c[i].nome, nome) == 0)  // confronto sia nome che cognome
                    {
                        printf("\n->nome:%s\n->congnome:%s\n->numero:%s\n\n\n",
                         c[i].nome, c[i].cognome, c[i].numero);
                    }
                }
                break;
            case 4:
                char numero[11];
                printf("- Inserisci il numero :");                   // faccio inserire il numero 
                scanf("%10s", &numero);

                for (int i = 0; i < n; i++)                          // il ciclo for serve per confrontare ogni riga del file
                {
                    if(strcmp(c[i].numero, numero) == 0)
                    {
                        printf("\n->nome:%s\n->congnome:%s\n->numero:%s\n\n\n",
                         c[i].nome, c[i].cognome, c[i].numero);
                    }
                }
                break;
            case 5:
                break;
            default:
                /*
                    se viene inserito un numero fuori dall'intervallo viene stampato l'errore
                    e l'utente si ritrovera' di nuovo al menu' principale
                */
                printf("\n*********** ERRORE 404 **********\n"); 
                break;
            }
        } while (opzione != 5);

    }
    
}