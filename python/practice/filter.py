num_list = [1, 2, 5, 7, 9]

filtered_list = [n for n in num_list if n > 2]

print(filtered_list)

transformed_list = [n**2 for n in num_list]

print(transformed_list)

filtered_and_transformed_list = [n**2 for n in num_list if n < 2]

print(filtered_and_transformed_list)


'''
i filtri sono comodi per non fare cicli for inutili e lunghi

filtered_list = [n for n in num_list if n > 2]

-ESEMPIO:
'''

filtered_list = []

for n in num_list:
    if n > 2:
        filtered_list.append(n)

print(filtered_list)
