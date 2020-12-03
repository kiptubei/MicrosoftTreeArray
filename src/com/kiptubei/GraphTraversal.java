/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

import java.util.*;

/**
 *
 * @author kiptubei
 */
public class GraphTraversal {

    public void DFS(Node start) {
        ArrayList<Node> visited = new ArrayList<Node>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(start);

        while (!stack.empty()) {
            Node current = stack.pop();
            if (!visited.contains(current)) {
                System.out.print(current.getData() + ", ");
                visited.add(current);
                Node[] neighbors = current.getNeighbors();
                for (int i = neighbors.length - 1; i >= 0; i--) {
                    stack.push(neighbors[i]);
                }
            }
        }

        System.out.println("");
    }

    public void BFS(Node start) {
        ArrayList<Node> visited = new ArrayList<Node>();
        //Set<Node> visited = new LinkedHashSet<Node>();
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            Node[] neighbors = current.getNeighbors();
            for (int i = 0; i < neighbors.length; i++) {
                if (!visited.contains(neighbors[i])) {
                    System.out.print(neighbors[i].getData() + ", ");
                    visited.add(neighbors[i]);
                    queue.add(neighbors[i]);
                }
            }
        }

        System.out.println("");
    }

}
