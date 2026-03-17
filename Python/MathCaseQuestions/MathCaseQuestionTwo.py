print("S - Solteiro   C - Casado   V - Viúvo   D - Divorciado")
estado_civil = input("Digite o estado civil que está atualmente:").upper()

match estado_civil:
    case "S":
        print("Você é solteiro, tem uma vida de farra")
    case "C":
        print("Você é casado, sua mulher manda em você, e tá proibido de jogar cs de noite")
    case "V":
        print("Você é viúvo(a), sentimos muito pelo ocorrido.")
    case "D":
        print("Você é divorciado, falava tanto dela, agora vai viverr caralho")