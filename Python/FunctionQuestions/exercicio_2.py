qtd_lados = int(input("Digite a quantidade de lados do seu polígono e pressione ENTER: "))

def verificar_poligono(qtd):
    qtd = qtd_lados
    if qtd == 3:
        print("TRIÂNGULO")
    elif qtd == 4:
        print("QUADRILÁTERO")
    elif qtd == 5:
        print("PENTÁGONO")
    else:
        print("VALOR INVÁLIDO")


verificar_poligono(qtd_lados)