package validator;

public class DataSourceWordsValidator implements Validator<String> {
    @Override
    public boolean validate(String s) {
        return s!= null && s.matches("^[a-zA-Z]*$");
    }
}
