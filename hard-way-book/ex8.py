formatter = "{} {} {} {}" #create a string with 4 arguments

print(formatter.format(1, 2, 3, 4))
print(formatter.format("one", "two", "three", "four"))
print(formatter.format(True, False, False, True))
print(formatter.format(formatter, formatter, formatter, formatter)) # passing the string as an argument
print(formatter.format(
    "Who knows",
    "what the future holds?",
    "Be grateful",
    "for today"
))