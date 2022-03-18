import ipdb

def create_list_of_numbers(max, increment):
  numbers = []

  for i in range(0, max, increment):
    
      ipdb.set_trace()
      numbers.append(i)

      print(f"before increment {i}")

  
      
      print(f"after increment {i}")
      
      #print("Numbers now: ", numbers)
      
  
  return numbers

numbers = create_list_of_numbers(10,2)

print("The numbers: ")

for num in numbers:
  print(num)