#* 4.Write a Python program to solve a given homogeneous ordinary differential equation (ODE) . Consider the following differential equation:dy/dx = x+y/x-y

import sympy as sp

# Define variables and function
x = sp.Symbol('x')
y = sp.Function('y')(x)

# Define the differential equation
eq = sp.Eq(sp.diff(y, x),(x + y) / (x - y))

# Solve the differential equation
solution = sp.dsolve(eq, y)

# Display the solution
print("Given Differential Equation:")
sp.pprint(eq)

print("\nSolution:")
sp.pprint(solution)