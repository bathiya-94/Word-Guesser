package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {


    @Test
    public void  testWhenCharacterIsRight(){
        Word word  = new Word("Apple" ,5);
        assertTrue(word.fill('p'));
    }

    @Test
    public  void  testWhenCharacterIsWrong(){
        Word word  = new Word("Apple" ,5);
        assertFalse(word.fill('D'));
    }

    @Test
    public  void returnsTrueWhenTheOutputStringsAreEqual(){
        Word word  = new Word("Apple" ,5);
        word.fill('p');
        word.fill('p');
        word.fill('a');
        word.fill('l');
        word.fill('e');
        String expected = "APPLE";

        assertEquals(expected,word.convertToString());
    }

    @Test
    public  void returnsTrueWhenTheStringIsComplete(){
        Word word  = new Word("Apple" ,5);
        word.fill('p');
        word.fill('p');
        word.fill('a');
        word.fill('l');
        word.fill('e');

        assertTrue(word.isComplete());
    }


}
