# Python - Hard Way Book

This repository contains Python code through some exercises to practice syntax.

## 1. Comando para executar scripts Python

```
python3 file.py

```

## 2. end = ' '

```
print("How old are you?", end=' ')
age = input()
```

Basically, tells to print function to not 'start a newline' or 'to continue on the same line'.


## 3. pydoc

comand
```
python3 -m pydoc ...
```

## 4.  Python seek() function

it is used to change the position of the File Handle to given specific position. File Handle
is like a cursor, which defines from where the data has to be read or written in the file.


Syntax: f.seek(offset, from_what), where f is file pointer
Parameters:
  offset: number of positions to move forward
  from_what: it defines point of reference
  returns: does not return any value

The reference is selected by the **from_what** argument. It accepts three values:

- **0:** sets the reference point at the beginning of the file
- **1:** sets the reference point at the current file position
- **2:** sets the reference point at the end of the file

f.seek() deal with bytes, not lines.(**?)

By default from_what argument is set to 0.
**Note:** Reference point at current position / end of file cannot be set in text mode except when offset is equal to 0.

**from:** https://www.geeksforgeeks.org/python-seek-function/

## 5. Symbol Review

