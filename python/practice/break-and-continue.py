sum = 0
for i in range(20):
    sum += 1
    if sum > 10:
        break

print("Somma finale", sum)




product = 1
num_list = [1, 4, 6, 9.0, 0.0, 100]
num_element = len(num_list)
i = 0

while i < num_element:
    current_element = num_list[i]
    i += 1
    if current_element == 0.0:
        continue                    #continua il ciclo while saltando solo un azione

    product *= current_element

print("Prodotto finale:", product)
