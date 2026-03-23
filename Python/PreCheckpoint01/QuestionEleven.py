playerOneSelects = input("JOGADOR 1! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura").upper()
playerTwoSelects = input("JOGADOR 2! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura").upper()

if playerOneSelects == playerTwoSelects:
    print("Ninguém ganhou, ambos colocaram igual.")

if (playerOneSelects == "PEDRA" and playerTwoSelects == "PAPEL") or (playerOneSelects == "PAPEL" and playerTwoSelects == "PEDRA"):
    winner = "PAPEL"
    print(f"Jogador 1 escolhe: {playerOneSelects}\nJogador 2 escolhe: {playerTwoSelects}\n\n{winner} venceu!")
elif (playerOneSelects == "PEDRA" and playerTwoSelects == "TESOURA") or (playerOneSelects == "TESOURA" and playerTwoSelects == "PEDRA"):
    winner = "PEDRA"
    print(f"Jogador 1 escolhe: {playerOneSelects}\nJogador 2 escolhe: {playerTwoSelects}\n\n{winner} venceu!")
elif (playerOneSelects == "PAPEL" and playerTwoSelects == "TESOURA") or (playerOneSelects == "TESOURA" and playerTwoSelects == "PAPEL"):
    winner = "TESOURA"
    print(f"Jogador 1 escolhe: {playerOneSelects}\nJogador 2 escolhe: {playerTwoSelects}\n\n{winner} venceu!")