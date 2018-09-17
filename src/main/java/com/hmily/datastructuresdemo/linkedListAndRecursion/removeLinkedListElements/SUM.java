package com.hmily.datastructuresdemo.linkedListAndRecursion.removeLinkedListElements;

public class SUM {

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    // 计算 arr[left...n) 之间的和
    public static int sum(int[] arr, int left){
        if (left == arr.length){
//            求解最近的问题
            return 0;
        }
//        把问题转为更小的 问题
        return arr[left] + sum(arr, left + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(arr));
    }
}
