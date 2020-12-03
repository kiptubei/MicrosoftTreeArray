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
public class Solution {

    public Node[] solution(int[] arr, Node[] nodes) {

        Map<Integer, ArrayList<Node>> tree = new HashMap<Integer, ArrayList<Node>>();

        //loop to set the key of our tree to a node value and an empty arraylist
        //to hold list of its adjacent node      
        for (int i : arr) {
            tree.put(i, new ArrayList<Node>());
        }

        //Populate list of adjacent nodes
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Node> tmp;
            tmp = tree.get(arr[i]);
            nodes[i] = new Node<Integer>(i);
            tmp.add(nodes[i]);
        }

        //For each node setNeightbours (Children) from the tree
        for (int i = 0; i < arr.length; i++) {
            //test to see if the node has any children
            if (tree.get(i) != null) {
                Node[] nodeArr = new Node[tree.get(i).size()];
                tree.get(i).toArray(nodeArr);
                nodes[i].setNeighbors(nodeArr);
            }

        }

        for (int i = 0; i < nodes.length; i++) {

            System.out.print(nodes[i].getData() + " -  " );
            for(int j = 0;j<nodes[i].getNeighbors().length;j++){
                System.out.print(nodes[i].getNeighbors()[j].getData() + ",");
            }
            System.out.println("");
        }

        return nodes;

    }

}
