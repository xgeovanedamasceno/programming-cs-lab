print('***************************')
print('*     Guessing Game       *')
print('***************************')

secret_number = 42
total_attempts = 0
round_game = 1
score = 1000

print("Let's play!")

level = int (input("say your level (1, 2 or 3): "))

if (level == 1):
    total_attempts = 6
elif (level == 2):
    total_attempts = 4
elif (level == 3):
    total_attempts = 3
else:
    total_attempts = 1


for round_game in range(1, total_attempts + 1):
   

    print ('Attempts {} de {}'.format(round_game, total_attempts))

    
    
    shot = int (input ("Type your shot: "))
    print ('You typed: ', shot)

    right = shot == secret_number
    greater = shot > secret_number
    less = shot < secret_number

    if (right):
        print ("You're right!")
        break
    elif (greater):
        dif = abs(shot - secret_number)
        score -= dif
        print ("You're wrong! Your shot is greater than secret number")
        print ("You lose {} points. Your poins now: {}".format(dif, score))
    elif (less):
        dif = abs(shot - secret_number)
        score -= dif
        print ("You're wrong! Your shot is less than secret number")
        print ("You lose {} points. Your poins now: {}".format(dif, score))


print("Game Over.")
