package com.advanced.dataStructures.nonLinear.graphs.traversal;
import java.util.ArrayList;
import java.util.List;
class GraphDFS {
    private void dfs(int node, List<List<Integer>> adjList,
                     boolean[] visited, List<Integer> ans){
        visited[node] = true;
        ans.add(node);
        // Traverse all the nodes in that depth if they are not visited
        for (int neighbour : adjList.get(node)){
            if(!visited[neighbour]){
                // Perform a dfs call for that neighbour
                dfs(neighbour, adjList, visited, ans);
            }
        }
    }
    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited = new boolean[V + 1]; // 0-based indexing
        List<Integer> ans = new ArrayList<>();
        int start = 1; // Assuming dfs starts from node 1
        dfs(start, adjList, visited, ans);
        return ans;
    }
}
public class DFSGraph {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        // Initially it is empty, so we add new lists
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 1,3);
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,4);
        addEdge(adjList, 2,4);
        addEdge(adjList, 3,4);
        addEdge(adjList, 3,5);
        addEdge(adjList, 4,5);
        GraphDFS obj =  new GraphDFS();
        List<Integer> ans = obj.dfsGraph(V, adjList);
        printDFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void printDFS(List<Integer> ans){
        for (int n : ans){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
