
import math

def f(x):
    return math.exp(-x) - x

def df(x):
    return -math.exp(-x) - 1

x = 0

for i in range(5):
    x = x - f(x)/df(x)
    print("Iteration", i+1, ":", x)

print("Approximate Root:", x)
