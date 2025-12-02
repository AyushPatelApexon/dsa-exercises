package com.apexon.test_questions;

import org.junit.jupiter.api.Test;

import static com.apexon.test_questions.ValidPathInGraph.validPath;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPathInGraphTest {

    @Test
    void checkSuccessTest1(){
         int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {3, 4}};
        int n = 5,src =0,dest=4;

        assertEquals(true, validPath(n,edges,src,dest));
    }
    @Test
    void checkSuccessTest2(){
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4},{4,3}};
        int n = 6,src =0,dest=5;

        assertEquals(false, validPath(n,edges,src,dest));
    }

}
