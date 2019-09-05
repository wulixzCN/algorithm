package com.zju.cst.btree;

public class Node {
	Object value;  //���ֵ
	Node leftChild;
	Node rightChild;
	
	
	public Node(Object value) {
		super();
		this.value = value;
	}


	public Node(Object value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	@Override
	public String toString() {
		return "Node [value= " + value + ",leftChild= " + leftChild
				+ ",rightChild=" + rightChild + "]";
	}
	
	
}
