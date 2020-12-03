/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;


/**
 * Given a zero-indexed array of size N, where each value a[i] is a parent node of i
 * write a program to generate the tree structure from this array.
 * 
 * e.g arr = [3, 3, 3, -1, 6, 1, 5, 2]
 * 
 * describes this tree
 * 
 *                  3
 *               /  |  \
 *              0   1   2
 *                  |    \
 *                  5      7
 *                  |
 *                  6
 *                  |
 *                  4
 * 
 * @author kiptubei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {3, 3, 3, -1, 6, 1, 5, 2};
        Node[] nodes = new Node[arr.length];
        GraphTraversal graph = new GraphTraversal();

        nodes = s.solution(arr,nodes);
        
        //find start node
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                start = i;
            }
        }
        
        //do a breadth first search traversal
        
        System.out.println("\n\nbreadth first search traversal");
        graph.BFS(nodes[start]);
        
          //do a depth first search traversal
        System.out.println("depth first search traversal");
        graph.DFS(nodes[start]);

        System.out.println("The End");
    }

}
