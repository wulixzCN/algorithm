package com.zju.cst.algorithm;
/**
 * ����ʽ����ģʽ
 * @author dell
 *
 */
public class HungrySingleton {
	private HungrySingleton() {
	}
	
	private static HungrySingleton instance = new HungrySingleton();//���ʼ��ʱ�����̼������������Ȼ�̰߳�ȫ
	
	public static HungrySingleton getInstance() {//����ͬ�������Ե���Ч�ʸ�
		return instance;
	}
}
