# * 1. Write a Python program to find the solution of a system of homogeneous linear equations and determine whether the system has a trivial or non-trivial solution using the determinant method. Consider the following 2 × 2 coefficient matrix:
#* A =[ [1  2] [3  4]].

import sympy as sp

# Define coefficient matrix
A = sp.Matrix([[1, 2],
               [3, 4]])

# Calculate determinant
det = A.det()

print("Coefficient Matrix:")
sp.pprint(A)

print("\nDeterminant =", det)

# Check the solution
if det != 0:
    print("\nSystem has only TRIVIAL solution.")
    print("Solution: x = 0, y = 0")
else:
    print("\nSystem has NON-TRIVIAL solution.")
    print("Non-zero solutions exist.")
