package com.apexon.test_questions;

import org.junit.jupiter.api.Test;

import static com.apexon.test_questions.WordInGrid.exist;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordInGridTest {

    @Test
    void checkIfSuccess(){
        char[][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        assertEquals(true,exist(board,word));
    }
}
