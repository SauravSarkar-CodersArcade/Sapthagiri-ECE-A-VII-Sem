package com.advanced.dataStructures.nonLinear.graphs.representation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GraphList {
    public static void main(String[] args) {
        // n -> nodes
        // m -> edges
        Scanner sc = new Scanner(System.in);
        // We have to check all nodes, so Time Complexity = O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency List Representation
        List<List<Integer>> adjList = new ArrayList<>();
        // Now we need to individually initialize all the smaller lists
        for (int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }
        // Read the edges from the user & update the list
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <--> v
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Skip this for a directed graph
        }
        // Print the Adjacency List
        for (int i = 1; i<=n; i++){
            System.out.print("Node: -> " + i + " List Of Neighbours: ");
            for (int v : adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
