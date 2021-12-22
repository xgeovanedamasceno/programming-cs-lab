from sys import argv

script, input_file = argv

def print_all(f):
    print(f.read())

def rewind(f):
    f.seek(0)
"""
returns the current file position or the new position in a file stream
What does it main? It means that the seek method move the read/write location to a position of file
"""

def print_a_line(line_count, f):
    print(line_count, f.readline())

current_file = open(input_file)

print("First let's print the whole file:\n")

print_all(current_file)

print("Now let's rewind, kind of like a tape.")

rewind(current_file)

print("Let's print three lines:")

current_line = 1
print_a_line(current_line, current_file)

current_line = current_line + 1
print_a_line(current_line, current_file) # current_line = 2

current_line += 1
print_a_line(current_line, current_file) # current_line = 3

rewind(current_file)

current_line = 1
print_a_line(current_line, current_file)

print(current_file.readline())
print(current_file.readline())
print(current_file.readline())

rewind(current_file)

print(current_file.readline())
