import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(0, 10, 100)
ax = plt.axes()

ax.plot(x, np.cos(x), color = "r", linestyle = "*", label = "coseno")
ax.plot(x, np.tan(x), color = "g", label = "tangente")
ax.set(title = "Funzione coseno", xlabel = "x", ylabel = "f(x)")
ax.legend()
plt.show()