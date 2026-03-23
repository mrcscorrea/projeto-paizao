yearRequest = int(input("Digite o ano que deseja e pressione ENTER: "))

calculo = yearRequest % 100
calculo2 = yearRequest % 4
calculo3 = yearRequest % 400

bissexto = (calculo2 == 0 and calculo != 0) or (calculo3 == 0)
if bissexto:
    print(f"O seu ano {yearRequest} é bissexto")
else:
    print(f"O seu ano {yearRequest} não é bissexto")
