local = None
print("Palestras de Hoje\n\n1: Linux\n2: Banco de Dados\n3: Windows Server\n4: Lógica de Programação")
opcao = input("Digite a opção desejada: ")


eventos = [
    { "id": "1", "nome": "Linux", "local": "Auditório 1"},
    { "id": "2", "nome": "Banco de Dados", "local": "Auditório 2"},
    { "id": "3", "nome": "Windows Server", "local": "Auditório 3"},
    { "id": "2", "nome": "Lógica e Programação", "local": "Auditório Principal"},
]

evento_buscado = None
for evento in eventos:
    if evento["id"] == opcao:
        evento_buscado = evento
        break

if evento_buscado:
    print(f"O seu evento de ID {evento_buscado['id']} foi encontrado.")
    print(f"ID: {evento_buscado['id']}")
    print(f"Nome: {evento_buscado['nome']}")
    print(f"Local: {evento_buscado['local']}")
else:
    print(f"O evento {opcao} não existe no banco de dados")