# WordGuesser

"Guess the Word”
A simple word guessing  built aligning with solid principles

*  The program has five(5) levels.
*  At each level the program will show a letter and set of spaces.
*  The player can enter characters one by one.
*  If the entered character is within the word, the word space will be automatically filled.
*  If the entered character is not within the word, the number of attempts will be reduced by 1

Example CLI:

Guess The Word: 
A _ _ _ _ 
Level 1 
10 attempts remaining 
Enter a character:

User Enters: L
Now it fills some spaces

10 attempts remaining
A _ _ L _ 
Enter a character:

User enters a wrong character: Y
9 attempts remaining A _ _ L _

User enters P
9 attempts remaining
A P P L _

finally 
    if the attempt count is 0 and there are spaces -> Show a message Game Over 
    If the entire word is filled -> Go to the next level
Each level may have different number of attempts.
If all 5 levels are done => He wins!

This porgram was created for an assignment for the module EE7205: Object Oriented Programming and Design Patterns