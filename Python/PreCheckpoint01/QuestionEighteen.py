"""Peça um valor em Reais (R$) e exiba um menu de moedas alvo: 1 - Dólar (USD), 2 - Euro
(EUR), 3 - Libra (GBP), 4 - Iene (JPY). Usando match/case, verifique a escolha, aplique
uma taxa de câmbio fictícia para a moeda escolhida e exiba o valor convertido"""

valor = float(input("Digite o valor que deseja converter em reais e pressione ENTER: "))

print("Escolha a moeda para conversão e pressione ENTER:")
print("1 - Dólar (USD)")
print("2 - Euro (EUR)")
print("3 - Libra (GBP)")

opcao = int(input("Opção: "))

match opcao:
    case 1:
        convertido = valor / 5.24
        result = "dólar"
        unidade = "USD"
        print(f"Valor em {result}: {convertido:.2f} {unidade}")
    case 2:
        convertido = valor / 6.04
        result = "euro"
        unidade = "EUR"
        print(f"Valor em {result}: {convertido:.2f} {unidade}")
    case 3:
        convertido = valor / 6.96
        unidade = "GBP"
        result = "libra"
        print(f"Valor em {result}: {convertido:.2f} {unidade}")

    case _:
        print("Opção inválida")