#* 4. Write a Python program to find the real root of a given transcendental equation 
#* using the Newton-Raphson Method. Consider the following equation: 
#* f(x) = e-x - x = 0 
#* Take the initial approximation as: X0 = 0 
#* Perform 5 iterations to obtain the approximate real root.
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
