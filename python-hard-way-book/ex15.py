# import argv function from sys module
from sys import argv

# assign argv values to variables
script, filename = argv

# use open function to open file
txt = open(filename)

print(f"Here's your file {filename}:")
print(txt.read()) # read the content file and put it screen
print(txt.read()) # read the content file and put it screen
print(txt.read()) # read the content file and put it screen


#print("Type the filename again:")
#file_again = input("> ")

#txt_again = open(file_again)

#print(txt_again.read())
#print(txt_again.read())
