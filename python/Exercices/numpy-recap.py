import numpy as np

###1. Creare un vettore di zero di dimensione 10
a = np.zeros(shape = (10,))
print("1. ", a)

###2. Creare un vettore di dimensione 6 con valori a zero tranne per il quinto che è impostato a 1
b = np.zeros(shape = (6,))
b[4] = 1
print("2. ", b)

###3. Creare un vettore con valori compresi tra 8 e 39 (inclusi)
c = np.arange(8, 40)
print("3. ",c)

###4. Invertire un vettore
d = c[::-1]
print("4. ", d)

###5. Creare un ndarray con valori [1,4,1,0,4,0] e trovare gli elementi non nulli
e = np.array([1, 4, 1, 0, 4, 0])
print("5. ")
for i in e:
    if i != 0:
        print(e)

#in alternativa
print("5. modo alternativo: ", np.nonzero(e))

###6. Creare un ndarray 2x5x3 con valori casuali campionati da una distribuzione normale
f = np.random.normal(size = (2, 5, 3))
print("6. ", f)

###7. Trovare il valore massimo, minimo e medio sull’array dell’esempio 6.
print("7. medio: ", f.mean(), ", massimo: ", f.max(), ", minimo: ", f.min())

###8. Creare una matrice 10x10 e riempirla con un pattern a scacchiera (1, 0, 1, 0…)
g = np.zeros(shape = (10, 10), dtype = int)
g[1::2, ::2] = 1
g[::2, 1::2] = 1
print("8. ", g)

###9. Moltiplicare (dot product) una matrice 7x2 per una matrice 2x6
h = np.random.normal(size = (7, 2))
i = np.random.normal(size = (2, 6))
print("9. ", np.dot(h, i))
print("-----------------")

#in alternativa
print("9. modo alternativo: ", h @ i)

###10. Trovare i valori comuni tra due ndarray
l = np.arange(1, 6)
m = np.arange(4, 9)
print("9. ")
for i in l:
    for j in m:
        if i == j:
            print(i)

#alternativa 1
print("9. modo alternativo 1: ")
for i in l:
    if i in m:
        print(i)

#alternativa 2
print("9. modo alternativo 2: ", np.intersect1d(l, m))

###11. Calcolare ((A+B)*(-A/2)), dove A e B sono ndarray
A = np.ones(3)
B = np.ones(3) * 2

np.add(A, B, out = B)
np.divide(A, 2, out = A)
np.negative(A, out = A)
np.multiply(A, B, out = A)

print("11. ", A)

###12. Dati due ndarray con valori random A e B, controllare se sono uguali
A = np.random.randint(0, 2, 5)
B = np.random.randint(0, 2, 5)

equal = np.array_equal(A, B)
print("12. ", equal)

#metodo alternativo per trovare se sono simili
equal = np.allclose(A, B, atol = 0.000001, rtol = 0.000001)
print("12. metodo alternativo", equal)

###13. Creare un ndarray random di dimensione 10 e sostituire l'elemento con valore massimo con 0
Z = np.random.random(10)
Z[Z.argmax()] = 0
print("13. ", Z)

###14. Trovare il valore più vicino di un ndarray a uno scalare dato
z = np.arange(100)
v = np.random.uniform(0, 100)
index = (np.abs(z-v)).argmin()
print("14. ", z[index])

###15. Considerare un ndarray con valori random e shape (100,2) che rappresenta delle coordinate cartesiane, calcolare le distanze punto-punto
z = np.random.random((100, 2))
x, y = np.atleast_2d(z[:, 0], z[:, 1])
d = np.sqrt((x - x.T)**2 + (y - y.T)**2)
print("15. ", d)

###16. Sottrarre la media di ogni riga di un ndarrat a se stesso
X = np.random.rand(2, 4)
X_mean = X.mean(axis = 1, keepdims = True)
print("16. ", X_mean)
Y = X - X_mean
print("16. X: ", X)
print("16. Y:", Y)
