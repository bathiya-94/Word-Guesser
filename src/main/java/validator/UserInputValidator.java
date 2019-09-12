package validator;

public class UserInputValidator implements Validator<Character> {
    @Override
    public boolean validate(Character s) {
        return Character.isLetter(s);
    }
}
