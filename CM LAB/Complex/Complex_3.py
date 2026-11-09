#* 3. Write a Python program to obtain the symmetric matrix from a given quadratic 
#* form and orthogonalize the matrix using eigenvalues and eigenvectors. Consider the 
#* following quadratic form: Q(x, y, z) = x2 + 5y2  + z2  + 2xy + 6xz + 2yz.

import sympy as sp

# Step 1: Create symmetric matrix
A = sp.Matrix([[1, 1, 3],
               [1, 5, 1],
               [3, 1, 1]])

print("Symmetric Matrix A:")
sp.pprint(A)

# Step 2: Find eigenvalues and eigenvectors
result = A.eigenvects()

values = []
vectors = []

print("\nEigenvalues and Eigenvectors:")

for value, mult, vec in result:
    print("Eigenvalue =", value)
    print("Eigenvector:")
    sp.pprint(vec[0])

    values.append(value)
    vectors.append(vec[0])

# Step 3: Normalize eigenvectors
normal_vectors = []

for v in vectors:
    normal = v / v.norm()
    normal_vectors.append(normal)

print("\nNormalized Eigenvectors:")
for v in normal_vectors:
    sp.pprint(v)

# Step 4: Form orthogonal matrix P
P = sp.Matrix.hstack(*normal_vectors)

print("\nOrthogonal Matrix P:")
sp.pprint(P)

# Step 5: Form diagonal matrix D
D = sp.diag(*values)

print("\nDiagonal Matrix D:")
sp.pprint(D)

# Step 6: Verify orthogonal diagonalization
print("\nP transpose * P:")
sp.pprint(sp.simplify(P.T * P))

print("\nP transpose * A * P:")
sp.pprint(sp.simplify(P.T * A * P))

# Step 7: Transform quadratic form
y1, y2, y3 = sp.symbols('y1 y2 y3')
Y = sp.Matrix([y1, y2, y3])

X = P * Y

print("\nTransformation X = PY:")
sp.pprint(X)

original = (X.T * A * X)[0]
diagonal = (Y.T * D * Y)[0]

print("\nOriginal Quadratic Form:")
sp.pprint(sp.expand(original))

print("\nDiagonal Quadratic Form:")
sp.pprint(diagonal)

# Final verification
if sp.simplify(original - diagonal) == 0:
    print("\nVerification Successful")
else:
    print("\nVerification Failed")
