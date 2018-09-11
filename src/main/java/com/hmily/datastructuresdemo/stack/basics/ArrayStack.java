package com.hmily.datastructuresdemo.stack.basics;

import com.hmily.datastructuresdemo.array.dynamic.DynamicArray;

public class ArrayStack<E> implements Stack<E> {

    private DynamicArray<E> array;

    public ArrayStack() {
        array = new DynamicArray<>();
    }

    public ArrayStack(int capacity) {
        array = new DynamicArray<>(capacity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
