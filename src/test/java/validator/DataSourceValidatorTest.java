package validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DataSourceValidatorTest {
    @Test
    public void returnsTrueIfTheStringIsAWord(){
        Validator<String> validator = new DataSourceWordsValidator();
        assertTrue(validator.validate("Monkey"));
    }
    @Test
    public void returnsTrueIfTheStringIsNotAWord(){
        Validator<String> validator = new DataSourceWordsValidator();
        assertFalse(validator.validate("Monkey123"));
    }


}
