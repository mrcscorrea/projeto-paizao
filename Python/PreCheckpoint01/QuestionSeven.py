

years_old = int(input("Digite sua idade e pressione ENTER: "))
contribution = int(input("Digite quantos anos você trabalhou e pressione ENTER: "))

retiree = (years_old >= 65 or contribution >= 30) or (years_old >= 60 and contribution >= 25)
if retiree:
    print(f"Você tem {years_old} anos de idade e trabalhou {contribution} anos, logo pode se aposentar.")
else:
    print(f"Você tem {years_old} anos de idade e trabalhou {contribution} anos, ainda não pode se aposentar.")