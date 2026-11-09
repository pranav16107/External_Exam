# * Write a Python program to solve a given non-homogeneous ordinary differential equation (ODE) using the appropriate mathematical method. Consider the following differential equation:d ^ 2 * y / d * x ^ 2 - 3 * d/dx (y) + 2y = e ^ x

import sympy as sp

# Define variables and function
x = sp.Symbol('x')
y = sp.Function('y')(x)

# Define the differential equation
eq = sp.Eq(sp.diff(y, x, 2) - 3*sp.diff(y, x) + 2*y,sp.exp(x))

# Solve the differential equation
solution = sp.dsolve(eq, y)

# Display the solution
print("Given Differential Equation:")
print(eq)

print("\nSolution:")
print(solution)