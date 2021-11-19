# Assigning 10 to a variable called types_of_people
types_of_people = 10

# Assigning a formated string with a value inside it to variable called x
x = f"There are {types_of_people} types of people."

# Putting two value inside a string
binary = "binary"
do_not =  "don't"
y = f"Those who know {binary} and those who {do_not}"

# printing the values of x and y
print(x)
print(y)


print(f"I said: {x}")
print(f"I also said: '{y}'")

hilarious = False

joke_evaluation = "Isn't that joke so funny! {}"

# using the format fuction to put a value inside a string
print(joke_evaluation.format(hilarious))

w = "This is the left side of..."
e = "a string with a right side."

# contactenating two strigns
print(w + e)