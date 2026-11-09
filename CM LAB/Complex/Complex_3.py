import sympy as sp

# Create the symmetric matrix
A = sp.Matrix([[1, 1, 3],
               [1, 5, 1],
               [3, 1, 1]])

print("1. Symmetric Matrix:")
sp.pprint(A)

# Find eigenvalues and eigenvectors
result = A.eigenvects()

print("\n2. Eigenvalues with Multiplicity:")
for value, multiplicity, vectors in result:
    print("Eigenvalue:", value, "Multiplicity:", multiplicity)

# Find eigenvectors
print("\n3. Eigenvectors:")
for value, multiplicity, vectors in result:
    print("For Eigenvalue:", value)
    sp.pprint(vectors[0])

# Normalize eigenvectors
print("\n4. Normalized Eigenvectors:")

normal_vectors = []
diagonal_values = []

for value, multiplicity, vectors in result:
    vector = vectors[0]
    normal = vector / vector.norm()

    normal_vectors.append(normal)
    diagonal_values.append(value)

    print("For Eigenvalue:", value)
    sp.pprint(normal)

# Form orthogonal matrix
P = sp.Matrix.hstack(*normal_vectors)

print("\n5. Orthogonal Matrix P:")
sp.pprint(P)

# Form diagonal matrix
D = sp.diag(*diagonal_values)

print("\n6. Diagonal Matrix D:")
sp.pprint(D)

# Verification
print("\n7. Verification:")

print("P transpose * P =")
sp.pprint(P.T * P)

print("\nP transpose * A * P =")
sp.pprint(P.T * A * P)

print("\nIs P transpose * A * P equal to D?")
print(sp.simplify(P.T * A * P) == D)