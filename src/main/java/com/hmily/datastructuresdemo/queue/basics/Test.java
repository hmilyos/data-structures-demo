package com.hmily.datastructuresdemo.queue.basics;

public class Test {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
