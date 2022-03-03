

def create_list_of_numbers(max, increment):
  i = 0
  numbers = []

  while i < max:
    print(f"At the top i is {i}")
    numbers.append(i)

    i = i + increment

    print("Numbers now: ", numbers)
    print(f"At the bottom i is {i}")
  
  return numbers

numbers = create_list_of_numbers(10,2)

print("The numbers: ")

for num in numbers:
  print(num)