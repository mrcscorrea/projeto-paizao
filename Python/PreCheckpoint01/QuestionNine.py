decimal_one = float(input("Digite um número decimal e pressione ENTER: "))
decimal_two = float(input("Digite outro número decimal e pressione ENTER: "))
operation = input("Digite a opção desejada para realizar a operação:\n\n+ = Soma    - = Subtração    * = Multiplicação    / = Divisão")

match operation:
    case "+":
        operacao = "soma"
        result = decimal_one + decimal_two
        print(f"Sua {operacao} entre {decimal_one} e {decimal_two} resultará em {result}.")
    case "-":
        operacao = "subtração"
        result = decimal_one - decimal_two
        print(f"Sua {operacao} entre {decimal_one} e {decimal_two} resultará em {result}.")
    case "*":
        operacao = "muliplicação"
        result = decimal_one * decimal_two
        print(f"Sua {operacao} entre {decimal_one} e {decimal_two} resultará em {result}.")
    case "/":
        if decimal_two == 0:
            print("Você não pode dividir um número por 0.")
        else:
            operacao = "divisão"
            result = decimal_one / decimal_two
            reminder = decimal_one % decimal_two
            print(f"Sua {operacao} entre {decimal_one} e {decimal_two} resultará em {result}.")

            if reminder > 0:
                print(f"Sua {operacao} teve resto.")
            else:
                print(f"Sua {operacao} não teve resto.")

    case _:
        print(f"Sua operação não teve êxito por conta dos números colocados.")