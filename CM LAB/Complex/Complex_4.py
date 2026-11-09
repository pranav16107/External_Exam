#* 4.Write a Python program to find the real root of a given algebraic/transcendental 
#* equation using the Bisection Method and plot the graph of the given equation. 
#* Consider the following algebraic equation:f(x) = x3-4x-9=0 
#* Take the initial interval as: a=3, b=2. 
import numpy as np
import matplotlib.pyplot as plt

# Define function
def f(x):
    return x**3 - 4*x - 9

# Initial values
a = 2
b = 3
n = 15

iterations = []
roots = []

# Bisection Method
if f(a) * f(b) < 0:

    print("Iteration\t a\t\t b\t\t c\t\t f(c)")

    for i in range(1, n+1):
        c = (a + b) / 2

        iterations.append(i)
        roots.append(c)

        print(i, "\t\t", round(a, 6), "\t",
              round(b, 6), "\t", round(c, 6), "\t",
              round(f(c), 6))

        if f(a) * f(c) < 0:
            b = c
        else:
            a = c

    print("\nApproximate Root =", round(c, 6))

else:
    print("Root does not exist")

# Graph 1: Bisection Method Visualization
x = np.linspace(1, 4, 100)
y = f(x)

plt.plot(x, y)
plt.axhline(0)
plt.scatter(c, f(c), color='red')
plt.xlabel("x")
plt.ylabel("f(x)")
plt.title("Bisection Method Visualization")
plt.grid()
plt.show()

# Graph 2: Convergence Graph
plt.plot(iterations, roots, 'o-')
plt.xlabel("Iteration")
plt.ylabel("Root")
plt.title("Convergence of Bisection Method")
plt.grid()
plt.show()
