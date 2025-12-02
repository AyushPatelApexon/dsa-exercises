package com.apexon.test_questions;

import java.util.ArrayList;
import java.util.List;

public class ValidPathInGraph {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        //making adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);

        }
        boolean[] visited = new boolean[n];

        return dfs(graph, visited, source, destination);
    }

    private static boolean dfs(List<List<Integer>> graph, boolean[] visited, int curr, int dest) {
        if (curr == dest) return true;

        visited[curr] = true;

        for (int neighbor : graph.get(curr)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, neighbor, dest)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {3, 4}};
        int n = 5,src =0,dest=4;

        System.out.println(validPath(n,edges,src,dest));
    }
}

