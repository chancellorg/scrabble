package com.osi.scrabble.service;

import org.springframework.stereotype.Component;

@Component
public class ScrabbleWordScoring {
    private int[] letterScores;

    public ScrabbleWordScoring() {
        letterScores = new int[26];
        for (int i = 0; i < letterScores.length; i++) {
            letterScores[i] = 1;
        }
    }

    private void populateLetterScores() {



    }

}
