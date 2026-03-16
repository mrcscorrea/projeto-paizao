yearRequest = int(input("Digite seu ano de nascimento: "))
actualYear = int(2026)

idade = actualYear - yearRequest

print(f"Sua idade é {idade}")
if idade < 18:
    print("Você é menor de idade")
elif idade > 18:
    print("Você é adulto")
elif idade >= 65:
    print("Você é idoso")
