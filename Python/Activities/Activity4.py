"""
Make a two-player Rock-Paper-Scissors game.
Remember the rules:
Rock beats scissors
Scissors beats paper
Paper beats rock

Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
If they say 'Yes', the game should begin again.
If they say 'No', the game should exit.
"""

player1 = input("enter player1 input")
player2 = input("enter player2 input")
playmore = "yes"

while playmore.lower() == "yes":
    player1 = input("enter player1 input")
    player2 = input("enter player2 input")
    if player1 == player2:
        print("Its a tie")
    elif player1 == "rock" and player2 == "scissors":
        print("player1 win")
    elif player1 == "scissors" and player2 == "paper":
        print("player1 win")
    elif player1 == "paper" and player2 == "rock":
        print("player1 win")
    else:
        print("player2 win")
    playmore = input("Do you want to play again [yes/no :")