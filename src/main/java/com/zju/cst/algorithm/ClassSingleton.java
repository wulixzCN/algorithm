package com.zju.cst.algorithm;
/**
 * ��̬�ڲ���ģʽ
 * @author wulixz
 *
 */
public class ClassSingleton {
	private ClassSingleton() {	
	}
	private static class ClassSingletonInstance{
		private static final ClassSingleton instance = new ClassSingleton();
	}
	public static ClassSingleton getInstance() {
		return ClassSingletonInstance.instance;
	}
}
