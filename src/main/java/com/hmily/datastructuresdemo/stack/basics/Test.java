package com.hmily.datastructuresdemo.stack.basics;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        ArrayStack<Integer> stack = new ArrayStack<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
