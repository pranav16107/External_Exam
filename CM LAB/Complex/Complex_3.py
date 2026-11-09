#* 3. Write a Python program to obtain the symmetric matrix from a given quadratic 
#* form and orthogonalize the matrix using eigenvalues and eigenvectors. Consider the 
#* following quadratic form: Q(x, y, z) = x2 + 5y2  + z2  + 2xy + 6xz + 2yz.


import sympy as sp

# Step 1: Create matrix
A = sp.Matrix([[1, 1, 3],
               [1, 5, 1],
               [3, 1, 1]])

print("Given Matrix A:")
sp.pprint(A)

# Step 2: Find eigenvalues and eigenvectors
data = A.eigenvects()

values = []
vectors = []

print("\nEigenvalues and Eigenvectors:")

for value, mult, vec in data:
    print("Eigenvalue =", value)
    print("Eigenvector:")
    sp.pprint(vec[0])

    values.append(value)
    vectors.append(vec[0])

# Step 3: Normalize eigenvectors
normal_vectors = []

for v in vectors:
    u = sp.simplify(v / sp.sqrt((v.T*v)[0]))
    normal_vectors.append(u)

print("\nNormalized Vectors:")
for v in normal_vectors:
    sp.pprint(v)

# Step 4: Create orthogonal matrix P
P = sp.Matrix.hstack(*normal_vectors)

print("\nOrthogonal Matrix P:")
sp.pprint(P)

# Step 5: Create diagonal matrix D
D = sp.diag(*values)

print("\nDiagonal Matrix D:")
sp.pprint(D)

# Step 6: Check matrices
print("\nP transpose * P:")
sp.pprint(sp.simplify(P.T * P))

print("\nP transpose * A * P:")
sp.pprint(sp.simplify(P.T * A * P))

# Step 7: Change variables X = PY
y1, y2, y3 = sp.symbols('y1 y2 y3')
Y = sp.Matrix([y1, y2, y3])

X = sp.simplify(P * Y)

print("\nNew Variables X = PY:")
sp.pprint(X)

# Step 8: Find quadratic forms
q1 = sp.simplify((X.T * A * X)[0])
q2 = sp.simplify((Y.T * D * Y)[0])

print("\nOriginal Quadratic Form:")
sp.pprint(q1)

print("\nDiagonal Quadratic Form:")
sp.pprint(q2)

# Step 9: Final check
if sp.simplify(q1 - q2) == 0:
    print("\nVERIFIED")
else:
    print("\nNOT VERIFIED")
