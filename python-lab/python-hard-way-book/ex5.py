name = 'Zed A. Shaw'
age = 35
height_inches = 74
height = round((height_inches * 2.54) / 100, 2)
weight_pounds = 180
weight = round(180 / 2.205, 2)
eyes = 'Blue'
teeth = 'White'
hair = 'Brown'

print(f"Let's talk about {name}.")
print(f"He's {height} meters tall.")
print(f"He's {weight} kg heavy.")
print(f"Actually that's not too heavy.")
print(f"He's got {eyes} eyes and {hair} hair.")
print(f"His teeth are usually {teeth} depending on the coofee.")

total = age + height + weight
print(f"If I add {age}, {height} and {weight} I get {total}")