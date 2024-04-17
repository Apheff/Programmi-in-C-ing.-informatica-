import numpy as np


a = np.array([1, 2, 3, 4])

list1 = [1, 2, 3, 4]
tuple1 = (1, 2, 3, 4)
b = np.array(list1)
c = np.array(tuple1)

a1 = np.zeros(shape=(3, 3, 3))  #generates a matrix of zeros
b1 = np.ones(shape=(2, 2))  #generates a matrix of ones
c1 = np.diag(b1)    #estracts the diagonal of the matrix
d1 = np.empty(shape=(3, 3)) #generates an empty matrix
e1 = np.eye(4)  #generates an Identity matrix 



print(a1, '\n')
print(b1, '\n')
print(c1, '\n')
print(d1, '\n')
print(e1, '\n')
