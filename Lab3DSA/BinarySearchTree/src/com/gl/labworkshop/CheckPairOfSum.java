package com.gl.labworkshop;

import java.util.HashSet;
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class CheckPairOfSum {
	Node root;

    public CheckPairOfSum(Node root) {
        this.root = root;
    }

   	public static void main(String[] args) {
		Node root = new Node(10);
        CheckPairOfSum binaryTree = new CheckPairOfSum(root);
        binaryTree.root.left = new Node(20);
        binaryTree.root.right = new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        checkPair(130, root);
	}
    public static void checkPair(int sum, Node root) {
        HashSet<Integer> set = new HashSet<>();
        checkPair(set, root, sum);
    }

	public static boolean checkPair(HashSet set, Node root, int sum) {
		if (root == null) {
			return false;
		}
		if(checkPair(set,root.left,sum)) {
			return true;
		}
		if(set.contains(sum-root.data)) {
			System.out.println("Pair is there between "+ root.data+" and "+ (sum-root.data));
			return true;
		}else {
			set.add(root.data);
		}
		return checkPair(set,root.right,sum);
	}
}
