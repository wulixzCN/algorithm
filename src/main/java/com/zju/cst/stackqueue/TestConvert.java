package com.zju.cst.stackqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ����ջʵ�ֽ���ת�� ����ʮ����ת���ɶ����ƣ�
 * @author dell
 *
 */
public class TestConvert {

	public static void main(String[] args) {
		
		int n = 100;
		int a = n;
		List list = new ArrayList();
		//����һ����ջ 
		Deque stack = new LinkedList();
		do {
			int  p = a % 2  ;
			stack.push(p);
			a = a / 2;
		}
		while(a > 0); 
		System.out.print(n+"----->");
		while(!stack.isEmpty()) {//��ջ�ǿ�
			System.out.print(stack.poll());
		}

		
	}
}
