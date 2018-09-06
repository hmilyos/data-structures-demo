package com.hmily.datastructuresdemo.array.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicsArray {
    public static void main(String[] args) {
        // java 数组的使用
        log.info("---声明长度 但 不赋值---");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            log.info("下标{}为: {}", i, arr[i]);
        }
        log.info("---声明时赋值---");
        int[] arr2 = new int[]{99, 88, 77};
        for (int i = 0; i < arr2.length; i++) {
            log.info("下标{}为: {}", i, arr2[i]);
        }
        arr2[0] = 95;
        for (int i : arr2) {
            log.info("元素为: {}", i);
        }
    }
}
