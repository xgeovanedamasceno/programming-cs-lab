names = ("Jonh", "Mary", "Patrick")
ages = (17, 23, 34)

zipped = zip(names, ages)

#print(tuple(zipped))

lipped = zip(names, ages)

#print(list(lipped))

for(x,y) in lipped:
    print(x,y)


