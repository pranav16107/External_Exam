#* 8. Write a Python program to solve and identify whether a given differential equation 
#* is Exact or Non-Exact using partial differentiation. Consider the following differential 
#* equation: M(x, y)dx + N(x, y)dy Where,M(x, y) = 5x4+ 3x2y2 - 2xy3 N(x, y) = 2x3y-3x2y2-5y4. 
import sympy as sp

# Define variables
x, y = sp.symbols('x y')

# Define M and N
M = 5*x**4 + 3*x**2*y**2 - 2*x*y**3
N = 2*x**3*y - 3*x**2*y**2 - 5*y**4

print("Given Differential Equation: Mdx + Ndy = 0")

print("\nM =", M)
print("N =", N)

# Find partial derivatives
dM_dy = sp.diff(M, y)
dN_dx = sp.diff(N, x)

print("\nPartial derivative of M with respect to y:")
print(dM_dy)

print("\nPartial derivative of N with respect to x:")
print(dN_dx)

# Check exactness
check = sp.simplify(dM_dy - dN_dx)

print("\nExactness Check =", check)

if check == 0:

    print("\nThe Differential Equation is Exact")

    # Find potential function
    psi1 = sp.integrate(M, x)

    print("\nIntegration of M with respect to x:")
    print("Psi1 =", psi1)

    # Find the remaining function h(y)
    h = sp.integrate(N - sp.diff(psi1, y), y)

    print("\nRemaining function h(y) =")
    print(h)

    # Final potential function
    psi = sp.simplify(psi1 + h)

    print("\nPotential Function:")
    print("Psi(x,y) =", psi)

    print("\nGeneral Solution:")
    print("Psi(x,y) = C")

else:
    print("\nThe Differential Equation is Non-Exact")
