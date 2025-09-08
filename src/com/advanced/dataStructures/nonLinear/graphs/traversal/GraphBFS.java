package com.advanced.dataStructures.nonLinear.graphs.traversal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        // Create a list to store the bfs output
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V + 1]; // 0-based indexing
        Queue<Integer> q = new LinkedList<>();
        // Start the bfs from the source node : Node 1 in our case
        visited[1] = true;
        // Push the start/source node into the queue
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            // Traverse all of it's neighbours
            for (int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
class BFSGraph {
    public static void main(String[] args) {
        int V = 5; // Number of nodes
        List<List<Integer>> adjList = new ArrayList<>();
        // Initially it is empty, so we add new lists
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        // Add the edges (Undirected Graph)
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,3);
        addEdge(adjList, 2,4);
        addEdge(adjList, 3,4);
        addEdge(adjList, 3,5);
        addEdge(adjList, 4,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V, adjList);
        printBFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void printBFS(List<Integer> ans){
        for (int n : ans){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
