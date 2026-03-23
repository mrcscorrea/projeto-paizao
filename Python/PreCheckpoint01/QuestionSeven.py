

yearsOld = int(input("Digite sua idade e pressione ENTER: "))
contribution = int(input("Digite quantos anos você trabalhou e pressione ENTER: "))

retiree = (yearsOld >= 65 or contribution >= 30) or (yearsOld >= 60 and contribution >= 25)
if retiree:
    print(f"Você tem {yearsOld} anos de idade e trabalhou {contribution} anos, logo pode se aposentar.")
else:
    print(f"Você tem {yearsOld} anos de idade e trabalhou {contribution} anos, ainda não pode se aposentar.")