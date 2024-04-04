'''
Scrivere un programma che chiede all'utente di inserire una stringa e mostra a schermo se:
○ La stringa contiene almeno un numero
○ La stringa contiene tutte lettere minuscole
○ La stringa contiene soltanto numeri
○ La stringa contiene soltanto lettere e numeri
'''

string_a = input("Insert a string: ")

print("the string contains at least one number: ", string_a.isdigit())
print("the string is lowercase: ", string_a.islower())
print("the string has an alphabetic string: ", string_a.isalpha())
print("the string is alpha-numeric: ",string_a.isalnum())
print("the string is uppercase: ", string_a.isupper())
