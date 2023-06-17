fruits = {
    "Mango" : 100,
    "Apple" : 200,
    "Banana" : 60
}
key_to_check = input("What are you looking for? ")

if(key_to_check in fruits):
    print("Yes, this is available")
else:
    print("No, this is not available")