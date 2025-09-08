package com.advanced.dataStructures.nonLinear.graphs.topoSort;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class TopoSortBFSKahn {
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V];
        // Step 1: Calculate the in-degree of all the nodes
        for (int i=0; i<V; i++){
            for (int it : adj.get(i)){
                inDegree[it]++;
            }
        }
        // Step 2: Add all nodes with in-degree 0 into the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        // Step 3: BFS Call
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            // Relax the in-degree of the adjacent nodes
            for (int it : adj.get(node)){
                inDegree[it]--;
                // Check if the in-degree becomes 0, if yes, push into queue
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return topo;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopoSortBFSKahn obj = new TopoSortBFSKahn();
        List<Integer> ans = obj.topoSort(V, adj);
        System.out.println("Linear Ordering Topo Sort BFS Kahn's Algo: ");
        for (int node : ans){
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
