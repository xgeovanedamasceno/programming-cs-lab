n = int(input())
notas_de_cem = n // 100
resto_cem = n % 100
notas_de_cinq = resto_cem // 50
resto_cinq = resto_cem % 50
notas_de_vinte = resto_cinq // 20
resto_vinte = resto_cinq % 20
notas_de_dez = resto_vinte // 10
resto_dez = resto_vinte % 10
notas_de_cinco = resto_dez // 5
resto_cinco = resto_dez % 5
notas_de_dois =  resto_cinco // 2
resto_dois = resto_cinco % 2
notas_de_um = resto_dois 

print(f"{notas_de_cem} notas(s) de R$ 100,00")
print(f"{notas_de_cinq} notas(s) de R$ 50,00")
print(f"{notas_de_vinte} notas(s) de R$ 20,00")
print(f"{notas_de_dez} notas(s) de R$ 10,00")
print(f"{notas_de_cinco} notas(s) de R$ 5,00")
print(f"{notas_de_dois} notas(s) de R$ 2,00")
print(f"{resto_dois} notas(s) de R$ 1,00")

