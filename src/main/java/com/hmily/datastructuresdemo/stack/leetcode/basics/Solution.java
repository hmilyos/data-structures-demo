package com.hmily.datastructuresdemo.stack.leetcode.basics;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 利用栈的 先进后出
            // 判断当前是不是 前半括号，是就 push 到栈里面
            if('(' == c || '[' == c  || '{' == c){
                stack.push(c);
            } else {
                // 根据匹配原则 如果当前是后半括号，
                // 那么对应的栈顶如果不是是其前半括号，那就不正确
                if (stack.isEmpty()){
//                    当前为后半括号，而栈为空，肯定错
                    return false;
                }
                char topChar = stack.pop();
                if(')' == c && '(' != topChar){
//                    当前为 ) 而 栈顶不是 ( 肯定不对
                    return false;
                }
                if(']' == c && '[' != topChar){
//                    当前为 ] 而 栈顶不是 [ 肯定不对
                    return false;
                }
                if('}' == c && '{' != topChar){
//                    当前为 } 而 栈顶不是 { 肯定不对
                    return false;
                }
            }
        }
//        最后，输入遍历完成，而栈里面应该是空的，这才是正确的
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("()[]{}: " + (new Solution()).isValid("()[]{}"));
        System.out.println("[])({}: " + (new Solution()).isValid("[])({}"));
    }
}
