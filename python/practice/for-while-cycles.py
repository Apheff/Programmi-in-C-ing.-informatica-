for i in [4, 5, 6, 7, 8]:
    print(i, end=', ')

print('')

for i in (2, 'ciao', 3.0, "Hello", 1):
    print(i, end=', ')

print('')

for i in "un programma python":
    print(i, end=', ')

print('')

for i in range(2, 11, 3):
    print(i, end=', ')

print('')

for i in range(30):
    print(i, end=', ')

print('')

for i in range(4):
    for j in range(3):
        print("i: ", i, "j: ", j)

print("")

i = 4

while i != 0:
    print(i)
    i = i - 1