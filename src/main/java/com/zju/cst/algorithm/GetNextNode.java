package com.zju.cst.algorithm;

public class GetNextNode {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		//�жϿսڵ�
		if(pNode.left == null && pNode.right == null && pNode.next == null) {
			return null;
		}
		//����ýڵ�������������������������ߵ���
		if(pNode.right != null) {//�ýڵ���������
			
			TreeLinkNode rightnode = pNode.right;
			while(rightnode.left != null) {
				rightnode = rightnode.left;
			}
			return rightnode;
//			
//			while(rightnode.left ==null) {		
//				if(rightnode.right == null) {
//					return rightnode;
//				}else {
//					rightnode = rightnode.right;	
//				}
//			}
//			return rightnode.left;		
		}
		
		//����ýڵ�û������������2�����
		//��һ�֣�����ýڵ��Ǹ��ڵ���������ڵ㣬���ظ��ڵ�
//		if(pNode.equals(pNode.next.left) ) {
//			return pNode.next;
//		}
//		//�ڶ��֣��ýڵ��Ǹ��ڵ���ҽڵ㣬�ҵ����ڵ����������Ľڵ�ĸ��ڵ㡣
//		if(!pNode.equals(pNode.next.left)) {
//			TreeLinkNode node = pNode.next;
//			while( !node.equals(node.next.left) ) {
//				pNode = node.next;
//			}
//			return node;
//		}
		while(pNode.next != null){
            TreeLinkNode node = pNode.next;
            if(pNode == node.left){return node;}
            pNode = node;
        }
        return null;
    }
}
