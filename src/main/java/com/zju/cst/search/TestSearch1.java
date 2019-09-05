package com.zju.cst.search;

/**
 * �ڳɼ��в�ѯ�����ĵ�һ������
 * T(n) = O(n)
 * S(n) = O(1)
 * @author dell
 *
 */
public class TestSearch1 {

	public static void main(String[] args) {
		//������������
		int[]  arr = {43,54,12,67,98,100,54,65,100,83};
		//����Ҫ���ҵķ���
		int score = 100;
		//��ɲ���
		int index = search(arr , score);
		
		//�������
		if(index == -1) {
			System.out.println("���ҽ��������");
		}
		else {
			System.out.println(score + "��������: "+ index);
		}

	}
	public static int search(int[] arr,int value) {
		int index = -1;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
		
	}

}
