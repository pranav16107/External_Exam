# *(b) Case 2: Infinite Solutions
# * Consider the following system of non-homogeneous linear equations:2x+y=4 4x+2y=8.
import sympy as sp

A = sp.Matrix([[2, 1],
               [4, 2]])

B = sp.Matrix([4, 8])

r1 = A.rank()
r2 = A.row_join(B).rank()

print("Rank of A:", r1)
print("Rank of [A|B]:", r2)
print("Degree of Freedom:", A.cols - r1)

if r1 != r2:
    print("No Solution")
elif r1 == A.cols:
    print("Unique Solution")
else:
    print("Infinite Solutions")

x, y = sp.symbols('x y')
eq1=2*x+y-4
eq2=4*x+2*y-8
solution=sp.solve([eq1, eq2], [x, y])
print("Solution:",solution )