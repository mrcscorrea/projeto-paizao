numero = int(input("Digite um numero: "))
print("Menu de Cálculos\n\n1: Dobrar o número\n2: Dividir o número pela metade\n3: Mostrar apenas 10% do número")
opcao = int(input("Digite uma opção: "))
operacao = 0
match opcao:
    case 1:
        operacao = numero*2
        print(f"Seu número {numero} após a opção foi {operacao}")
    case 2:
        operacao = numero/2
        print(f"Seu número {numero} após a opção foi {operacao}")
    case 3:
        operacao = numero*0.1
        print(f"Seu número {numero} após a opção foi {operacao}")