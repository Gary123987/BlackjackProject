#Overview
This program simulates a game of Black Jack. When starting the program, the player is given 2 cards and the dealer is given two cards. If either of them bust, or hit 21 exactly, the game ends immediately. If they dont, the player is given the option to keep drawing cards, until either the player busts, or decides to not draw anymore. Once the player stops drawing cards, the dealer will automatically draw if below 17, or stay if above 17. Once the dealer finishes their turn, the game is over and a winner is announced. 

#Technologies Used
-Java -Eclipse -Git

#Lessons Learned
The main lesson learned in this program is how to properly structure OO programs. Creating a new instance of each object is neccessary to use that objects methods, and as many instances of an object type can be created as necessary. Also, boolean types are very useful for when deciding to continue a program or not. In this case, creating a "Game Ended" boolean allowed me to coninue the program if the game was still live, or skip over certain steps if the player or dealer had bust. 