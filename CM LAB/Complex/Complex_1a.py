#* 1. Write a Python program to find the solution of a system of non-homogeneous linear equations and determine whether the system has a unique solution or infinitely many solutions. Consider the following two cases:
#* (a) Case 1: Unique Solution
#* Consider the following system of non-homogeneous linear equations:2x+y=5 & x+y=3.

import numpy as np

# Coefficient matrix
A = np.array([[2, 1],[1, 1]])

# Constant matrix
B = np.array([5, 3])

# Check determinant
if np.linalg.det(A) != 0:
    X = np.linalg.solve(A, B)

    print("Unique Solution")
    print("x =", X[0])
    print("y =", X[1])

    # Verification
    print("\nVerification:")
    AX = A @ X
    print("A @ X =", AX)
    print("B =", B)

    # Residual
    residual = B - (A @ X)

    print("\nResidual =", residual)

else:
    print("No Unique Solution")