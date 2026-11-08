# Newton-Raphson Method
def f(x):
    return x**3 - 4*x - 9

def df(x):
    return 3*x**2 - 4

x = 3  # Initial guess
n = 10  # Number of iterations

print("Newton-Raphson Method")
print("Iteration\tRoot")

for i in range(n):
    x = x - f(x) / df(x)
    print(i+1, "\t\t", round(x, 6))

print("\nReal Root =", round(x, 6))