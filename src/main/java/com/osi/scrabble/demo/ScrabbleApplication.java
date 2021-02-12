package com.osi.scrabble.demo;

import com.osi.scrabble.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class ScrabbleApplication {

    //WordsService wordsService = new WordsService();

    public static void main(String[] args) throws IOException {

        File file = ResourceUtils.getFile(new ScrabbleApplication().getClass().getResource("/akira.txt"));
        try {
            new WordsService();
        } catch (Exception e) {

        }
    }


}
