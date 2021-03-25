# Greed-Kata

Questions:
- Does the game have a winning state or is it simply played as many times as desired?
- When considering the extra credit, does order matter for straight?

Assumptions made:
- The dice represent a list of unordered integers.
- The game will end whenever the user decideds to quit.

Possible Solutions:
- Overall I stuck to the idea of representing the 5 dice as an array of ints, and built my backend around that idea.
- When working on the backend I considered storing the quanitity of each die value in 6 different int variables, specific to the die value represented, but instead I decided to store these values in an array of integers to make the access of each value more consistent and efficient.

- I played with a couple different ideas of how to visually represent the dice, such as simply with numbers, or through shapes, and ultimately stuck with the idea of drawing shapes to represent each die.
