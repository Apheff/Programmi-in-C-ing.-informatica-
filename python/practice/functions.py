def squared_sum(a, b):
    return (a + b)**2

x = 2
y = 4

''' remember that the function you invoke has to be defined before '''

print(squared_sum(x, y))


''' 
the functions are objects

value = squared_sum
print(value(x, y))

'''

def sum_diff_and_squared_sum(a, b):
    sum_value = a + b
    diff_value = a - b
    squared_sum_value = (a + b)**2
    return sum_value, diff_value, squared_sum_value
''' it creates a tuple '''

x = 2
y = 4

result = sum_diff_and_squared_sum(x, y)
print(type(result))
print(result)

sum_res, diff_res, squared_res = sum_diff_and_squared_sum(x, y)
print(sum_res)
print(diff_res)
print(squared_res)