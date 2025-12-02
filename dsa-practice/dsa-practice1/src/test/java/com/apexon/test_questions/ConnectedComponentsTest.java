package com.apexon.test_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConnectedComponentsTest {
    @Test
    void checkSuccessTest1(){
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {3, 4}};
        int n = 6;

        Assertions.assertEquals(3, ConnectedComponents.countComponents(n,edges));
    }
}
