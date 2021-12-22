def cheese_and_crackers(cheese_count, boxes_of_crackers):
    print(f"You have {cheese_count} cheeeses!")
    print(f"You have {boxes_of_crackers} boxes of crackers")
    print("Man that's enough for a party!")
    print("Get a blank.\n")

print("We can just give the function numbers directly:")
cheese_and_crackers(20, 30) # passing numbers as arguments

print("Or, we can use variables from our script")
amount_of_cheese = 10
amount_of_crackers = 50

cheese_and_crackers(amount_of_cheese, amount_of_crackers) # passing variables directly

print("we can even do math inside too:")
cheese_and_crackers(10 + 29, 4 + 8) # passing a sum calc as arguments

print("And we can combine the two, variables and math: ")
# passing a sum calc combining variables and numbers directly as arguments
cheese_and_crackers(amount_of_cheese + 100, amount_of_crackers + 1000)

input_cheese = input("Type amount of cheese: ")
input_crackers = input("Type amount of crackers: ")

print("\nYou type:")
cheese_and_crackers(input_cheese, input_crackers)

print("\nBut is possible sum what you type?")
cheese_and_crackers(input_cheese + input_crackers, input_crackers + input_cheese)

print("\nOh no, It's necessary to convert the input to int. Doing again...")
input_cheese = int(input("Type amount of cheese: "))
input_crackers = int(input("Type amount of crackers: "))
cheese_and_crackers(input_cheese + input_crackers, input_crackers + input_cheese)

