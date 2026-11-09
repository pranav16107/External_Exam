
# Jacobi Iterative Method

# Initial values
x = 0
y = 0
z = 0

# Tolerance
e = 0.000001

iteration = 0

print("Iteration\t x\t\t y\t\t z")

while True:

    # Calculate new values
    x1 = (12 - y - z) / 10
    y1 = (13 - 2*x - z) / 10
    z1 = (14 - 2*x - 2*y) / 10

    iteration = iteration + 1

    print(iteration, "\t\t", round(x1, 6), "\t", round(y1, 6), "\t", round(z1, 6))

    # Calculate error
    error = max(abs(x1-x), abs(y1-y), abs(z1-z))

    # Update values
    x = x1
    y = y1
    z = z1

    # Check convergence
    if error < e:
        print("\nSolution Converged")
        print("x =", round(x, 6))
        print("y =", round(y, 6))
        print("z =", round(z, 6))
        break
