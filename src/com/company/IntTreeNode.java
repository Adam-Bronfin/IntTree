package com.company;


public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;


    public IntTreeNode(int Data) {
        this(Data, null, null);
    }

    public IntTreeNode(int Data, IntTreeNode left, IntTreeNode right) {
        this.data = Data;
        this.left = left;
        this.right = right;
    }
}
