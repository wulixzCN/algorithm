package com.zju.cst.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
	public static void main(String[] args) {
		// corePoolSize�����߳���
		// maximumPoolSize����߳���
		// keepAliveTimeʱ��
		// unit ʱ�䵥λ
		// workQueue��������
		int corePoolSize = 1;
		int maximumPoolSize = 3;
		long keepAliveTime = 0L;
		TimeUnit unit = TimeUnit.SECONDS;
		LinkedBlockingDeque<Runnable> workQueue = new LinkedBlockingDeque<>(3);

		ThreadPoolExecutor pool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);

		// �����̳߳ص��߳̿�ʼִ������
		// ִ�е�һ������
		pool.execute(new TestThread1());
		// ִ�еڶ�������

		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
		// ִ�е��ĸ�����
		pool.execute(new TestThread1());
		pool.execute(new TestThread1());
//		pool.execute(new TestThread1());
//		pool.execute(new TestThread1());
//		pool.execute(new TestThread());
		// �ر��̳߳�
		pool.shutdown();
	}
}

class TestThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}