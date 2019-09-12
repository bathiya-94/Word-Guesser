package main;

import gameprocedure.GameInitializer;
import helpers.TextSourceWordGenerator;
import helpers.WordGenerator;
import ui.CommandLineInterface;
import ui.UserInterface;
import validator.DataSourceWordsValidator;
import validator.UserInputValidator;
import validator.Validator;


import java.io.IOException;

public class Main {
    public  static  void  main(String[] args) throws IOException {
        UserInterface userInterface = new CommandLineInterface();
        WordGenerator wordGenerator = new TextSourceWordGenerator();
        Validator<Character> validator = new UserInputValidator();
        Validator<String> wordValidator = new DataSourceWordsValidator();
        GameInitializer gameInitializer = new GameInitializer(wordGenerator,userInterface,validator,wordValidator);
        gameInitializer.run();

    }
}
