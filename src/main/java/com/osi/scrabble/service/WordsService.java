package com.osi.scrabble.service;

import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class WordsService {
    private List<String> dictionaryWords;

    public WordsService()  {
        populateWords();
        System.out.println("Chance");
    }

    private void populateWords() {
        try {
            Path path = Paths.get(getClass().getClassLoader()
                .getResource("dictionary.txt").toURI());

            dictionaryWords = Files.readAllLines(path);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public boolean isInDictionary(String s){
        return dictionaryWords.contains(s);
    }
}
