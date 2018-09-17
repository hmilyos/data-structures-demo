package com.hmily.datastructuresdemo.linkedListAndRecursion.removeLinkedListElements;

/**
 *   Leetcode 203. Remove Linked List Elements
 *   https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 *
 *   采用 递归方式
 */
public class Solution4 {
    public ListNode removeElements(ListNode head, int val) {
        // 第 1 步
        if (head == null){
            return null;
        }
        // 第 2 步
        head.next = removeElements(head.next, val);
        // 第 3 步
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode res = (new Solution4()).removeElements(head, 2);
        System.out.println(res);
//        整个流程：
//              传入 1 -> 2 -> 3 -> null
//                运行第 1 步： 1 不为空，继续
//                运行第 2 步， 进入一个新的 removeElements 传入的链表变为 2 -> 3 -> null
//                      运行第 1 步：2 不为空，继续
//                        运行第 2 步， 又进入一个新的 removeElements 传入的链表变为 3 -> null
//                                运行第 1 步：3 不为空，继续
//                                运行第 2 步， 又进入一个新的 removeElements 传入的链表变为  null
//                                        运行第 1 步： null 为空，直接 return null， 此时 3 的 next 也就是 null 了
//                                运行第 3 步：判断 val 3 是不是要删除的元素， 不是就 把 3 -> null return回去
//                                                这时候， val 2 的 next 为 3 -> null  即： 2 -> 3 -> null
//                        运行第 3 步： 判断 val 2 是不是要删除的元素， 是就 把 2 的 next  3 -> null  return回去
//                                        此时 val 1 的 next 就变成 3 -> null  了  即： 1 -> 3 -> null
//                运行第 3 步 判断 val 1  是不是要删除的元素， 不是就把 1 -> 3 -> null  return 回去
    }
}
