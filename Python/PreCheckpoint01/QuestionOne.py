nameRequest = input("Digite o seu nome e pressione ENTER: ")
weightRequest = float(input("Digite o seu peso e pressione ENTER: "))
heightRequest = float(input("Agora digite a sua altura e pressione ENTER: "))

imc = weightRequest / (heightRequest ** 2)

if imc < 18.5:
    print(f" {nameRequest}, o seu IMC {imc} é considerado pessoa abaixo do peso.")
elif 18.5 < imc < 24.9:
    print(f"{nameRequest}, o seu IMC {imc} é considerado pessoa de peso normal.")
elif 25.0 < imc < 29.9:
    print(f"{nameRequest}, o seu IMC {imc} é considerado pessoa sobrepeso.")
elif 30.0 < imc < 34.9:
    print(f"{nameRequest}, o seu IMC {imc} é considerado pessoa Obesidade I.")
elif 35.0 < imc < 39.9:
    print(f"{nameRequest}, o seu IMC {imc} é considerado pessoa Obesidade II (severa).")
else:
    print(f"{nameRequest}, o seu IMC {imc} é considerado pessoa Obesidade III (mórbida).")