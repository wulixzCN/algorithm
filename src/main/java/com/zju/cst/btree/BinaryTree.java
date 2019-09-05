package com.zju.cst.btree;
/**
 * �������Ľӿ�
 * �����в�ͬ��ʵ���࣬ÿ�������ʹ�ò�ͬ�Ĵ洢�ṹ������˳��ṹ����ʽ�ṹ
 * @author dell
 *
 */
public interface BinaryTree {
	/**
	 * ���������
	 * @return
	 */
	public int size();
	
	/**
	 * �Ƿ�Ϊ����
	 * @return
	 */
	public boolean isEmpty();
	
	public int getHeight();
	
	public Node findKey(int value);//����
	/**
	 * ǰ��ݹ����
	 */
	public void preOrderTraverse();
	
	/**
	 * ����ݹ����
	 */
	public void inOrderTeavere();
	
	/**
	 * ����ݹ����
	 */
	public void postOrderTeavere();
	/**
	 * ����ݹ��������
	 * @param node  �������
	 */
	public void postOrderTeavere(Node node);
	
	/**
	 * ��������ǵݹ����
	 */
	public void inOrderByStack();
	/**
	 * ��������ǵݹ����
	 */
	public void preOrderByStack();
	/**
	 * ��������ǵݹ����
	 */
	public void postOrderByStack();
	/**
	 * ����α���������
	 */
	public void levelOrderByStack();
	
	
}
