package com.apexon.test_questions;

import org.junit.jupiter.api.Test;

import static com.apexon.test_questions.DetectCycleInGraph.hasCycle;
import static org.junit.jupiter.api.Assertions.*;

public class DetectCycleInGraphTest {
    @Test
    void testGraphWithNoCycle() {
        int n = 5;
        int[][] edges = { {0,1}, {1,2}, {2,3}, {3,4} };

        assertFalse(hasCycle(n, edges));
    }

    @Test
    void testGraphWithCycle() {
        int n = 4;
        int[][] edges = { {0,1}, {1,2}, {2,0} };

        assertTrue(hasCycle(n, edges));
    }

}
