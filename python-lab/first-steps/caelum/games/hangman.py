print('*********************************')
print('***Welcome to the Hangman Game***')
print('*********************************')
print(' ')
print(' ')

secret_word = 'banana'
right_words = ['_', '_', '_', '_', '_', '_']


win = False
hanged = False
errors = 0

print(right_words)
print(' ')
print(' ')


while(not win and not hanged):
    shot = input('Which letter?')
    print(' ')

    if(shot in secret_word):
        position = 0
        for letter in secret_word:
            if (shot.upper() == letter.upper()):
                right_words[position] = letter
            
            position += 1
        win = '_' not in right_words
        hanged = errors == 6
    else:
        errors += 1
    
    print(right_words)
    print(' ')

if(win):
    print('You win!')
else:
    print('You loose!')

print('Game Over')