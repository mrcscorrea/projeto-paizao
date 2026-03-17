print("Menu de Opções\n\n1: Picanha - 25,00\n2: Lasanha - 20,00\n3: Strogonoff - 20,00\n4: Bife Acebolado - 15,00\n5: Pão com Ovo - 5,00")
valor = 0
opcao = int(input("Digite o prato desejado e pressione ENTER para continuar: "))

match opcao:
    case 1:
        valor = 25.00
        prato = "Picanha"
    case 2:
        valor = 20.00
        prato = "Lasanha"
    case 3:
        valor = 20.00
        prato = "Strogonoff"
    case 4:
        valor = 15.00
        prato = "Bife Acebolado"
    case 5:
        valor = 5.00
        prato = "Pão com Ovo"
    case _:
        print("Opção inválida!")

gorjeta = input("Deseja pagar gorjeta de 10% ao garçom? (S/N): ").upper()

if gorjeta == "S":
    valor = valor + (valor * 0.1)
    print(f"Valor pago total: {valor}")
elif gorjeta == "N":
    valor = valor
    print(f"Valor pago total: {valor}")