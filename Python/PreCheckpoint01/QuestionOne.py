nome = input("Digite o seu nome e pressione ENTER: ")
weight = float(input("Digite o seu peso e pressione ENTER: "))
height = float(input("Agora digite a sua altura e pressione ENTER: "))

imc = weight / (height ** 2)

if imc < 18.5:
    print(f" {nome}, o seu IMC {imc} é considerado pessoa abaixo do peso.")
elif 18.5 < imc < 24.9:
    print(f"{nome}, o seu IMC {imc} é considerado pessoa de peso normal.")
elif 25.0 < imc < 29.9:
    print(f"{nome}, o seu IMC {imc} é considerado pessoa sobrepeso.")
elif 30.0 < imc < 34.9:
    print(f"{nome}, o seu IMC {imc} é considerado pessoa Obesidade I.")
elif 35.0 < imc < 39.9:
    print(f"{nome}, o seu IMC {imc} é considerado pessoa Obesidade II (severa).")
else:
    print(f"{nome}, o seu IMC {imc} é considerado pessoa Obesidade III (mórbida).")