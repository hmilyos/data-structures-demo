package com.hmily.datastructuresdemo.linkedListAndRecursion.removeLinkedListElements;

/**
 *   Leetcode 203. Remove Linked List Elements
 *   https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 *
 *   采用虚拟头节点方式
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        while (pre.next != null) {
            if (pre.next.val == val){
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }
}
