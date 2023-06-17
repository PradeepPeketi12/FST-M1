"""
Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

Bonus points if you can make the user enter their own tuple.
"""

tuple_values = (1, 5, 4, 10, 15)

for value in tuple_values:
    if value % 5 == 0:
        print(value)