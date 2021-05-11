package com.company.TestLogic002;

public class TestLogic002 {

    static Node root;

    static int diameterOpt(Node root, Height height) {
        Height leftHeight = new Height();
        Height rightHeight = new Height();

        if (root == null) {
            height.height = 0;
            return 0;
        }

        int ldiameter = diameterOpt(root.left, leftHeight);
        int rdiameter = diameterOpt(root.right, rightHeight);


        height.height = Math.max(leftHeight.height, rightHeight.height) + 1;

        return Math.max(leftHeight.height + rightHeight.height + 1,
                Math.max(ldiameter, rdiameter));
    }


    static int diameter() {
        Height height = new Height();
        return diameterOpt(root, height);
    }

    // Driver Code
    public static void main(String args[]) {
        // creating a binary tree and entering the nodes
        root = new Node(40);
        root.left = new Node(30);
        root.right = new Node(65);
        root.left.left = new Node(22);
        root.left.right = new Node(38);
        root.right.left = new Node(78);

        // Function Call
        System.out.println(diameter());
    }

}
