from sys import argv

filename = argv[1]

txt = open(filename)

print(txt.read())