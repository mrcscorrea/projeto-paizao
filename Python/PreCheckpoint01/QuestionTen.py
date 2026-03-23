coordX = int(input("Digite uma coordenada X e pressione ENTER: "))
coordY = int(input("Digite uma coordenada Y e pressione ENTER: "))

Q1 = coordX > 0 and coordY > 0
Q2 = coordX < 0 and coordY > 0
Q3 = coordX < 0 and coordY < 0
Q4 = coordX > 0 and coordY < 0
origin = coordX == 0 and coordY == 0

if Q1:
    quadrante = "primeiro quadrante"
    print(f"Suas coordenadas {coordX} e {coordY} estão no {quadrante}.")
elif Q2:
    quadrante = "segundo quadrante"
    print(f"Suas coordenadas {coordX} e {coordY} estão no {quadrante}.")
elif Q3:
    quadrante = "terceiro quadrante"
    print(f"Suas coordenadas {coordX} e {coordY} estão no {quadrante}.")
elif Q4:
    quadrante = "quarto quadrante"
    print(f"Suas coordenadas {coordX} e {coordY} estão no {quadrante}.")
elif origin:
    print(f"Suas coordenadas {coordX} e {coordY} dão na origem.")
else:
    print(f"Suas coordenadas {coordX} e {coordY} não dão em quadrante, podem estar em cima das retas.")