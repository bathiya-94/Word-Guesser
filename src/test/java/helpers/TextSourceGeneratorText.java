package helpers;


import org.junit.Test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class TextSourceGeneratorText {
    private static final Logger LOGGER = Logger.getLogger(TextSourceGeneratorText.class.getName());
    @Test
    public  void returnsAWord() throws IOException {
        WordGenerator wordGenerator = new TextSourceWordGenerator();
        String word = wordGenerator.generate();
        LOGGER.log(Level.INFO,word);

    }


}
