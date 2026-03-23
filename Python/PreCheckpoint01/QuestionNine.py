decimalOne = float(input("Digite um número decimal e pressione ENTER: "))
decimalTwo = float(input("Digite outro número decimal e pressione ENTER: "))
operation = input("Digite a opção desejada para realizar a operação:\n\n+ = Soma    - = Subtração    * = Multiplicação    / = Divisão")

match operation:
    case "+":
        operacao = "soma"
        result = decimalOne + decimalTwo
        print(f"Sua {operacao} entre {decimalOne} e {decimalTwo} resultará em {result}.")
    case "-":
        operacao = "subtração"
        result = decimalOne - decimalTwo
        print(f"Sua {operacao} entre {decimalOne} e {decimalTwo} resultará em {result}.")
    case "*":
        operacao = "muliplicação"
        result = decimalOne * decimalTwo
        print(f"Sua {operacao} entre {decimalOne} e {decimalTwo} resultará em {result}.")
    case "/":
        if decimalTwo == 0:
            print("Você não pode dividir um número por 0.")
        else:
            operacao = "divisão"
            result = decimalOne / decimalTwo
            reminder = decimalOne % decimalTwo
            print(f"Sua {operacao} entre {decimalOne} e {decimalTwo} resultará em {result}.")

            if reminder > 0:
                print(f"Sua {operacao} teve resto.")
            else:
                print(f"Sua {operacao} não teve resto.")

    case _:
        print(f"Sua operação não teve êxito por conta dos números colocados.")