player_one_selects = input("JOGADOR 1! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura").upper()
player_two_selects = input("JOGADOR 2! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura").upper()

if player_one_selects == player_two_selects:
    print("Ninguém ganhou, ambos colocaram igual.")

if (player_one_selects == "PEDRA" and player_two_selects == "PAPEL") or (player_one_selects == "PAPEL" and player_two_selects == "PEDRA"):
    winner = "PAPEL"
    print(f"Jogador 1 escolhe: {player_one_selects}\nJogador 2 escolhe: {player_two_selects}\n\n{winner} venceu!")
elif (player_one_selects == "PEDRA" and player_two_selects == "TESOURA") or (player_one_selects == "TESOURA" and player_two_selects == "PEDRA"):
    winner = "PEDRA"
    print(f"Jogador 1 escolhe: {player_one_selects}\nJogador 2 escolhe: {player_two_selects}\n\n{winner} venceu!")
elif (player_one_selects == "PAPEL" and player_two_selects == "TESOURA") or (player_one_selects == "TESOURA" and player_two_selects == "PAPEL"):
    winner = "TESOURA"
    print(f"Jogador 1 escolhe: {player_one_selects}\nJogador 2 escolhe: {player_two_selects}\n\n{winner} venceu!")