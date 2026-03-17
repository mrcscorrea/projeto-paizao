from unittest import case

valor_total = float(input("Digite o valor total da compra: "))
print("1: Cliente Comum   2: Funcionário   3: Cliente VIP")

tipo_cliente = int(input("Digite o tipo do cliente: "))

match tipo_cliente:
    case 1:
        print(f"Você compra com 0 de desconto, logo o valor é de {valor_total}")
    case 2:
        valor_total *= 0.9
        print(f"Você comprou com 10% desconto, logo você paga {valor_total:.2f}")
    case 3:
        valor_total *= 0.95
        print(f"Você comprou com 5% de desconto, logo voc~e paga {valor_total:.2f}")
    case _:
        print("Opção inválida!")