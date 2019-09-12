package helpers;

import datasource.Datasource;
import datasource.TextDataSource;


import java.io.IOException;

import java.util.List;
import java.util.Random;

public class TextSourceWordGenerator implements WordGenerator
{

    @Override
    public String generate() throws IOException {

        Datasource datasource = new TextDataSource("src/main/resources/words.txt");
        List<String> words = datasource.readWords();

        Random random = new Random();
        int n = random.nextInt(words.size());

        return words.get(n);

    }
}
