numero = int(input("Digite um número inteiro e pressione ENTER: "))

def is_par(n):
    n = numero
    resto = n%2
    if resto > 0:
        print("É impar")
        return False
    else:
        print("É par")
        return True

is_par(numero)