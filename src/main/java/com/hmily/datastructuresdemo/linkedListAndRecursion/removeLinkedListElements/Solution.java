package com.hmily.datastructuresdemo.linkedListAndRecursion.removeLinkedListElements;

/**
 *   Leetcode 203. Remove Linked List Elements
 *   https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 加入第一个节点就是要删除了元素
        while (head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        // 加入整个链表都是要删除的，到这里就被删完了
        if (head == null) {
            return  null;
        }
        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val){
                ListNode delNode = pre.next;
                pre.next = delNode.next;
                delNode.next = null;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }
}
