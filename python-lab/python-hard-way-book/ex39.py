states = {
    'Oregon': 'OR',
    'Florida': 'FL',
    'California': 'CA',
    'New Yourk': 'NY',
    'Michigan': 'MI'
}

cities = {
    'CA': 'San Francisco',
    'MI': 'Detroit',
    'FL': 'Jacksonville'
}

cities['NY'] = 'New York'
cities['OR'] = 'Portland'

print('-' * 10)
print("Print out some cities:")
print("NY State has: ", cities['NY'])
print('OR State has: ', cities['OR'])

print('-' * 10)
print("Print some states:")
print("Michigan's abbreviation is: ", states['Michigan'])
print("Florida's abbreviation is: ", states['Florida'])

print("-" * 10)
print("Print states and cities:")
print("Michigan has: ", cities[states['Michigan']])
print("Florida has: ", cities[states['Florida']])

print("-" * 10)
print("Print every state abbreviation:")
for state, abbrev in list(states.items()):
    print(f"{state} is abbreviated {abbrev}")

print("-" * 10)
print("Print every city in state:")
for abbrev, city in list(cities.items()):
    print(f"{abbrev} has the city {city}")

print("-" * 10)
print("Print both at the same time:")
for state, abbrev in list(states.items()):
    print(f"{state} state is abbreviated {abbrev}")
    print(f"and has city {cities[abbrev]}")

print("-" * 10)
print("Get a abbreviation by state that might no be there:")
state = states.get("Texas")

if not state:
    print("Sorry, no Texas.")

print("-" * 10)
print("Get a city with a default value")
city = cities.get("TX", "Does not exist")
print(f"The city for the state 'TX' is: {city}")

print("*" * 50)
print("*" * 50)

print("My Dict:")

my_dict = {
    "color": "yellow",
    "number": "12",
    "color": "pink",
    "real number": 3.23,
    777: "perfection"
}

print(my_dict)