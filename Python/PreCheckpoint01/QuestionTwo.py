temp_select = float(input("Digite uma temperatura e pressione ENTER: "))

fahrenheit = temp_select * 9/5 + 32
kelvin = temp_select + 273.15

opcao = int(input("Digite a opção desejada para conversão\n\n1: Celsius    2: Fahrenheit    3: Kelvin\n\nDigite a opção desejada: "))

match opcao:
    case 1:
        print(f"Sua temperatura {temp_select:.2f} º em Celsius é de {temp_select:.2f} ºC")
    case 2:
        print(f"Sua temperatura {temp_select:.2f} ºC em Fahrenheit é de {fahrenheit:.2f} ºF")
    case 3:
        print(f"Sua temperatura {temp_select:.2f} ºC em Kelvin é de {kelvin:.2f} ºK")