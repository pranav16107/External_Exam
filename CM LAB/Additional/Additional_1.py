#* 1. Write a Python program to find the solution of a system of homogeneous linear 
#* equations and determine whether the system has trivial or non-trivial solutions. 
#* Consider the following system: x + y + z = 0 2x +2 y +2 z = 0 x - y + z = 0. 

import sympy as sp

# Define coefficient matrix
A = sp.Matrix([[1, 1, 1],
               [2, 2, 2],
               [1, -1, 1]])

print("Coefficient Matrix:")
sp.pprint(A)

# Find determinant
det = A.det()

print("\nDeterminant =", det)

# Check solutions
if det != 0:
    print("Only Trivial Solution")
else:
    print("Non-Trivial Solutions")

    solution = A.nullspace()
    print("Solutions:")
    sp.pprint(solution)
