numero = int(input("Digite um número: "))

match numero % 3:
    case 0:
        print(f"Seu número {numero} é múltiplo de três")
    case _:
        print(f"Seu número {numero} não é múltiplo de três")