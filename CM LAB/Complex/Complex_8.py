
import sympy as sp

# Define variables
x, y = sp.symbols('x y')

# Given function
f = x**2 + y**2 - x*y - 6*y + 13

print("Given Function:")
print("f(x,y) =", f)

# First order partial derivatives
fx = sp.diff(f, x)
fy = sp.diff(f, y)

print("\nFirst Partial Derivatives:")
print("fx =", fx)
print("fy =", fy)

# Find critical points
critical_points = sp.solve([fx, fy], (x, y))

print("\nCritical Points:")
print(critical_points)

# Second order partial derivatives
fxx = sp.diff(fx, x)
fyy = sp.diff(fy, y)
fxy = sp.diff(fx, y)

print("\nSecond Partial Derivatives:")
print("fxx =", fxx)
print("fyy =", fyy)
print("fxy =", fxy)

# Second derivative test
D = fxx * fyy - fxy**2

print("\nDiscriminant D =", D)

# Check critical point
x_value = critical_points[x]
y_value = critical_points[y]

function_value = f.subs({x: x_value, y: y_value})

print("\nCritical Point:", (x_value, y_value))
print("Function Value:", function_value)

if D > 0 and fxx > 0:
    print("Result: Local Minimum")
elif D > 0 and fxx < 0:
    print("Result: Local Maximum")
elif D < 0:
    print("Result: Saddle Point")
else:
    print("Result: Test is Inconclusive")
