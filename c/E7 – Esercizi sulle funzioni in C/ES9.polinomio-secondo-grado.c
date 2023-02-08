/*
    Scrivere una funzione C che riceve tre parametri di tipo double 𝑎, 𝑏, e 𝑐 che
    rappresentano i coefficienti di un’equazione di secondo grado nella forma
    𝑎𝑥^2 + 𝑏𝑥 + 𝑐 = 0 e stampa le radici dell’equazione. Nel caso in cui le radici non siano reali la funzione deve stampare
    un opportuno messaggio.
    
    Ad esempio, se 𝑎 = 1, 𝑏 = 3, 𝑐 = 2, la funzione dovrebbe stampare:
    Soluzioni x1=-1, x2=-2

    Se invece 𝑎 = 1, 𝑏 = 2, 𝑐 = 3, la funzione dovrebbe stampare:
    Soluzioni non reali.
    Scrivere un programma che usa la funzione scritta.
*/

#include <stdio.h>
#include <math.h>

/*
    Creo una funzione "SoluzionePolinomio"
*/
double SoluzionePolinomio (double a, double b, double c);

/*
    Nel main faccio inserire all'utente tre variabili a, c, b e poi li
    inserisci nella funzione SoluzionePolinomio
*/
int main ()
{
    double a,b,c;
    printf("- inserisci i valori del polinomio ax^2 + bx + c = 0 :\n");
    printf(" a ->");
    scanf("%lf", &a);

    printf(" b ->");
    scanf("%lf", &b);

    printf(" c ->");
    scanf("%lf", &c);

    SoluzionePolinomio(a, b, c);
}

/*
    Creo 3 if per le tre possibili soluzioni per il delta e calcolo le soluzioni in base a 
    se il delta e' >0, =0 oppure <0 (soluzione non reale).
*/
double SoluzionePolinomio (double a, double b, double c)
{
    double delta = pow(b, (double) 2) - (4 * a * c);

    if(delta < 0)
    {
        printf("- Non ci sono soluzioni...\n");
    }
    if (delta > 0)
    {
        double x1 = (-b + sqrt(delta))/ (2 * a);
        double x2 = (-b - sqrt(delta))/ (2 * a);

        printf("- x1 = %g\n- x2 = %g\n", x1, x2);
    }
    if (delta == 0)
    {
        double soluzione = -b / (2 * a);
    }
    
}