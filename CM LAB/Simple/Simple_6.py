import sympy as sp

# Define variables
x, y, z = sp.symbols('x y z')

# Define the function
F = x**2*y + y**2*z**2 + sp.sin(x*z)

# Calculate partial derivatives
Fx = sp.diff(F, x)
Fy = sp.diff(F, y)
Fz = sp.diff(F, z)

# Calculate Jacobian matrix
J = sp.Matrix([Fx, Fy, Fz])

# Display results
print("Given Function:")
print(F)

print("\nPartial Derivative w.r.t x:")
print(Fx)

print("\nPartial Derivative w.r.t y:")
print(Fy)

print("\nPartial Derivative w.r.t z:")
print(Fz)

print("\nJacobian Matrix:")
sp.pprint(J)