"""Crie um programa onde o usuário digite o tipo de veículo: "carro", "moto", "onibus" ou
"caminhao". Utilize match/case para o tipo. Dentro do case do "caminhao", peça uma
entrada extra indicando a quantidade de eixos usando um if/else para calcular o valor do
pedágio proporcional ao tamanho do caminhão. Defina valores fixos para as outras
categorias."""

tipo_veiculo = input("Digite o tipo de veículo (carro, moto, onibus, caminhao): ").lower()

match tipo_veiculo:
    case "carro":
        valor = 6.6
        print(f"Valor do pedágio: R${valor:.2f}")
    case "moto":
        valor = 3.3
        print(f"Valor do pedágio: R${valor:.2f}")
    case "onibus":
        valor = 13.2
        print(f"Valor do pedágio: R${valor:.2f}")
    case "caminhao":
        eixos = int(input("Digite a quantidade de eixos do caminhão e pressione ENTER: "))

        if eixos <= 2:
            valor = 13.2
            print(f"Valor do pedágio: R${valor:.2f}")
        elif eixos == 3:
            valor = 19.8
            print(f"Pedágio: R$ {valor:.2f}")
    case _:
        print("Tipo de veículo inválido")