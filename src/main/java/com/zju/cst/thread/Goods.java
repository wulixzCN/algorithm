package com.zju.cst.thread;

public class Goods {

    public   int apple;
    public synchronized void make(){
        if (apple >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
           apple ++;
            System.out.println("������:"+Thread.currentThread().getName()+"�����˵ڣ�" + apple + "����Ʒ");
            notifyAll();
        }

    }
    public synchronized void eat(){
        if (apple <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("������:"+Thread.currentThread().getName()+"�����˵ڣ�" + apple + "����Ʒ");
            apple --;
            notifyAll();
        }
    }
}
