package com.hmily.datastructuresdemo.bst;

public class Test {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num: nums){
            bst.add(num);
        }

        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
        bst.preOrder();
        System.out.println();

        System.out.println(bst);

//                5
//                --3
//                ----2
//                ------null
//                ------null
//                ----4
//                ------null
//                ------null
//                --6
//                ----null
//                ----8
//                ------null
//                ------null
    }

}
