"""Receba o dia e o mês de nascimento de uma pessoa (em números). Utilizando if e elif
combinados com operadores lógicos, descubra e imprima o signo do zodíaco
correspondente daquela pessoa."""

mes = int(input("Digite o mês em que nasceu e pressione ENTER: "))
dia = int(input("Agora digite o dia em que nasceu e pressione ENTER: "))
signo = None

if (mes == 3 and dia >= 21) or (mes == 4 and dia <= 19):
    signo = "Áries"
    print(signo)
elif (mes == 4 and dia >= 20) or (mes == 5 and dia <= 20):
    signo = "Touro"
    print(signo)
elif (mes == 5 and dia >= 21) or (mes == 6 and dia <= 20):
    signo = "Gêmeos"
    print(signo)
elif (mes == 6 and dia >= 21) or (mes == 7 and dia <= 22):
    signo = "Câncer"
    print(signo)
elif (mes == 7 and dia >= 23) or (mes == 8 and dia <= 22):
    signo = "Leão"
    print(signo)
elif (mes == 8 and dia >= 23) or (mes == 9 and dia <= 22):
    signo = "Virgem"
    print(signo)
elif (mes == 9 and dia >= 23) or (mes == 10 and dia <= 22):
    signo = "Libra"
    print(signo)
elif (mes == 10 and dia >= 23) or (mes == 11 and dia <= 21):
    signo = "Escorpião"
    print(signo)
elif (mes == 11 and dia >= 22) or (mes == 12 and dia <= 21):
    signo = "Sagitário"
    print(signo)
elif (mes == 12 and dia >= 22) or (mes == 1 and dia <= 19):
    sigino = "Capricórnio"
    print(signo)
elif (mes == 1 and dia >= 20) or (mes == 2 and dia <= 18):
    signo = "Aquário"
    print(signo)
elif (mes == 2 and dia >= 19) or (mes == 3 and dia <= 20):
    print("Peixes")
    print(signo)
else:
    print("Data inválida")