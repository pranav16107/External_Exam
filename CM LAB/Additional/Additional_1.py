#* 1. Write a Python program to find the solution of a system of homogeneous linear 
#* equations and determine whether the system has trivial or non-trivial solutions. 
#* Consider the following system: x + y + z = 0 2x +2 y +2 z = 0 x - y + z = 0. 
import sympy as sp

A = sp.Matrix([[1, 1, 1],
               [2, 2, 2],
               [1, -1, 1]])

print("Matrix:")
sp.pprint(A)

if A.rank() == A.cols:
    print("Only Trivial Solution")
else:
    print("Non-Trivial Solutions")
