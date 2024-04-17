'''
Scrivere un programma Python che data una lista di numeri sostituisca ciascun valore con la media tra il
valore stesso e i due adiacenti (o dell’unico valore adiacente se il valore in esame si trova all’estremità
della lista). Scrivere due versioni del programma: una in cui i nuovi valori sono inseriti in una nuova lista
e un’altra in cui i valori sono sostituiti direttamente nella lista di partenza.
'''

listNum = [1,2,3,8,5,10]
listMed = []

#firt method: making a new list

for i in range(len(listNum)):
  if i == 0:
    listMed.append((listNum[i]+listNum[i+1])/2)
  elif i == len(listNum) - 1:
    listMed.append((listNum[i]+listNum[i-1])/2)
  else:
    listMed.append((listNum[i]+listNum[i+1]+listNum[i-1])/3)
    
print(listMed)

#second method: change the current list

temp = listNum[0]
t = 0

for i in range(len(listNum)):
  if i == 0:
    listNum[i] =  (listNum[i]+listNum[i+1])/2
  elif i == len(listNum) - 1:
    listNum[i] = (listNum[i]+temp)/2
  else:
    t = listNum[i]
    listNum[i] = (temp+listNum[i]+listNum[i+1])/3
    temp = t
    
print(listNum)



