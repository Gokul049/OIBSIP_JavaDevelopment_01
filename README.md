📊 Project Report: Number Guessing Game in Java
🧾 Project Title
Number Guessing Game - Console Based Java Application

🎯 Objective
To design and implement a console-based number guessing game in Java where the user attempts to guess a randomly generated number within a limited number of attempts, based on selected difficulty levels.

🛠️ Technologies Used
Programming Language: Java

IDE: Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)

Java Classes Used:

Scanner for user input

Random for number generation

ArrayList for storing high scores

🎮 Game Features
🕹️ Game Modes
The player can choose between 3 difficulty levels:

Easy – 10 attempts

Medium – 5 attempts

Hard – 3 attempts

An Exit option is also available to quit the game.

🔢 Game Logic
The program randomly generates a number between 1 and 100.

The user inputs guesses, and after each guess, feedback is given:

"Too High" if the guess is more than the number.

"Too Low" if the guess is less than the number.

If correct, the user is congratulated and awarded points.

The player is prompted whether they want to play another round or exit.

🏆 Scoring System
Points are awarded based on how quickly the user guesses the number. For example:

Easy Mode (10 attempts)
Attempt	Points
1	100
2	90
3	80
4 70
5 90 
6 50
7 40
8 30
9 20
10	10

Medium Mode (5 attempts)
Attempt	Points
1	100
2	80
3	60
4	40
5	20

Hard Mode (3 attempts)
Attempt	Points
1	100
2	50
3	10

🧠 Key Concepts Implemented
Control Flow Statements: if-else, switch, and loops

Functions/Methods: For better code modularity

User Input Validation: Ensures input is between 1 and 100

Random Number Generation

High Score Tracking using ArrayList<Integer>

System Exit using System.exit(0)
