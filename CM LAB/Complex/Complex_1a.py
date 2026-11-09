import numpy as np

# Coefficient matrix
A = np.array([[2, 1],
              [1, 1]])

# Constant matrix
B = np.array([5, 3])

# Check determinant
if np.linalg.det(A) != 0:
    X = np.linalg.solve(A, B)

    print("Unique Solution")
    print("x =", X[0])
    print("y =", X[1])

    # Verification
    AX = A @ X

    print("\nVerification:")
    print("A @ X =", AX)
    print("B =", B)

    # Residual
    residual = B - (A @ X)

    print("\nResidual =", residual)

else:
    print("No Unique Solution")