"""
Importing argv from sys module

sys module provides access to some variable used or maintained by the interpreter
and to functions that interact strongly with the interpreter.

argv é um 'array de arguments' passed by commando line to a Python script.
argv[0] is the script name
"""
from sys import argv


"""
script and filename are variables. They will receive the arguments passed by comand line
script = argv[0] (script name: ex15.py)
filename = argv[1] input user
"""
script, filename = argv

"""
open built-in python function
open a file, return a corresponding file object and assigned to txt variable
"""
txt = open(filename)

print(f"Here's your file {filename}:")
print(f"It will open throught out this {script} script")

"""
read  txt value and print it
"""
print(txt.read())

txt.close()

print("Type the filename again:")
"""
read input keyboard and assigned to file_again variable
"""
file_again = input("> ") 


"""
open file and print it value
"""
txt_again = open(file_again
)
print(txt_again.read())

txt.close()
