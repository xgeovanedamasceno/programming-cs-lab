my_list = [12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3,-52]

print('List Size: {}'.format(len(my_list)))
print('')
#a) imprima o maior elemento
max_element = max(my_list)
print('Max Element: {}'.format(max_element))
print(' ')

#b) imprima o menor elemento
min_element = min(my_list)
print('Min Element: {}'.format(min_element))
print(' ')

#c) imprima os números pares
print ('Even Elements:')
for el in my_list:
    if ( el % 2 == 0 ):
        print(el)
print ('')


#d) imprima o número de ocorrências do primeiro elemento da lista
count = my_list.count(my_list[0])
print('Number of ocurrences: {}'.format(count))
print('')

#e) imprima a média dos elementos

average = 0
for el in my_list:
    average += el / len(my_list)

print ('Elements Average: {}'.format(average))



#f) imprima a soma dos elementos de valor negativo
negative_sum = 0
for el in my_list:
    if (el % 2 != 0):
        negative_sum += el

print('Negative Sum: {}'.format(negative_sum))