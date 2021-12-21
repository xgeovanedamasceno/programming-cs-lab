from sys import argv

filename = argv[1]

txt = open(filename, 'a')

line1 = input("line 1: ")
line2 = input("line 2: ")
line3 = input("line 3: ")

txt.write(f"{line1} \n {line2} \n {line3}")
txt.write("\n")

txt.close()


txt = open(filename)
print(txt.read())

txt.close()