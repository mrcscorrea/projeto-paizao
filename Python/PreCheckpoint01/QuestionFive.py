year_request = int(input("Digite o ano que deseja e pressione ENTER: "))

calculo = year_request % 100
calculo2 = year_request % 4
calculo3 = year_request % 400

bissexto = (calculo2 == 0 and calculo != 0) or (calculo3 == 0)
if bissexto:
    print(f"O seu ano {year_request} é bissexto")
else:
    print(f"O seu ano {year_request} não é bissexto")
