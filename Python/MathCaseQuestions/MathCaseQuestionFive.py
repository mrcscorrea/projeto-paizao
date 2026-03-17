
print("Palestras de Hoje\n\n1: Linux\n2: Banco de Dados\n3: Windows Server\n4: Lógica de Programação")
opcao = int(input("Digite a opção desejada: "))

match opcao:
    case 1:
        print("Linux - Local: Auditório 1")
    case 2:
        print("Banco de Dados - Local: Auditório 2")
    case 3:
        print("Windows Server - Local: Auditório 3")
    case 4:
        print("Logica e Programação - Local: Auditório Principal")