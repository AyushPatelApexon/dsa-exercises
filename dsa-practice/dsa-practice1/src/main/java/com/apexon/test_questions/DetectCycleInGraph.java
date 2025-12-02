package com.apexon.test_questions;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInGraph {
    public static boolean hasCycle(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int nei : graph.get(node)) {

            if (!visited[nei]) {
                if (dfs(nei, node, graph, visited)) {
                    return true;
                }
            }
            // If visited & not parent → Cycle
            else if (nei != parent) {
                return true;
            }
        }
        return false;
    }

}
