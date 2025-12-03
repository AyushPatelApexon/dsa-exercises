package com.apexon.test_questions;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FloodFillTest {

    @Test
    void checkIfSuccess(){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2 ;
        int[][] output = {{2,2,2},{2,2,0},{2,0,1}};
        int[][] actual = FloodFill.floodFill(image,sr,sc,color);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(output[i][j] != actual[i][j] )
                assertFalse(false);
                else {
                    assertTrue(true);
                }
            }
        }

    }
    @Test
    void checkIfSuccessTest2(){
        int[][] image = {{0,0,0},{0,0,0}};
        int sr = 0, sc = 0, color = 0 ;
        int[][] output = {{0,0,0},{0,0,0}};
        int[][] actual = FloodFill.floodFill(image,sr,sc,color);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(output[i][j] != actual[i][j] )
                    assertFalse(false);
                else {
                    assertTrue(true);
                }
            }
        }

    }
}
