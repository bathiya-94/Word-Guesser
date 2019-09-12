package validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserInputValidatorTest {

    @Test
    public  void  returnsTrueIfaCharacterIsInput(){
        Validator<Character> validator = new UserInputValidator();
        assertTrue(validator.validate('C'));
    }

    @Test
    public  void  returnsFalseIfAnotherCharacterIsInput(){
        Validator<Character> validator = new UserInputValidator();
        assertFalse(validator.validate('1'));
    }

}
