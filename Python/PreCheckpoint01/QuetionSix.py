lado1 = float(input("Digite o lado 1 e pressione ENTER: "))
lado2 = float(input("Digite o lado 2 e pressione ENTER: "))
lado3 = float(input("Digite o lado 3 e pressione ENTER: "))

if (lado1 < lado2 + lado3) and (lado2 < lado1 + lado3) and (lado3 < lado1 + lado2):
    print(f"Os valores {lado1} {lado2} e {lado3} formam um triângulo.")

if lado1 == lado2 == lado3:
    print("Seu triângulo é equilátero")
elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
    print("Seu triângulo é isósceles")
else:
    print("Seu triângulo é escaleno")