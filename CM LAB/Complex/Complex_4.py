import numpy as np
import matplotlib.pyplot as plt

# Define the function
def f(x):
    return x**3 - 4*x - 9

# Initial interval
a = 2
b = 3
e = 0.0001

# Check the interval
if f(a) * f(b) < 0:

    # Bisection Method
    while (b - a) / 2 > e:
        c = (a + b) / 2

        if f(c) == 0:
            break
        elif f(a) * f(c) < 0:
            b = c
        else:
            a = c

    print("Real Root =", c)

else:
    print("Root does not exist")

# Plot the graph
x = np.linspace(1, 4, 100)
y = f(x)

plt.plot(x, y)
plt.axhline(0)
plt.xlabel("x")
plt.ylabel("f(x)")
plt.title("Graph of Given Equation")
plt.grid()
plt.show()