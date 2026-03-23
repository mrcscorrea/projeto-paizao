seconds = int(input("Digite o valor em segundos e pressione ENTER: "))

hours = seconds // 3600
remainder = seconds % 3600

minutes = remainder //60
seconds_remaining = remainder % 60

print(f"{hours} horas, {minutes} minutos e {seconds_remaining} segundos.")
