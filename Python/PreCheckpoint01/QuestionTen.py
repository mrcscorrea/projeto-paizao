coord_x = int(input("Digite uma coordenada X e pressione ENTER: "))
coord_y = int(input("Digite uma coordenada Y e pressione ENTER: "))

Q1 = coord_x > 0 and coord_y > 0
Q2 = coord_x < 0 and coord_y > 0
Q3 = coord_x < 0 and coord_y < 0
Q4 = coord_x > 0 and coord_y < 0
origin = coord_x == 0 and coord_y == 0

if Q1:
    quadrante = "primeiro quadrante"
    print(f"Suas coordenadas {coord_x} e {coord_y} estão no {quadrante}.")
elif Q2:
    quadrante = "segundo quadrante"
    print(f"Suas coordenadas {coord_x} e {coord_y} estão no {quadrante}.")
elif Q3:
    quadrante = "terceiro quadrante"
    print(f"Suas coordenadas {coord_x} e {coord_y} estão no {quadrante}.")
elif Q4:
    quadrante = "quarto quadrante"
    print(f"Suas coordenadas {coord_x} e {coord_y} estão no {quadrante}.")
elif origin:
    print(f"Suas coordenadas {coord_x} e {coord_y} dão na origem.")
else:
    print(f"Suas coordenadas {coord_x} e {coord_y} não dão em quadrante, podem estar em cima das retas.")