import numpy as np
import sympy as sp
# Define coefficient matrix
A = np.array([[1, 2],
              [3, 4]])

# Calculate determinant
det = np.linalg.det(A)

print("Coefficient Matrix:")
print(A)

print("\nDeterminant =", round(det))

# Check the solution
if (det < 1e-10):
    print("\nSystem has only TRIVIAL solution.")
    print("Solution: x = 0, y = 0")
else:
    print("\nSystem has NON-TRIVIAL solution.")
    print("Non-zero solutions exist.")
