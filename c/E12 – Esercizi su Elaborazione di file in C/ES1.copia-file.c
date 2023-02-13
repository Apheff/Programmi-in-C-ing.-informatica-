/*

    Scrivere un programma che permette di effettuare la copia di un file testuale. Il programma,
    dopo aver letto dall’utente il nome del file da copiare e il nome del file da scrivere, deve leggere il contenuto
    del file di origine e scrivere il contenuto del file di destinazione. 

*/

#include <stdio.h>
#include <string.h>
#define DIM 100

int main()
{
    char FileIn[DIM];   // nome file in lettura (input)
    char FileOut[DIM];  // nome file in scrittura (output)

    printf("- Dimmi il nome del file da copiare: ");
    scanf("%99s", &FileIn);

    printf("- Scrivi il nome del file da creare: ");
    scanf("%99s", &FileOut);

    FILE* fin = fopen(FileIn, "r");         //  aprire il file in lettura
    FILE* fout = fopen(FileOut, "w");       //  aprire il file in scrittura

    if (fin == NULL)
    {
        printf("- Impossibile trovare il file %s! :( ...\n", FileIn);
    }
    else if (fout == NULL)
    {
        printf("- Impossibile trovare il file %s! :( ...\n", FileOut);       
    }
    else
    {
        printf("Inizio copia !\n");
        while (!feof(fin))
        {
            char s[512];
            fgets(s, 512, fin);     // lettura di una riga
            fputs(s, fout);         // scrittura di una riga
        }
        printf("Fine copia !\n");
    }

    fclose(fin);            //  chiusura file di input
    fclose(fout);           //  chiusura file in output

}