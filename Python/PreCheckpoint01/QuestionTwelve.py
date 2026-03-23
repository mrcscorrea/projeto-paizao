note1 = float(input("Digite sua nota 1 e pressione ENTER: "))
note2 = float(input("Digite sua nota 2 e pressione ENTER: "))
fouls = int(input("Digite a porcentagem de faltas e pressione ENTER: "))

if note1 < 0 or note2 < 0:
    print("Notas não podem ser negativas.")
elif fouls < 0 or fouls > 100:
    print("A porcentagem de faltas deve estar entre 0 e 100.")
else:

    if fouls >= 25:
        print("Você foi reprovado por ter mais de 25% em faltas.")
    else:

        note_calc = (note1 + note2) / 2

        if note_calc < 5:
            result = "reprovado"
            print(f"Você está {result} por ter média {note_calc}.")
        elif note_calc < 7:
            result = "de recuperação"
            print(f"Você está {result} por ter média {note_calc}.")
        else:
            result = "aprovado"
            print(f"Você foi {result} por ter média {note_calc}.")