package com.zju.cst.thread;

public class Consumer implements Runnable {
    Goods goods;
    public Consumer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
    System.out.println("�����߿�ʼ����");

      while (goods.apple >=0){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goods.eat();
    }
    }
}
