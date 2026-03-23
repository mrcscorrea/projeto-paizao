value = int(input("Digite o valor a ser pago e pressione ENTER: "))

option = int(input("Digite a forma de pagamento que deseja e pressione ENTER: \n\n1: À vista no PIX     2: Cartão de Crédito 1x     3: Cartão de Crédito Parcelado"))

match option:
    case 1:
        forma = "à vista no pix"
        discount = value * 0.9
        print(f"Você pagou {forma} um total de R${discount:.2f}")
    case 2:
        forma = "no cartão de crédito"
        discount = value
        print(f"Você pagou {forma} um total de R${discount:.2f}")
    case 3:
        forma = "no cartão de crédito parcelado"
        discount = value * 1.05
        parcela = int(input("Digite a quantidade de parcelas para parcelar e pressione ENTER: "))
        quantd = discount / parcela
        value = quantd
        print(f"Você pagou {forma} em {parcela}x um total de R${discount:.2f}. Ficou {quantd:.2f} por mês")