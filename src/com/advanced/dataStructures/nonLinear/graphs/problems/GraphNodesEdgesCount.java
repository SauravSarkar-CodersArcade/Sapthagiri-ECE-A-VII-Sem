package com.advanced.dataStructures.nonLinear.graphs.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GraphNodesEdgesCount {
    public static int countEdges(List<List<Integer>> adjList){
        int edges = 0;
        for (List<Integer> neighbours : adjList){
            edges += neighbours.size();
        }
        // Since this is an undirected graph, each edge will be counted twice
        // So we divide the edges by 2
        return edges / 2;
    }
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // Manually add all the edges to the list
        adjList.add(Arrays.asList(1,2)); // Node 0
        adjList.add(Arrays.asList(0,2,3)); // Node 1
        adjList.add(Arrays.asList(0,1,4)); // Node 2
        adjList.add(Arrays.asList(1,4)); // Node 3
        adjList.add(Arrays.asList(2,3)); // Node 4
        int edges = countEdges(adjList);
        int nodes = countNodes(adjList);
        System.out.println("Number of Edges: " + edges);
        System.out.println("Number of Nodes: " + nodes);
    }
}
