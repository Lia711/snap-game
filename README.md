# Snap Game

Features:
- creation of full deck of 52 cards
- random shuffling and sorting by card suit or value 
- single player game of snap: player presses enter until a snap occurs
- counter for rounds until victory
- two player game of snap: setting names for player one and two
- taking turns drawing a card until a suit matches
- during  snap opportunity, user must type in "snap" in order to win the game
- options for replaying games or going back to main menu
- polished player menu with extensive coverage of different possible user actions and errors

Files: 
- "Card" class containing constructors, getters and setters for the suit, value and symbol of a card, as well as toString method
- "CardGame" class containing methods for adding and removing a card to the deck and shuffling and sorting cards
- "Main" class that only contains the option to run the program, following abstraction
- "MainGame" class responsible for presenting user with the menu/options of the program
- "Snap" class that runs when user wants to play single player snap
- "SnapTwoPlayer" class that runs when user wants to play two player snap
- "SortBySuit" class for sorting cards by suits and values within same suits
- "SortByValue" class for sorting cards by values and suits within same values
- "Suits" enum containing suits for the cards including visual representation by unicode symbols
- "Values" enum containing values for the cards and their corresponding number/letter
