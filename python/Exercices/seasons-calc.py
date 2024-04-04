'''
Scrivere un programma Python che chiede all'utente di inserire un mese e un giorno e mostra in console
la stagione dell'anno (Inverno, primavera, estate, autunno) relativa al mese e al giorno inseriti.
'''

day = int(input("Insert a day: "))
month = int(input("Insert a month: "))

if day > 31 or month > 12:
    print("The date is wrong.")

elif (month in [1, 2]) or (month == 12 and day >= 22) or (month == 3 and day <= 20):
    print("It's winter.")

elif (month in [4, 5]) or (month == 3 and day >= 21) or (month == 6 and day <= 20):
    print("It's spring.")

elif (month in [7, 8]) or (month == 6 and day >= 21) or (month == 9 and day <= 22):
    print("It's summer")

else:
    print("it's autumn.")
