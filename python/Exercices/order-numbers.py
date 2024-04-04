'''
Scrivere un programma Python che chiede all'utente di inserire quattro numeri e mostra in console la
parola “crescenti” se sono in ordine strettamente crescente, “decrescenti” se sono in ordine
strettamente decrescente e “nessuno dei due” se non sono né in ordine crescente né in ordine
decrescente.
'''

a = int(input("insert the first number: "))
b = int(input("insert the second number: "))
c = int(input("insert the third number: "))
d = int(input("insert the fourth number: "))


if a > b > c > d :
    print("the numbers are in a discending order")

elif a < b < c < d :
    print("the numbers are in a ascending order")

else:
    print("the numbers has no order")