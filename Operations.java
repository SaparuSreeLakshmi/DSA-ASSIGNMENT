package com.problem2;

public class Operations {
	
	static class Node {
		int val;
		Node left, right;

		Node(int item) {
			val = item;
			left = right = null;
		}
	}
	
	public static Node preNode = null;
	public static Node nextNode = null;

	public void flattenBTToSkewed(Node root) {

		if (root == null)
			return;

		flattenBTToSkewed(root.left);

		Node rightNode = root.right;

     
		if (nextNode == null) {
			nextNode = root;
			root.left = null;
			preNode = root;
		} else {
			preNode.right = root;
			root.left = null;
			preNode = root;
		}
		flattenBTToSkewed(rightNode);  
	}

	public void traverseRightSkewed(Node root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}