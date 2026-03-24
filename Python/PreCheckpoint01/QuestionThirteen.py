
import math

valor_a = float(input("Digite o valor A e pressione ENTER: "))
valor_b = float(input("Digite o valor B e pressione ENTER: "))
valor_c = float(input("Digite o valor C e pressione ENTER: "))
delta = (valor_b**2)-(4*(valor_a*valor_c))

if valor_a == 0:
    print("Sua equação não é do segundo grau por A for igual a zero")
else:

    if delta < 0:
        print("Não há raízes reais por delta ser negativo")
    elif delta == 0:
       result = -valor_b / (2 * valor_a)
       print("Seu delta foi zero")
    elif delta > 0:
        result = (-valor_b + math.sqrt(delta)) / (2 * valor_a)
        result2 = (-valor_b - math.sqrt(delta)) / (2 * valor_a)
        print(f"Sua raíz deu {result} e {result2}")