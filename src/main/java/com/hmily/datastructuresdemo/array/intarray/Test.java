package com.hmily.datastructuresdemo.array.intarray;

public class Test {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test2(){
        IntArray arr = new IntArray(20);
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println("--addLast end");
        System.out.println(arr);


        arr.remove(2);
        System.out.println("--remove index = 2  end");
        System.out.println(arr);

        boolean contains = arr.contains(4);
        arr.removeElement(4);
        System.out.println("--removeElement e = 4  end  之前是否存在 元素 4 ？：" + contains);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println("--removeFirst end");
        System.out.println(arr);

        arr.removeLast();
        System.out.println("--removeLast end");
        System.out.println(arr);
    }


    public static void test1(){
        IntArray arr = new IntArray(20);
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println("--addLast end");
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println("--add end");
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println("--addFirst end");
        System.out.println(arr);
    }

}
