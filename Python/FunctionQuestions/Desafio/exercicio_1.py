# 1. O Validador de Senhas Fortes Crie um programa que solicite ao usuário que digite uma senha.
# Em seguida, passe essa string para uma função chamada validar_senha(senha).
# A função deve retornar True se a senha for forte e False caso contrário.

# Regras: Deve ter pelo menos 8 caracteres, conter pelo menos uma letra maiúscula,
# uma letra minúscula, um número e um caractere especial (!@#$%&*).

# Desafio: O programa principal deve usar um while que continua pedindo a senha
# até que o usuário digite uma que passe na validação.
def validar_senha(senha):
    caracteres = "!@#$&*"
    tem_maiuscula = False
    tem_minuscula = False
    tem_numero = False
    tem_especial = False

    if len(senha) < 8:
        print("Sua senha precisa ter 8 ou mais caracteres.")
        return False

    for caractere in senha:
        if caractere.isupper():
            tem_maiuscula = True
        elif caractere.islower():
            tem_minuscula = True
        elif caractere.isdigit():
            tem_numero = True
        elif caractere in caracteres:
            tem_especial = True

    if not tem_maiuscula:
        print("Sua senha precisa ter ao mínimo uma letra maiúscula")
        return False
    if not tem_minuscula:
        print("Sua senha precisa ter ao mínimo uma letra minúscula")
        return False

    if not tem_numero:
        print("Sua senha não contém números")
        return False

    if not tem_especial:
        print("Você precisa ter um destes caracteres (@!#$%&*) presente na sua senha.")
        return False

    return True

senha_digitada = ""
while True:
    senha_digitada = input("Digite sua senha e pressione ENTER: ")
    if validar_senha(senha_digitada):
        print("Senha forte.")
        break