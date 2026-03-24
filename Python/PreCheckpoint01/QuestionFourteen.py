"""Solicite ao usuário três números inteiros: dia, mês e ano. Crie um algoritmo que verifique
se esses dados formam uma data válida no calendário gregoriano. Lembre-se de validar
meses com 30 ou 31 dias e as regras para fevereiro (28 ou 29 dias dependendo se o ano
é bissexto)."""


ano = int(input("Digite o ano do ano desejado e pressione ENTER: "))

calculo = ano % 4
calculo2 = ano % 100
calculo3 = ano % 400
bissexto = (calculo == 0 and calculo2 != 0) or (calculo3 == 0)
mes = int(input("Digite o número do mês do ano desejado e pressione ENTER: "))

if mes > 12:
    print("Você digitou uma entrada de mês inválida!")
else:
    dia = int(input("Digite o dia do ano desejado e pressione ENTER: "))

    if mes == 4 or mes == 6 or mes == 11:
        dia_max = 31

    elif mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
        dia_max = 30

    elif mes == 2 and not bissexto:
        dia_max = 28
    else:
        dia_max = 29

    if dia > dia_max:
        print("Você digitou um dia inválido para o mês desejado")
    else:
        print(f"Data validada! dia {dia} do {mes} de {ano}.")