package com.zju.cst.algorithm_note;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {


        java.util.Queue queue = new LinkedList();
        //���
        queue.offer("����");
        queue.offer("����");
        queue.offer("����");
        //��ȡ��ͷԪ��
        System.out.println(queue.element());
        //����
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        queue.offer("����");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
