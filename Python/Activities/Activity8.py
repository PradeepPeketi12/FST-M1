"""
Given a list of numbers, return True if first and last number of a list is same.

Bonus points if you can make the user enter their own list.
"""

input_values = list(input("enter values by separating with comma").split(","))

if input_values[0] == input_values[len(input_values)-1]:
    print("both values are same")
else:
    print("both values are not same")
