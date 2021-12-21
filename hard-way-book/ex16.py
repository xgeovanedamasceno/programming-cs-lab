from sys import argv

script, filename = argv

print(f"We're going to erase {filename}")
print("Hit CTRCL-C to stop.")
print("To continnues, hit ENTER.")

input("Option? ")

print("Opening the file...")
target = open(filename, 'w')

print("Truncating the file. Goodbye!")
"""
this is not necessary because open a file with mode 'w' trucating the file if
it already exists
"""
target.truncate()


print("Now I'm going to ask you for three lines.")

line1 = input("line 1: ")
line2 = input("line 2: ")
line3 = input("line 3: ")

print("I'm going to write these to the file.")

target.write(f"{line1} \n {line2} \n {line3}")

print("And finnaly, we close it.")
target.close()