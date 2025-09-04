package com.advanced.dataStructures.nonLinear.graphs.representation;
import java.util.Scanner;
public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> nodes
        // m -> edges
        // We have to check all nodes, so Time Complexity = O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjacencyMatrix = new int[n + 1][n + 1]; // This works for 0 as well as 1
        // Take the edges as input from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph -> u <--> v
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1; // Skip this line for a directed
        }
        // Print the Adjacency Matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
