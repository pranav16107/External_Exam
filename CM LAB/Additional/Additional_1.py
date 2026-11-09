
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
