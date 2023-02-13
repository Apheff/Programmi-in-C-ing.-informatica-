/*

    Scrivere un programma che permette di effettuare la copia di un file in qualsiasi formato. Il
    programma, dopo aver letto dall’utente il nome del file da copiare e il nome del file da scrivere, deve leggere
    il contenuto del file di origine e scrivere il contenuto del file di destinazione.
    Nota: si suggerisce di leggere e scrivere il file con le modalità “rb” (lettura binaria) e “wb” (scrittura binaria)
    e di usare le funzione fread e fwrite per leggere e scrivere i due file.

*/

#include <stdio.h>
#include <string.h>


int main()
{
    char inFile[50];
    char outFile[50];

    printf("- Inserisci il nome del file da copiare:");
    scanf("%49s", inFile);

    printf("- Inserisci il nome del file da copiare:");
    scanf("%49s", outFile);

    FILE * fin = fopen(inFile, "rb");
    FILE * fout = fopen(outFile, "wb");

    if (fin == NULL)
    {
        printf("- Impossibile aprire il file %s...\n", inFile);
    }
    else if (fout == NULL)
    {
        printf("- Impossibile aprire il file %s...\n", outFile);
    }
    else
    {
        printf("Inizio copia !\n");

            unsigned char buffer[512];
            fread(buffer, 1, 10, fin);          // buffer da 512
        while (!feof(fin))                      // finche' non legge tutto il file
        {
            fwrite(buffer, 1, 10, fout);        // buffer da 512
            fread(buffer, 1, 10, fin);          // buffer da 512
        }

        printf("Fine copia !\n");
    }
    fclose(fin);    // chiusura del file di input
    fclose(fout);   // chiusura del file di output
}
