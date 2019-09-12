package gameprocedure;

import entity.Word;

import helpers.WordGenerator;
import ui.UserInterface;
import validator.Validator;


import java.io.IOException;
import java.util.logging.Level;

public class GameInitializer {
    private static final int  NO_OF_LEVELS  = 5;

    private WordGenerator wordGenerator;
    private UserInterface userInterface;
    private Validator<Character> validator;
    private  Validator<String> wordValidator;

    public GameInitializer(WordGenerator wordGenerator, UserInterface commandLineInterface, Validator<Character> validator, Validator<String> wordValidator){
        this.userInterface = commandLineInterface;
        this.wordGenerator = wordGenerator;
        this.validator = validator;
        this.wordValidator = wordValidator;
    }

    public   void  run() throws IOException {
        userInterface.show("Word Guesser by Bathiya");

        for(int level =0; level<NO_OF_LEVELS ; level++) {
            String selectedWord = wordGenerator.generate();
            if (!wordValidator.validate(selectedWord)){
                throw new GameOverException("Error in words from datasource");
            }
            Word word = new Word(selectedWord ,selectedWord.length()+( 5 -level)/2 );
            boolean isCompleted = false;
            userInterface.show("Guess The Word:");
            while ( !isCompleted){

               userInterface.show(word.convertToString());
               userInterface.show("Level "+ Integer.toString(level +1));
               userInterface.show("Enter a Character");

               Character c = userInterface.getUserInputs();

               if (!validator.validate(c)){
                   userInterface.show("Have entered a wrong character");
                   continue;
               }
                boolean isLetterCorrect = word.fill(c);

                if (isLetterCorrect){
                    userInterface.show("You have entered the correct Letter");
                }
                else{
                    userInterface.show("You have entered the incorrect Letter");
                }
                userInterface.show(word.convertToString());
                userInterface.show(" Attempts Remaining " + Integer.toString(word.getRemainingAttempts()) );

                isCompleted = word.isComplete();
                if (isCompleted){
                   userInterface.show("Congratulations! You will proceed to next Level");
                }
            }
        }

        userInterface.show("You win!");
    }
}
