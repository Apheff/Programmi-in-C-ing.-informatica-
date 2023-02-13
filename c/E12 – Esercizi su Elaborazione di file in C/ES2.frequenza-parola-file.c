/*

    Scrivere un programma che legge dall’utente il nome di un file di testo e una stringa s e indica
    all’utente il numero di volte che la stringa s compare nel testo contenuto nel file.

*/

#include <stdio.h>
#include <string.h>


int main ()
{
    char inFile[50];    //  nome del file di input
    char s[50];     //  stringa di ricerca

    printf("- Inserisci il nome del file: ");
    scanf("%49s", &inFile);

    FILE * fin = fopen(inFile, "r");    //  apertura file in lettura

    if (fin == NULL)
    {
        printf("Impossibile aprire il file %s ...", inFile);
    }
    else
    {
        printf("- Inserisci un nome che vuoi cercare sul file scelto:");
        scanf("%49s", &s);

        int count = 0;          //  contatore della frequenza
        char txt[512];          //  array per leggere il testo

        while (!feof(fin))
        {
            fgets(txt, 512, fin);       //lettura di ogni 512 caratteri
            char * cPtr = txt;
            while (cPtr != NULL)
            {
                cPtr = strstr(cPtr, s);     // ricerca delle occorrenze di s in txt
                if (cPtr != NULL)
                {
                    count++;
                    cPtr++;
                }
                
            }
            
        }
        
        printf("il Numero di volte che compare '%s' e' : %d\n", s, count);
    }
}