nota_1 = int(input("Digite a nota da prova 1 e pressione ENTER: "))
nota_2 = int(input("Digite a nota da prova 2 e pressione ENTER: "))

def calcular_media(nota1,nota2):
    nota1 = nota_1
    nota2 = nota_2
    media = (nota1+nota2)/2

    if media < 5:
        print("Você foi reprovado!")
    elif media == 5:
        print("Você está de recuperação")
    else:
        print("Você foi aprovado!")

calcular_media(nota_1,nota_2)