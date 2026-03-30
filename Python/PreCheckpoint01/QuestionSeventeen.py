"""Crie um programa que peça um código de erro HTTP comum (200, 400, 401, 403, 404,
500). Use match/case para exibir o significado de cada um (Ex: 200 -> OK, 404 -> Not
Found). Inclua um case _: para capturar códigos inválidos ou não cadastrados"""

codigo = int(input("Digite o código HTTP que apareceu na tela e pressione ENTER: "))

match codigo:
    case 200:
        result = "OK"
        print(f"HTTP {codigo} - {result}")
    case 400:
        result = "Bad Request"
        print(f"HTTP {codigo} - {result}")
    case 401:
        result = "Unauthorized"
        print(f"HTTP {codigo} - {result}")
    case 403:
        result = "Forbidden"
        print(f"HTTP {codigo} - {result}")
    case 404:
        result = "Not Found"
        print(f"HTTP {codigo} - {result}")
    case 500:
        result = "Internal Server Error"
        print(f"HTTP {codigo} - {result}")
    case _:
        print("Código inválido ou não cadastrado")