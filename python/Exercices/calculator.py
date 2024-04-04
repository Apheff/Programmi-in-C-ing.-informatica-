'''
Scrivere un programma Python che elabora tre numeri e ne mostra in console:
○ La somma
○ La differenza
○ Il prodotto
○ Il valore medio
○ Il massimo
○ Il minimo
'''

a = int(input("insert the first number:"))
b = int(input("insert the second number:"))
c = int(input("insert the third number:"))


print("sum: ", a+b+c)
print("difference: ", a-b-c)
print("product: ", a*b*c)
print("average value: ", (a+b+c)/3)
print("max :", max(a, b, c))
print("min :", min(a, b, c))
