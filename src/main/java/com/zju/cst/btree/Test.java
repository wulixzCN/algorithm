package com.zju.cst.btree;

public class Test {
	public static void main(String[] args) {
		//����һ��������
		Node node5 = new Node(5,null,null);
		Node node4 = new Node(4,null,node5);
		Node node3 = new Node(3,null,null);
		Node node7 = new Node(7,null,null);
		Node node6 = new Node(6,null,node7);
		Node node2 = new Node(2,node3,node6);
		Node node1 = new Node(1,node4,node2);
		
		BinaryTree btree = new LinkedBinaryTree(node1);	
		
		//�ж϶����� �Ƿ�Ϊ��
		System.out.println(btree.isEmpty());
		
		//��������ݹ�
		btree.preOrderTraverse();
		
		//��������ݹ�
//		System.out.println("��������ݹ���Ϊ��");
		System.out.println("");
		btree.inOrderTeavere();
		
		//��������ݹ�
		System.out.println("");
		btree.postOrderTeavere();

		//��������ǵݹ飨����ջ��
		System.out.println("");
		btree.inOrderByStack();

		//���ղ�α������������У�
		System.out.println("");
		btree.levelOrderByStack();

		//�ڶ������в���ĳ��ֵ

		//�������ĸ߶�
		System.out.println("");
		System.out.println(btree.getHeight());

		//�������Ľ������
		System.out.println("");
		System.out.println(btree.size());

		//�ڶ������л�ȡĳ��ֵ��
		System.out.println("�ڶ������л�ȡĳ��ֵ��");
		System.out.print(btree.findKey(4));

	}
}
