import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# month = ["gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto"]

# days_month = [31, 28, 31, 30, 31, 30, 31, 31,]

# s = pd.Series(days_month, index = month)

# print(s["gennaio" : "marzo"])


# def my_func(x, custom_param):
#     print("Elemento della serie: ", x)
#     return x**2 + custom_param

# print(s.apply(my_func, args = (5,)))
# s.plot(color = 'red')
# plt.show()


index = range(50)
values = np.random.normal(size = (50, ))
s = pd.Series(values, index = index)
s.plot.box()
plt.show()