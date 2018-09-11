package com.hmily.datastructuresdemo.array.dynamic;


public class DynamicArrayTest {

	public static void main(String[] args) {
//		test1();
        test2();
	}

    public static void test2(){
        DynamicArray<Integer> arr = new DynamicArray<>();
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        for(int i = 0 ; i < 4 ; i ++){
            arr.removeFirst();
            System.out.println(arr);
        }
    }

	public static void  test1(){
        DynamicArray<Integer> arr = new DynamicArray<>();
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println(arr);
//        这时候应该会扩容
        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);
//        缩容
        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
