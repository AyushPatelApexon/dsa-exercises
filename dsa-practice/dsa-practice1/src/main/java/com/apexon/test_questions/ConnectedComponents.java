package com.apexon.test_questions;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponents {
    public static int countComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]); // undirected
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        // will iterate all nodes
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                components++;
            }
        }

        return components;
    }

    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(nei, graph, visited);
            }
        }
    }
}
