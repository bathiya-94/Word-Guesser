package entity;

import gameprocedure.GameOverException;

import java.util.Arrays;

public class Word {
    private final String fullWord;
    private Character[] currentWord;
    private int remainingAttempts;

    public Word(String fullWord, int numberOfAttempts) {
        this.fullWord = fullWord.toUpperCase();
        currentWord = new Character[fullWord.length()];
        Arrays.fill(currentWord, '-');
        remainingAttempts = numberOfAttempts;
        currentWord[0] = fullWord.charAt(0);

    }


    public Character[] get() {
        return currentWord;
    }


    public boolean fill(Character newChar) {

        if(remainingAttempts < 1){
            throw new GameOverException("No attempts are remaining.");
        }

        Character upperCaseChar = Character.toUpperCase(newChar);

        if(fullWord.indexOf(upperCaseChar) > -1){
            for(int i =0; i < fullWord.length(); i++){
                if(fullWord.charAt(i) == upperCaseChar){
                    currentWord[i] = upperCaseChar;
                }
            }
            return true;
        }else{
            remainingAttempts--;
            return false;
        }
    }

    public boolean isComplete(){
      return  fullWord.equals(convertToString());
    }

    public  String convertToString (){
        StringBuilder str = new StringBuilder();
        for (Character c: currentWord){
            str.append(Character.toString(c));
        }
        return str.toString();
    }


    public int getRemainingAttempts() {
        return remainingAttempts;
    }
}
