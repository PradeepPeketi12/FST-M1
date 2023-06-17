"""
Ask the user for a number.
Depending on what number they enter, tell them if the number is an even or odd number.
"""

num = int(input("enter number"))
if num%2 == 0:
    print("even")
else:
    print("odd")