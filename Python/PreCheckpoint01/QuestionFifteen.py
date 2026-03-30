"""Peça o valor de um saque (número inteiro). Verifique se o valor pode ser sacado com
notas de 100, 50, 20, 10, 5 e 2 reais. Se não for possível (ex: valor 1 ou 3), informe um
erro. Caso contrário, calcule e exiba quantas notas de cada valor serão entregues ao
cliente."""

valor = int(input("Digite o valor a se sacar e pressione ENTER: "))

if valor == 1 or valor == 3 or valor <= 0:
    print("O valor digitado foi incorreto.")
else:
    nota_100 = valor // 100
    valor = valor % 100

    nota_50 = valor // 50
    valor = valor % 50

    nota_20 = valor // 20
    valor = valor % 20

    nota_10 = valor // 10
    valor = valor % 10

    nota_5 = valor // 5
    valor = valor % 5

    nota_2 = valor // 2
    valor = valor % 2

    if valor != 0:
        print("Não é possível sacar esse valor.")
    else:
        print("Notas entregues:")
        print("Notas de 100:", nota_100)
        print("Notas de 50:", nota_50)
        print("Notas de 20:", nota_20)
        print("Notas de 10:", nota_10)
        print("Notas de 5:", nota_5)
        print("Notas de 2:", nota_2)