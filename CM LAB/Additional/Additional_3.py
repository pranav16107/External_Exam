#* 3. Write a Python program to find the maxima and minima of a given function of two 
#* variables using partial differentiation and the second-order derivative test. Consider 
#* the following function: f(x, y) = x2 + y2  - 4x - 6y  +13.
import sympy as sp

x, y = sp.symbols('x y')

f = x**2 + y**2 - 4*x - 6*y + 13

# First partial derivatives
fx = sp.diff(f, x)
fy = sp.diff(f, y)

print("First Derivatives:", fx, fy)

# Critical point
p = sp.solve([fx, fy], (x, y))
print("Critical Point:", p)

# Second partial derivatives
fxx = sp.diff(f, x, 2)
fyy = sp.diff(f, y, 2)
fxy = sp.diff(f, x, y)

print("Second Derivatives:", fxx, fyy, fxy)

# Discriminant
D = fxx*fyy - fxy**2
print("Discriminant:", D)

print("Function Value:", f.subs(p))

# Result
if D > 0 and fxx > 0:
    print("Local Minimum")
elif D > 0 and fxx < 0:
    print("Local Maximum")
elif D < 0:
    print("Saddle Point")
else:
    print("Inconclusive")
