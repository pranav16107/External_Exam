import numpy as np
from sympy import symbols, Eq, solve

# Coefficient matrix
A = np.array([[2, 1],
              [4, 2]])

# Constant matrix
B = np.array([4, 8])

# Check rank
rank_A = np.linalg.matrix_rank(A)
rank_AB = np.linalg.matrix_rank(np.column_stack((A, B)))

num_vars = A.shape[1]

print("Rank of A:", rank_A)
print("Rank of [A|B]:", rank_AB)
print("Number of variables:", num_vars)
print("Degree of freedom:", num_vars - rank_A)

# Check infinite solutions
if rank_A == rank_AB and rank_A < num_vars:
    print("Infinite Solutions: True")
else:
    print("Infinite Solutions: False")

# SymPy solution
x, y = symbols('x y')

eq1 = Eq(2*x + y, 4)
eq2 = Eq(4*x + 2*y, 8)

solution = solve([eq1, eq2], [x, y])
print("SymPy Solution:", solution)