#* 3. Write a Python program to solve problems based on Newton's Law of Cooling and Exponential Growth/Decay. Consider the following problems:
import math

# Given values
T0 = 100
Ts = 20
T10 = 80
t = 10
#! T=T_s+(T_0-T_s)e^{-kt}
# Calculate cooling constant
k = -math.log((T10 - Ts) / (T0 - Ts)) / t

# Calculate temperature after 20 minutes
time = 20
T20 = Ts + (T0 - Ts) * math.exp(-k * time)

# Display results
print("Newton's Law of Cooling")
print("Cooling Constant (k) =", round(k, 4))
print("Temperature after 20 minutes =", round(T20, 2), "°C")