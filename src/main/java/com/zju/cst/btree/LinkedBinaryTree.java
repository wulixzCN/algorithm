package com.zju.cst.btree;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {
  private Node root;

  LinkedBinaryTree() {}

  LinkedBinaryTree(Node node) {
    this.root = node;
  }

  @Override
  public int size() {
    System.out.println("�������Ľڵ����Ϊ�� ");
    return this.size(root);
  }

  private int size(Node root) {
    if (root == null) {
      return 0;
    } else {
      int nl = size(root.leftChild);
      int nr = size(root.rightChild);
      return nl + nr + 1;
    }
  }

  @Override
  public boolean isEmpty() {
    return root == null;
  }

  @Override
  public int getHeight() {
    System.out.println("�������ĸ߶�Ϊ: ");
    return this.getHeight(root);
  }

  private int getHeight(Node root) {
    if (root == null) {
      return 0;
    } else {
      int nl = getHeight(root.leftChild);
      int nr = getHeight(root.rightChild);
      return nl > nr ? nl + 1 : nr + 1;
    }
  }

  @Override
  public Node findKey(int value) {
    return this.findkey(value, root);
  }

  private Node findkey(Object value, Node root) {
    if (root == null) {
      return null;
    } else if (root.value != null && root.value == value) {
      return root;

    } else {
      Node nl = findkey(value, root.leftChild);
      if (nl != null) {
        return nl;
      }
      Node nr = findkey(value, root.rightChild);
      if (nr != null) {
        return nr;
      }
    }
    return null;
  }

  @Override
  public void preOrderTraverse() {
    this.preOrderTraverse(root);
  }

  private void preOrderTraverse(Node root) {
    // �����ж����ڵ� �Ƿ�Ϊ��
    if (root != null) {
      // ������ڵ�
      System.out.print(root.value + " ");
      // ����������
      preOrderTraverse(root.leftChild);
      // ����������
      preOrderTraverse(root.rightChild);
    }
  }

  @Override
  public void inOrderTeavere() {
    this.inOrderTeavere(root);
  }

  private void inOrderTeavere(Node root) {
    if (root != null) {
      // �ȶ����������б���
      inOrderTeavere(root.leftChild);
      // ������ڵ�
      System.out.print(root.value + " ");
      // �����������б���
      inOrderTeavere(root.rightChild);
    }
  }

  @Override
  public void postOrderTeavere() {
    this.postOrderTeavere(root);
  }

  @Override
  public void postOrderTeavere(Node root) {
    if (root != null) {
      // �ȶ����������б���
      postOrderTeavere(root.leftChild);
      // �����������б���
      postOrderTeavere(root.rightChild);
      // ������ڵ�
      System.out.print(root.value + " ");
    }
  }

  @Override
  public void inOrderByStack() {

  }

  @Override
  public void preOrderByStack() {}

  @Override
  public void postOrderByStack() {}

  @Override
  public void levelOrderByStack() {
    System.out.println("���ղ�α������������У�: ");
    Queue<Node > queue = new LinkedList<>();
    if (root == null) return;
    queue.offer(root);
    while (queue.size() != 0 ){
        for (int i = 0 ; i < queue.size();i++){
            Node tmp = queue.poll();
            System.out.print(tmp.value + " ");
            if (tmp.leftChild != null)queue.offer(tmp.leftChild);
            if (tmp.rightChild != null)queue.offer(tmp.rightChild);

        }

    }





  }
}
