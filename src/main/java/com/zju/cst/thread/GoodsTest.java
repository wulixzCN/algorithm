package com.zju.cst.thread;

public class GoodsTest {
	public static void main(String[] args) {
		Goods goods = new Goods();
		Product product = new Product(goods);
		Product product2 = new Product(goods);
		Consumer consumer = new Consumer(goods);
		Thread thread1 = new Thread(product,"������1:");
		Thread thread2 = new Thread(consumer,"������1:");
		Thread thread3 = new Thread(product2,"������2:");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
