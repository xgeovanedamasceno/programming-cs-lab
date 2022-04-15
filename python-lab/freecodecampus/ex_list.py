empty_list = []

# filled list
programming_lang = ['P','Y','T','H','O','N']
print(programming_lang)

# accessing items in a list
print("At index 0: ", programming_lang[0])
print("At index 3: ", programming_lang[3])
print("Last item:  ", programming_lang[-1])
print("At index -4:", programming_lang[-4])

# fiding the size of a list
print("Length of List: ", len(programming_lang))

odd_numbers = [1,3,5,7,9]
print("List of odd:", odd_numbers)

# inserting numbers
odd_numbers.insert(3, 21)
print("List of odd:", odd_numbers)

# add an element at the end
odd_numbers.append(17)
print("List of odd:", odd_numbers)

# add multiple elements
more_odd_numbers = [22,23,24]
odd_numbers.extend(more_odd_numbers)
print("List of odd:", odd_numbers)

# add a list inside another list
test_numbers = [99,97,95]
odd_numbers.append(test_numbers)
print(odd_numbers)

# slicing a list
print(programming_lang[1:5])
print(programming_lang[:len(programming_lang)])
print(programming_lang[0:])

print("-------------------------------")
list_a = [99,100,101]
list_b = [103,104,105]

# starting from last index +1, add items from list B
list_a[len(list_a):] = list_b
print('list_a =', list_a)


#combining arrays using the + operator
odd = [1,3,5,7]
even = [2,4,6,8]

odd += even

print("odd and even combined= ", odd)

# filling an empty list with for and append

# Return area of square
# Area of square = length x length
def square_area(side_length):
    result = []
    for length in side_length:
        result.append(length*length)
    return result

lengths = [1,4,9,20]
print(square_area(lengths))

# filling an empty list using list comprehension

def xsquare_area(side_length):
    return [length*length for length in side_length]

xlengths = [1,4,9,20]
print(xsquare_area(xlengths))

# append() vs insert() vs extend()