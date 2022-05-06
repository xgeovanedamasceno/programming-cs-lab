# conversão de tempo
n = int(input())
horas = n // 3600
resto_hora = n % 3600
minutos = resto_hora // 60
segundos = resto_hora % 60
print(f"{horas}:{minutos}:{segundos}")
