package com.zju.cst.thread;

/**
 * @author wulixz
 * @date 9/17/19 : 4:52 PM
 * @introduction :
 */
public class Web12306 implements Runnable {

    public static int count = 99;
    public static String name;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (count <= 0) {
                    System.out.println("û��Ʊ��");
                    break;
                }
                System.out.print(Thread.currentThread().getName() + "     ����Ʊ         ");
                count--;
                if (count ==0){
                    System.out.println();
                    System.out.println("û��Ʊ��");
                }else {
                    System.out.println("���ڻ�����Ʊ   ��   " + count + "  ��");
                }
                name = Thread.currentThread().getName();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Web12306Demo {
    public static void main(String[] args) {
        Web12306 web = new Web12306();
        System.out.println("AAAA ��ʼ��Ʊ ");
        Thread aaa = new Thread(web, "AAAA");
        aaa.start();
        System.out.println("BBBB ��ʼ��Ʊ ");
        Thread bbb = new Thread(web, "BBBB");
        bbb.start();
        System.out.println("CCCC ��ʼ��Ʊ ");
        Thread ccc = new Thread(web, "CCCC");
        ccc.start();

    }
}