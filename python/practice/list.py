job_list = ["Engineer", "Pilot", ["Doctor", "Manager"]]

# controllare se alcuni oggetti fanno parte della lista
print("Engineer" in job_list)   #true
print("Farmer" in job_list)     #false
print("Doctor" in job_list)     #false
print([] in job_list)           #false
print(["Doctor", "Manager"] in job_list)    #true


# mutable list example
print(id(job_list))
job_list[0] = "Farmer"
print(job_list)
print(id(job_list))

# functions
list_a = [10, 20, 30, 40]
list_a.append(50)
print(list_a)
list_a.insert(3, 100)
print(list_a)
list_a.remove(10)
print(list_a)

# list of lists
lista1 = [12, 14, 16]
lista2 = [12, 14, 16]
print(lista1 == lista2) #true
print(lista1 in lista2) #flase
lista3 = [lista1, lista2]
print(len(lista3))      #2
print(lista3[0][1])     #14

# lista_new has the same list
lista_new = lista1
lista_new.append(-3)
print(lista1)

# cloning does not effect the new list
lista_clone = lista1[:]
lista_clone.append(-10)
print(lista1)
print(lista_clone)

'''
append is different than extend cause using append appends the object
extend it expects a list so it appends the single element of the list
'''

list_a = [1, 2, 3]
list_a.append([7, 8, 9])
print(list_a)
print(len(list_a))


list_b = [1, 2, 3]
list_b.extend([7, 8, 9])
print(list_b)
print(len(list_b))
