package com.zju.cst.thread;

public class Product implements Runnable{
    Goods goods;
    public  Product(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
    System.out.println("�����߿�ʼ����");

        while (goods.apple <20){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goods.make();
        }
    }
}
