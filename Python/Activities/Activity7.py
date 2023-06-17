"""
Write a Python program to calculate the sum of all the elements in a list.

Bonus points if you can make the user enter their own list.
"""

input_value = list(input("enter values by separating comma").split(","))
sum = 0
for value in input_value:
    sum += int(value)
print(sum)