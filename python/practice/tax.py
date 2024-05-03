'''
Scrivere un programma che chiede all'utente di inserire se è coniugato oppure no e il suo reddito e
successivamente mostra in console le tasse dovute secondo il seguente schema:

Non coniugato e reddito compreso nell'intervallo Tasse dovute
--------------------------------------------------------------
[0, 10000]€                                                      0€
[10000, 30000]€                     12% del valore eccedente 10000€
Più di 30000€                       30% del valore eccedente 30000€

Coniugato e reddito compreso nell'intervallo Tasse dovute
-----------------------------------------------------------
[0, 10000]€                                                      0€
[10000, 30000]€                     15% del valore eccedente 10000€
Più di 30000€                       35% del valore eccedente 30000€
'''

coniugato = int(input("Sei coniugato? (si: 1, no: 0)\n"))
reddito = float(input("Qual è il tuo reddito?\n"))
tax = 0.0

if (coniugato):
    if 1000.00 < reddito < 30000.00:
        tax = 12.0
    if reddito > 30000.00:
        tax = 30.0
else:
    if 1000.00 < reddito < 30000.00:
        tax = 15.0
    if reddito > 30000.00:
        tax = 35.0

print(tax)
# print(bool(coniugato))
        