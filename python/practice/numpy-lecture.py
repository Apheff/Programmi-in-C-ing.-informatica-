import numpy as np # type: ignore


a1 = np.random.uniform(size=(3,3))

a1_vec = a1.ravel()


for el in a1_vec:
    print("el: ", el)
print('----------------')


#iteration by index

for i in range(a1_vec.ravel().size):
    print("a1_vec[", i,"]: ", a1_vec)
print('----------------')

for el in a1:
    print("el: ",el)
print('----------------')

a22 = np.random.uniform(size=(2, 3, 4))
print("a22: ", a22)
print('----------------')


for el1 in a22:
    for el2 in el1:
        print("el2: ", el2)

#creation of a list
list1 = [
    [1, 2, 3],
    [3, 4, 5]
]

print("list1[0][1]: ", list1[0][1])
print("a22[0, 2, 1]", a22[0, 2, 1]) #look at the 24 line, cause is giving you the size of a22 matrix
print('----------------')

print("a22[0, 2, 0:2]: ", a22[0, 2, 0:2]) #prints the elements from 0 to 2 (excluded)
print('----------------')


#slicing the a normal matrix
a = np.random.normal(size=(3, 3))
print(a)
b = a[:, 0:2]
print(b)
b[0, 0] = 0.0
print(b)    #as we can se using the slicing method if we edit b we are going to edit also a in the same way (if you want to copy the matrix make use the copy function)
print("a after slicing: ", a)
print('----------------')


# matrix addition, subtraction and multiplication
a = np.ones(shape = (3, 3))
b = np.ones(shape = (3, 3)) + 2
#sum
print("a + b: ", a + b)
#substraction
print("a - b: ", a - b)
#multiplication
print("a * b: ", a * b)
#cos(a)
print("cos(a): ", np.cos(a))
#sin(b)
print("sin(b): ", np.sin(b))
#arctan(a)
print("arctan(a): ", np.arctan(a))
print('----------------')


a33 = np.ones(shape = (3, 3))
a44 = np.ones(shape = (3, 3)) + 2
print(a33 == a44)
a44[0, 0] = 1.0
print(a33 == a44)   #only one of the elements are True when you change the value 
print('----------------')




#time of the methods
import time

a33 = np.ones(shape = (300, 300))
a44 = np.ones(shape = (300, 300)) + 2

# universal function time
start = time.time()
c33 = a33 + a44
stop = time.time()
print("time taken for a33+a44: ", stop-start)


# for cycle time
result = np.empty(shape = (300, 300))
start = time.time()
for i in range(a44.shape[0]):
    for j in range(a44.shape[1]):
        result[i, j] = a33[i, j] + a44[i, j]
stop = time.time()
print("time taken for a33+a44: ", stop-start)
print('----------------')


# Gaussian function
a33 = np.random.normal(loc = 0.0, scale = 10.0, size = (3, 3))

print(a33)
print(a33.sum())
print(a33.mean())
print(a33.sum(axis = 1))
print('----------------')

#sum of different matrix
a33 = np.zeros(shape = (2, 2))
a33[1, 1] = 20
print("a33: ", a33)
a44 = np.ones(shape = (2,  ))
a44[1] = 10
print("a44: ", a44)
print("sum: ", a33 + a44)