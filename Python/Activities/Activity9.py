"""
Given a two list of numbers create a new list such that new list
should contain only odd numbers from the first list and even numbers from the second list
"""

list1 = [1, 3, 2, 5, 8]
list2 = [4, 6, 7, 9]

result = []

for value in list1:
    if value % 2 != 0:
        result.append(value)

for value in list2:
    if value % 2 == 0:
        result.append(value)

print(result)