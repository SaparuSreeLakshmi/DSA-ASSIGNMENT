package com.problem2;

import com.problem2.Operations.Node;

public class Driver2 {

	public static void main(String[] args) {
		
		
		Operations opn = new Operations();
		
		Node root = new Node(50);
		Node node1 = new Node(30);
		Node node2 = new Node(60);
		Node node3 = new Node(10);
		Node node4 = new Node(40);
		
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		
		opn.flattenBTToSkewed(root);
		opn.traverseRightSkewed(opn.nextNode);
	}
}