usuario_salvo = "admin"
senha_salva = "1234"
tentativas = 0

while True:
    usuario = input("Digite o usuário: ")

    if usuario == usuario_salvo:
        break
    else:
        print("\nUsuário incorreto!\n ")

while tentativas < 3:
    senha = input("Digite a senha: ")

    if senha == senha_salva:
        print("Acesso liberado!")
        break

    elif tentativas == 3:
        print("Você excedeu o número limite de erros de senha.")
        break

    else:
        tentativas += 1
        print(f"\nSenha incorreta! Foram {tentativas}/3 tentativas.\n")
