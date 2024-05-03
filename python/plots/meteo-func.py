import numpy as np
import matplotlib.pyplot as plt

def f(x, y):
    return x**2 + y**2

x = np.linspace(-5, 5, 50)
y = np.linspace(-5, 5, 50)
X, Y = np.meshgrid(x, y)
Z = f(X, Y)

fig, ax = plt.subplots(1)
contour_img = ax.contour(X, Y, Z, cmap = "RdGy")
ax.clabel(contour_img, inline = True, fontsize = 8)

plt.show()