package com.advanced.backtracking;

import java.util.Scanner;

public class RatInMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n, int[][] resultantArray){
        // Base case where the rat has already reached the destination
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if we can stand at the (x,y) position
        if(isPathSafe(arr,x,y,n)){
            // Just update the cell to 1
            resultantArray[x][y] = 1;
            // Move forward to check for a safe path
            if(ratInMaze(arr,x+1,y,n,resultantArray)){
                return true;
            }
            // Move downward to check for a safe path
            if(ratInMaze(arr,x,y+1,n,resultantArray)){
                return true;
            }
            // If not true, we couldn't find a path, so we have to backtrack
            resultantArray[x][y] = 0; // BackTracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the Maze Array Values:");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] resultantArray = new int[n][n]; // Resultant Array to store Output
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultantArray[i][j] = 0; // Initialize all the values to 0 in the beginning
            }
        }
        if(ratInMaze(arr, 0,0, n, resultantArray)){
            // if it's true, we have the path, so we will print the array
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No path for the rat in the maze exists.");
        }
    }
}
