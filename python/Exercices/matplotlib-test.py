#this is a test for the matplotlib.plot 
import matplotlib
import matplotlib.pyplot as plt
import numpy as np
plt.style.use("seaborn-v0_8-whitegrid") #to add the grid behind the function

# a = np.arange(50) + 10
# plt.plot(a)
# plt.show()


x = np.linspace(0, 10, 100)

fig, ax = plt.subplots(2)

ax[0].plot(x, np.cos(x), marker = '*', color = 'b')
ax[0].plot(x, np.tan(x), marker = 'o', color = 'g')
ax[1].plot(x, np.sin(x), color = 'r')
fig.savefig("my_first")
plt.show()