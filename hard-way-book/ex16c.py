from sys import argv

filename = argv[1]

file_mode = open(filename, 'b')

print(file_mode.read())