package com.company;

public class IntTree {

    private IntTreeNode overallRoot;

    public IntTree(int max) {
        this.overallRoot = buildTree(1, max);
    }

    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    public void printSideways() {
        printSideways(this.overallRoot, 0);
    }

    public void inorderTraversal(IntTree overallRoot) {
        inorderTraversal(overallRoot.overallRoot);
    }

    private void inorderTraversal(IntTreeNode overallRoot) {
        IntTreeNode current = overallRoot;
        if (overallRoot == null) {
            return;
        }
        inorderTraversal(current.left);
        System.out.println(current.data);
        inorderTraversal(current.right);
    }

    public void preorderTraversal(IntTree overallRoot) {
        preorderTraversal(overallRoot.overallRoot);
    }


    private void preorderTraversal(IntTreeNode overallRoot) {
        IntTreeNode current = overallRoot;
        if (overallRoot == null) return;

        System.out.println(current.data);
        preorderTraversal(current.left);
        preorderTraversal(current.right);
    }


    public void postorderTraversal(IntTree overallRoot) {
        postorderTraversal(overallRoot.overallRoot);
    }


    private void postorderTraversal(IntTreeNode overallRoot) {
        IntTreeNode current = overallRoot;
        if (overallRoot == null) {
            return;
        }
        postorderTraversal(current.left);
        postorderTraversal(current.right);
        System.out.println(current.data);
    }


    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }

}
