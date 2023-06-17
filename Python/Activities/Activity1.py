"""
Activity1
Write a program that asks the user to enter their name and their age.
"""

name = input("enter name")
age = input("enter age")
txt = "My name is {}. My age is {}"
print(txt.format(name, age))
"""
Activity1
Print out a message addressed to them that tells them the year that they will turn 100 years old
"""

age = int(input("enter your age"))

result = int((2023-age)+100)

print(result)