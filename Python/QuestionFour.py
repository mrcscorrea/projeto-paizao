numero = int(input("Digite um número desejado: "))
divisao_par = numero % 2

if numero > 0 and divisao_par == 0:
    print(f"\nO número {numero} é positivo e par")
elif numero > 0 and divisao_par != 0:
    print(f"\nO número {numero} é positivo e ímpar")
elif numero < 0 and divisao_par == 0:
    print(f"\nO número {numero} é negativo e par")
elif numero < 0 and divisao_par != 0:
    print(f"\nO número {numero} é negativo e ímpar")
elif numero == 0:
    print(f"O número {numero} é zero e par")