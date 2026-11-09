#* 2.Write a Python program to obtain the eigenvalues and eigenvectors of a dynamically generated square matrix using Python. Consider the following 2 × 2 matrix:A = [[4  2][1  3]].

import sympy as sp
# Define matrix
A = sp.Matrix([[4, 2],
               [1, 3]])

lam = sp.symbols('lambda')
I = sp.eye(A.rows)

print("Given Matrix A:")
sp.pprint(A)

# Step 1: Finding Eigenvalues
print("\nSTEP 1: FINDING EIGENVALUES")
B = A - lam * I

print("\nA - lambda*I =")
sp.pprint(B)

poly = B.det()

print("\nCharacteristic Equation:")
sp.pprint(sp.Eq(poly, 0))

eigenvalues = sp.solve(poly, lam)

print("\nEigenvalues:", eigenvalues)

# Step 2: Finding Eigenvectors
print("\nSTEP 2: FINDING EIGENVECTORS")

for val in eigenvalues:
    print("\nFor Eigenvalue lambda =", val)
    
    print("\nSubstituting in (A - lambda*I):")
    M = A - val * I
    sp.pprint(M)

    print("\nSolving (A - lambda*I)V = 0")
    eigenvectors = M.nullspace()

    print("Eigenvectors:")
    for v in eigenvectors:
        sp.pprint(v)

print("\nFINAL RESULT")
print("Eigenvalues:", eigenvalues)
print("Eigenvectors are displayed above.")
