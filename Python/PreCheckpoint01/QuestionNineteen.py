"""Receba um número inteiro de 1 a 12. Usando match/case, imprima o nome do mês
correspondente. Você pode agrupar os casos (usando o operador | no case) para informar
se o mês tem 30, 31 dias ou 28/29 dias (fevereiro)"""

mes = int(input("Digite um número de 1 a 12 e pressione ENTER: "))

match mes:
    case 1:
        print("Janeiro")
    case 2:
        print("Fevereiro")
    case 3:
        print("Março")
    case 4:
        print("Abril")
    case 5:
        print("Maio")
    case 6:
        print("Junho")
    case 7:
        print("Julho")
    case 8:
        print("Agosto")
    case 9:
        print("Setembro")
    case 10:
        print("Outubro")
    case 11:
        print("Novembro")
    case 12:
        print("Dezembro")
    case _:
        print("Número inválido")

match mes:
    case 4 | 6 | 9 | 11:
        print("É um mês de 30 dias")
    case 1 | 3 | 5 | 7 | 8 | 10 | 12:
        print("É um mês de 31 dias")
    case 2:
        print("É um mês que tem 28 ou 29 dias")